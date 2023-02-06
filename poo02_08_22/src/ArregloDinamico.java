/**
 * @author angel
 */

public class ArregloDinamico {

    public static void main(String[] args) {

        float[] datos;
        byte cantidad = 5;

        System.out.println("Programa de arreglo din\u00e1mico " +
                "de datos reales");
        //System.out.println("Ingresa la cantidad de elementos: ");
        //lectura cantidad con scanner u otra instrucción.
        datos = new float[cantidad];

        for (byte conde = 0; conde <= 2; conde++) {
            datos[conde] = (float) Math.random() * 18;  // float casting de double
        }

        for (byte conde = 0; conde <= 2; conde++) {
            System.out.println("Elemento " + conde + ": "
                    + datos[conde]);
        }
    }
}
