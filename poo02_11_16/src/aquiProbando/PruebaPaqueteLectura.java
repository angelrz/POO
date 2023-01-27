package aquiProbando;
// importar el paquete y todas sus clases (LeeDoble, Lee Int, etc.).
import paqueteLectura.*;

/**
 *
 * @author angel
 */

public class PruebaPaqueteLectura {

    public static void main(String[] args) {

        // crear objeto de la clase LeeDoble contenida en el paquete
        LeeDoble doble = new LeeDoble();

        // crear objeto de la clase LeeInt contenida en el paquete
        LeeInt entero = new LeeInt();

        // crear objeto de la clase LeeFloat contenida en el paquete
        LeeFloat flotante = new LeeFloat();

        // crear objeto de la clase LeeLong contenida en el paquete
        LeeLong enteroLargo = new LeeLong();

        System.out.print("\nIngresa un número real: ");
        double numeroDoble = doble.leerNumDouble();
        System.out.println("\nEl número ingresado es: " + numeroDoble);

        System.out.print("\nIngresa un número entero: ");
        int numeroInt = entero.leerNumInt();
        System.out.println("\nEl número ingresado es: " + numeroInt);

        System.out.print("\nIngresa un número real: ");
        float numeroFlotante = flotante.leerNumFloat();
        System.out.println("\nEl número ingresado es: " + numeroFlotante);

        System.out.print("\nIngresa un número grande: ");
        float numeroEntLargo = enteroLargo.leerNumLong();
        System.out.println("\nEl número ingresado es: " + numeroEntLargo);
    }
}
