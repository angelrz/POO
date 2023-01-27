
/**
 *
 * @author angel

 */
public class ExcepcionesV2 {

    public static void main(String[] args) {

        int valor = 5, cero = 0, numero = 0;
        int[] arreglo = new int[]{1, 2, 3};
        String cad = " 123 ";

        try {
            valor = valor / cero;	// Division entre cero
        } catch (ArithmeticException e) {
            System.out.println("Dvision por cero: " + e);
        }

        try {
            arreglo[4] = 5;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Error en arreglo: " + ex);
        }

        try {
            numero = Integer.parseInt(cad);
            System.out.println(numero);
        } catch (NumberFormatException en) {
            System.out.println("Falla al convertir cadena: " + en);
        } finally {
            assert System.out != null;
            System.out.println("\nSe manejaron varias excepciones.");
        }

    }
}
