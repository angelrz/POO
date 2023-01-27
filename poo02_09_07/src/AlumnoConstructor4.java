
/**
 *
 * @author angel
 */
public class AlumnoConstructor4 {

    /* atributos */
    String nombre;
    int edad;
    float peso;

    /* métodos */
    // el método constructor con forma 3 imprime mensaje cada vez que es creado un objeto
    public AlumnoConstructor4() {
        System.out.println("Se crea objeto de AlumnoConstructor4.");
        nombre = "Hugo";
        edad = 8;
        peso = 32.5f;
    }

    // el método constructor forma 4 imprime mensaje cada vez que es creado un objeto
    public AlumnoConstructor4(String nombre, int edad, float peso) {    // métodos  constructores = funciones en C, en Java pueden llamarse igual pero los argumentos (parámetros deben ser diferentes)
        System.out.println("Se crea objeto de AlumnoConstructor4");
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
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

        // el operador this toma el nombre del objeto que lo mande llamar
        System.out.println("Nombre: " + this.nombre + "\nEdad: " + this.edad + "\nPeso: " + this.peso);
    }

    public static void main(String[] args) {

        //nombreClase nombreObjeto = new métodoConstructor();
        //Se emplea el constructor modificado para inicializar el objetos
        // con los valores pasados como argumentos
        //AlumnoConstructor4 a0 = new AlumnoConstructor4("Hugo", 9, 32.4);
        AlumnoConstructor4 a1 = new AlumnoConstructor4("Hugo", 9, 32.4f);
        AlumnoConstructor4 a2 = new AlumnoConstructor4("Paco", 8, (float) 30.9);
        AlumnoConstructor4 a3 = new AlumnoConstructor4("Luis", 7, (float) 29.6);    //inicializa los valores para los atributos para cada objeto creado, no so constantes pueden reasignarse
        AlumnoConstructor4 a4 = new AlumnoConstructor4();   /* da valores iniciales a los atributos que son
                                                               creados por el objeto , los inicializa*/

        a1.mostrarDatos();
        a1.apruebaProgra();

        a1.nombre = "Pepito Godinez";
        a1.mostrarDatos();
        a1.apruebaProgra();

        a2.mostrarDatos();
        a2.apruebaProgra();

        a3.mostrarDatos();
        a3.apruebaProgra();

        a4.mostrarDatos();
    }
}
