import java.util.Scanner;
//import java.util.*

/**
 *
 * @author angel
 */

public class Menu {

    // variables
    int numUno, numDos, resul;

    // lista de métodos
    public int suma() {
        resul = this.numUno + this.numDos;
        return resul;
    }

    public int resta() {
        resul = this.numUno - this.numDos;
        return resul;
    }

    public int multi() {
        resul = this.numUno * this.numDos;
        return resul;
    }

    public float div() {
        //cast para convertir a float
        //resul = (float)(n1/n2);
        resul = this.numUno / this.numDos;
        return resul;
    }

    public static void main(String[] args) {

        /* lista de atributos
         * los atributos se inicilizan por default
         */

        //nombreClase nombreObjeto = new metodoContructorClase();
        Menu a = new Menu();
        Scanner lee = new Scanner(System.in);
        byte opcion;
        boolean bandera = true;

        while(bandera) {

            System.out.println("""
                           \nThis program implements a menu whit switch
                           1. Suma
                           2. Resta
                           3. Multiplicacion
                           4. Division
                           Option:""");
            opcion = lee.nextByte();

            System.out.print("Ingresa número 1: ");
            a.numUno = lee.nextInt();
            System.out.print("Ingresa número 2: ");
            a.numDos = lee.nextInt();

            int r;
            switch (opcion) {
                case 1 -> {
                    System.out.println("\n*** Opcion suma ***\n");
                    r = a.suma();
                    System.out.println(a.numUno + " + " + a.numDos + " = " + r);
                }
                case 2 -> {
                    System.out.println("\n*** Opcion resta***\n");
                    r = a.resta();
                    System.out.println(a.numUno + " - " + a.numDos + " = " + r);
                }
                case 3 -> {
                    System.out.println("\n*** Opcion multiplicacion ***\n");
                    r = a.multi();
                    System.out.println(a.numUno + " * " + a.numDos + " = " + r);
                }
                case 4 -> {
                    System.out.println("\n*** Opcion division ***\n");
                    if(a.numDos == 0){
                        System.out.println("El numero no es divisible.");
                    } else {
                        float re = a.div();
                        System.out.println(a.numUno + " / " + a.numDos + " = " +re);
                    }
                }
                default -> System.out.println("Opcion invalida\n");
            }
            System.out.print("¿Deseas repetir el programa? (true/false): ");
            bandera = lee.nextBoolean();
        }
        lee.close();
    }
}
