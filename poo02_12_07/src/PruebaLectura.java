import paqueteLectura.Lectura;

/**
 *
 * @author angel
 */

public class PruebaLectura {

    public static void main(String[] args) {

        Lectura l1 = new Lectura();

        System.out.print("Ingresa un double: ");
        double num1 = l1.nextDouble();
        System.out.println(num1);

        System.out.print("Ingresa un entero: ");
        int num2 = l1.nextInt();
        System.out.println(num2);

        System.out.print("Ingresa un mensaje: ");
        String m = l1.nextLine();
        System.out.println(m);

        l1.cerrarFlujo();
    }
}
