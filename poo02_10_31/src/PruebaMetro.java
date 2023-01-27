
/**
 *
 * @author angel
 */

public class PruebaMetro {

    public static void main(String[] args) {

        Metro m1 = new Metro();
        // Metro m2 = new Metro();

        // asignación directa no se puede por ser privado
        // m1.fuenteMotriz= "ratas";
        // aaSignación por método set
        m1.setFuenteMotriz("Gasolina");
        // impresión con get
        System.out.println("\nFuente motriz: " + m1.getFuenteMotriz());

        // Lectura usando su método
        // m1.leerDatos();
        // Impresión con su método
        m1.mostrarDatos();
        System.out.println();

        // Creación de objeto empleando constructor que recibe argumentos
        Metro m2 = new Metro("Electricidad", "Café", "Vias", "Tacubaya",
                90f, 120f, 24, "Rosa", 9);
        // impresión usando su método
        m2.mostrarDatos();
    }
}
