/**
 *
 * @author angel
 */

public class AlumnoConstructor1 {

    /* atributos */
    String nombre;
    int edad;
    float peso;

    /* métodos */
    public void apruebaProgra() {
        System.out.println("El alumno aprueba progra");
    }

    public static void main(String[] args) {

        //nombreClase nombreObjeto = new metodoConstructor();
        //Se emplea el constructor por default
        AlumnoConstructor1 a1 = new AlumnoConstructor1();

        a1.nombre = "Pepito Godinez";
        a1.edad = 27;
        a1.peso = 92.5f;

        System.out.println("Programa que muestra datos de alumno\n");
        System.out.println("Nombre: " + a1.nombre
                           + "\nEdad: " + a1.edad
                           + "\nPeso: " + a1.peso);
        a1.apruebaProgra();
    }
}
