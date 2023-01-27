
/**
 *
 * @author angel
 */

public class Pokemon {

    /*
     * Atributos para el Pokemon
     */

    String nombre;
    String tipo;
    byte nivel;
    int ataque;
    int defensa;

    public Pokemon() {
        System.out.println("Se crea un objeto pokemon.");
    }

    public Pokemon(String nombre, String tipo, byte nivel, int ataque, int defensa) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public void mostrarDatos() {
        System.out.println("\n*** Nuevo Pokemon ***\n" +
                           "\nNombre: " + this.nombre +
                           "\nElemento: " + this.tipo +
                           "\nNivel: " + this.nivel +
                           "\nAtaque: " + this.ataque +
                           "\nDefensa: " + this.defensa + "\n");
    }

    public static void main(String[] args) {

        Pokemon pok1 = new Pokemon();
        Pokemon pok2 = new Pokemon("Charizard", "Dragon", (byte) 21, 110, 85);

        pok1.nombre = "Pikachu";
        pok1.tipo = "Electricidad";
        pok1.nivel = 22;
        pok1.ataque = 120;
        pok1.defensa = 90;

        pok1.mostrarDatos();
        pok2.mostrarDatos();
    }
}
