import java.util.Scanner;

/**
 * @author angel
 */

public class NavidadPrueba {

    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        Navidad n1 = new Navidad("navidad.txt");
        Thread h1 = new Thread(n1);
        byte opcion;
        char repite;

        do {
            System.out.print("""
                    1.Carga narraci\u00f3n
                    2.Pausa narraci\u00f3n
                    3.Continua narraci\u00f3n
                    4.Detiene narraci\u00f3n
                    Elige opci\u00f3n:""");
            opcion = lee.nextByte();

            switch (opcion) {
                case 1 -> {
                    System.out.println("\nCarga narración de archivo");
                    if (!h1.isAlive()) {
                        h1.start();
                    }
                }
                case 2 -> {
                    System.out.println("\nPausa narración de archivo");
                    n1.suspenderHilo();
                }
                case 3 -> {
                    System.out.println("\nContinua narración de archivo");
                    n1.continuarHilo();
                }
                case 4 -> {
                    System.out.println("\nDetiene narración de archivo");
                    h1.interrupt();
                }
                default -> System.out.println("\nOpción fuera del menú");
            }
            System.out.println("Deseas realizar otra operación (s/n): ");
            repite = lee.next().charAt(0);
        } while (repite == 's' || repite == 'S');

        // esperar a que el hilo termine
        try {
            h1.join();
        } catch (InterruptedException e) {
            System.out.println("Hilo principal interrumpido.");
        }
        System.out.println("Hilo principal finalizado.");
        lee.close();
    }
}
