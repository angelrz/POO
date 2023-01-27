package paqueteLectura;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author angel
 */

public class LeeFloat {

    private float numero;

    public float leerNumFloat() {
        InputStreamReader n = new InputStreamReader(System.in);
        BufferedReader num = new BufferedReader(n);
        boolean repite = true;

        while (repite) {
            try {
                numero = Float.parseFloat(num.readLine());
                repite = false;
                //break;
            } catch (IOException lee) {
                System.out.println("\nFalla: No se pudo leer del teclado "
                                   + lee.getMessage());
            } catch (NumberFormatException convierte) {
                System.out.print("\nFalla: No se pudo convertir, "
                                 + convierte.getMessage()
                                 + "\nVuelve a ingresar el dato:  ");
            }
        }
        return this.numero;
    }
}
