/**
 *
 * @author angel
 */

public class AlumnoConstructor31 {

    /* atributos */
    String nombre;
    int edad;
    float peso;

    /* métodos */
    // el método constructor imprime mensaje cada vez que es creado un objeto
    // además se inicializa el valor de los atributos para todos los objetos creados
    public AlumnoConstructor31() {
        System.out.println("Se crea objeto de AlumnoConstructor31");
        nombre= "Hugo";
        edad= 8;
        peso= 32.5f;
    }

    public void apruebaProgra() {
        System.out.println(this.nombre + " aprueba progra");
    }

    public void mostrarDatos() {
		/*
		System.out.println("Nombre: " + a1.nombre +
				"\nEdad: " + a1.edad +
				"\nPeso: " + a1.peso);
		*/

        //el operador this toma el nombre del objeto que lo mande llamar
        System.out.println("Nombre: " + this.nombre + "\nEdad: " + this.edad +
                           "\nPeso: " + this.peso);
    }

    public static void main(String[] args) {

        // nombreClase nombreObjeto = new métodoConstructor();
        // Se emplea el constructor modificado para inicializar todos los objetos
        AlumnoConstructor31 a1 = new AlumnoConstructor31();
        AlumnoConstructor31 a2 = new AlumnoConstructor31();

        //mostrarDatos();
        a1.mostrarDatos();
        a1.apruebaProgra();

        a1.nombre= "Pepito Godinez";
        a1.mostrarDatos();
        a1.apruebaProgra();

        a2.mostrarDatos();
        a2.apruebaProgra();
    }
}
