
/**
 *
 * @author angel
 */
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        byte opcion;
        boolean repetir = true;
        Scanner lee;

        while (repetir) {

            System.out.println("""
                               *** Implementaci\u00f3n de hilos ***
                               Men\u00fa:
                               1. Barra de Progreso
                               2. Restaurante con arreglo
                               3. Restaurante sin mezclar
                               4. C\u00e1lculo pares del 2 al 1000
                               5. Carrera de caballos
                               6. Actividades realizadas en navidad
                               7. Salir""");
            lee = new Scanner(System.in);

            System.out.print("Seleccionar: ");
            opcion = lee.nextByte();

            switch (opcion) {
                case 1:

                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    ParesContador m1 = new ParesContador();
                    ParesModulo m2 = new ParesModulo();

                    m1.start();
                    m2.start();
                    break;
                case 7:
                    System.out.println("Has seleccionado la opci\u00f3n salir");
                    repetir = false;
                    break;
            }
        }
    }
}
