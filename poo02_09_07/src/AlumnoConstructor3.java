/**
 *
 * @author angel
 */

public class AlumnoConstructor3 {

    /*atributos*/
    String nombre;
    int edad;
    float peso;

    /* métodos */
    // el método constructor imprime mensaje cada vez que es creado un objeto
    // además se inicializa el valor de los atributos para todos los objetos creados
    public AlumnoConstructor3() {
        System.out.println("Se crea objeto de AlumnoConstructor3");
        nombre = "Hugo";
        edad = 8;
        peso = 32.5f;
    }

    public void apruebaProgra() {
        System.out.println("El alumno aprueba progra");
    }

    public static void main(String[] args) {

        // nombreClase nombreObjeto = new métodoConstructor();
        // Se emplea el constructor modificado para inicializar todos los objetos
        AlumnoConstructor3 a1 = new AlumnoConstructor3();
        AlumnoConstructor3 a2 = new AlumnoConstructor3();

        /*
         * ya no hago asignación uno por uno
         * a1.nombre= "Pepito Godinez";
         * a1.edad= 27;
         * a1.peso= 92.5f;
         */
        System.out.println("Programa que muestra datos de alumno\n");
        System.out.println("Nombre: " + a1.nombre
                           + "\nEdad: " + a1.edad
                           + "\nPeso: " + a1.peso);

        a1.apruebaProgra();

        a1.nombre = "Pepito Godinez";
        //imprimir de nuevo los valores para observar la reasignación
        System.out.println("Nombre: " + a1.nombre
                           + "\nEdad: " + a1.edad
                           + "\nPeso: " + a1.peso);

        System.out.println("Nombre: " + a2.nombre
                           + "\nEdad: " + a2.edad
                           + "\nPeso: " + a2.peso);
        a2.apruebaProgra();
    }
}
