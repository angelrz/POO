/**
 *
 * @author angel
 */

public class AlumnoConstructor2 {

    /* atributos */
    String nombre;
    int edad;
    float peso;

    /* métodos */
    // El método constructor imprime mensaje cada vez que es creado un objeto
    public AlumnoConstructor2() {
        System.out.println("Se crea objeto de AlumnoConstructor2");
    }

    public void apruebaProgra() {
        System.out.println("El alumno aprueba progra");
    }

    public static void main(String[] args) {

        //nombreClase nombreObjeto = new métodoConstructor();
        //Se emplea el constructor que se modificó para imprimir
        AlumnoConstructor2 a1 = new AlumnoConstructor2();	//crea objeto1
        AlumnoConstructor2 a2 = new AlumnoConstructor2();

        a1.nombre = "Pepito Godinez";
        a1.edad = 27;
        a1.peso = 92.5f;

        System.out.println("Programa que muestra datos de Alumno\n");
        System.out.println("Nombre: " + a1.nombre
                           + "\nEdad: " + a1.edad
                           + "\nPeso: " + a1.peso + "\n");

        a2.nombre = "Pepito gemelo";
        System.out.println("Nombre: " + a2.nombre
                           + "\nEdad: " + a2.edad
                           + "\nPeso: " + a2.peso);
        a1.apruebaProgra();
    }
}
