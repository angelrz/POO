
/**
 *
 * @author angel
 */

public class Excepciones {

    public static void main(String[] args) {

        int valor = 5, cero = 0, numero;
        int[] arreglo = new int[]{1, 2, 3};
        String cad = " 123 ";
        //String s= null;

        try {
            valor = valor / cero;	// Division entre cero
            arreglo[4] = 5;		// Acceso a una posición no disponible
            numero = Integer.parseInt(cad);	// Convierte cadena a entero
            System.out.println(numero);
            //s.equals("casa");	// Compara cadena vacia con casa
        } catch (ArithmeticException e) {
            System.out.println("Dvision por cero: " + e);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Error en arreglo: " + ex);
        } catch (NumberFormatException en) {
            System.out.println("Falla al convertir cadena: " + en);
        } catch (NullPointerException nu) {
            System.out.println("Falla al comparar cadena nula: " + nu);
        } finally {
            System.out.println("\nSe manejaron varias excepciones.");
        }
    }
}
