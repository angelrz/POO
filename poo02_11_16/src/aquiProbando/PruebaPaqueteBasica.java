package aquiProbando;
// importar el paquete su clase Saluda
import paqueteBasica.Saluda;
// importar el paquete y su clase OperacionesBasicas
import paqueteBasica.OperacionesBasicas;

/**
 *
 * @author angel
 */

public class PruebaPaqueteBasica {

    public static void main(String[] args) {

        // crear objeto de la clase Saluda contenida en el paquete
        Saluda s1 = new Saluda();

        // crear objeto de la clase OperacionesBasicas contenida en el paquete
        OperacionesBasicas o1 = new OperacionesBasicas();

        s1.mostrarSaludo("Juanito");

        double resultado = o1.suma(1, 2);
        System.out.println(o1.getNumUno() + " + "
                           + o1.getNumDos() + " = " + resultado);
    }
}
