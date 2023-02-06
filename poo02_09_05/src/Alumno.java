/**
 * @author angel
 */

public class Alumno {

    String nombre;
    int edad;
    float peso;

    //lista métodos
    public void apruebaProgra() {   //Método apruebaProga
        System.out.println("El alumno aprueba programaci\u00f3n.");
    }

    public static void main(String[] args) {

        //nombreClase nombreObjeto = new metodoConstructorclase();
        Alumno Pepito = new Alumno();
        Alumno a2 = new Alumno();

        //asignación de valores a los atributos
        Pepito.nombre = "Pepito Godinez";   //Atributo
        Pepito.edad = 14;
        Pepito.peso = 52.1f;

        //acceso a los atributos para imprimir
        System.out.print(Pepito.nombre + ", " +
                Pepito.edad + ", " + Pepito.peso + "\n");

        //llamada al método
        Pepito.apruebaProgra();

        a2.nombre = "Juan Enrique";
        a2.edad = 10;
        a2.peso = 43.7f;

        System.out.println(a2.nombre + ", " +
                a2.edad + ", " + a2.peso);
        a2.apruebaProgra();
    }
}
