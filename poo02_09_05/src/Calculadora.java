import java.util.Scanner;
//import java.util.*

/**
 * @author angel
 */

public class Calculadora {

    /*
     * lista de atributos
     * los atributos se inicializan por default
     */
    int numUno;
    int numDos;

    // lista de métodos
    public int suma() {
        int resul;
        resul = numUno + numDos;
        return resul;
    }

    public int resta() {
        int resul;
        resul = numUno - numDos;
        return resul;
    }

    public int multi() {
        int resul;
        resul = numUno * numDos;
        return resul;
    }

    float div() {
        float resul;
        // cast para convertir a float
        // resul = (float)(n1/n2);
        resul = (float) numUno / numDos;
        return resul;
    }

    public static void main(String[] args) {

        try (
            // nombreClase nombreObjeto = new metodoContructorClase();
            Scanner lee = new Scanner(System.in)) {
            Calculadora c1 = new Calculadora();

            c1.numUno = 5;
            c1.numDos = 2;

            System.out.print("Ingresa el valor del primer numero: ");
            c1.numUno = lee.nextInt();

            System.out.print("Ingresa el valor del segundo numero: ");
            c1.numDos = lee.nextInt();

            // int s = suma();
            int s = c1.suma();
            System.out.println(c1.numUno + " + " + c1.numDos + " = " + s);
            // System.out.println(c1.numUno + " + " + c1.numDos + " = " + c1.suma());

            int r = c1.resta();
            System.out.println(c1.numUno + " - " + c1.numDos + " = " + r);

            int m = c1.multi();
            System.out.println(c1.numUno + " x " + c1.numDos + " = " + m);

            float d = c1.div();
            System.out.println(c1.numUno + " / " + c1.numDos + " = " + d);
        }
    }
}
