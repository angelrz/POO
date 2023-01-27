
/**
 *
 * @author angel
 */
public class HolaMundoPOO {

    // lista de atributos
    String mensaje;

    // lista de objetos
    public HolaMundoPOO() {
        System.out.println("Se crea el objeto HolaMundoPOO.");
        // el operador this toma el nombredel objeto que lo mande a llamar
        this.mensaje = "Se iniciliza el atributo";  // valor del atributo inicializado (puede modificarse)
    }

    // Igual podemos utilizar la forma 4 de constructor
    public HolaMundoPOO(String mensaje) {
        System.out.println("Se crea el objeto HolaMundoPOO que recibe objeto.");
        this.mensaje = mensaje;
    }

    public void mostrarMensajes() {
        // el operador this toma el nombredel objeto que lo mande a llamar
        System.out.println("\nEl mensaje es: \n" + this.mensaje);
    }

    public static void main(String[] args) {

        // Se crea el objeto h1 de la clase HolaMundoPOO
        // nombreClase nombreObjeto = new métodoConstructorClase();
        HolaMundoPOO h1 = new HolaMundoPOO();
        HolaMundoPOO h2 = new HolaMundoPOO("Hola amigos de yutu");

        // llama al método
        h1.mostrarMensajes();

        // el valor del atributo es reasingado
        h1.mensaje = "Clase de modelos";

        // llamada al método
        h1.mostrarMensajes();

        // llamada al método
        h2.mostrarMensajes();
    }
}
