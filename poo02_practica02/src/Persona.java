import java.util.Scanner;

/**
 *
 * @author angel
 */

public class Persona {

    int edad;

    public Persona() {
        System.out.println("Se crea objeto de Persona");
    }

    public void leerDatos() {
        Scanner lee = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        this.edad = lee.nextInt();
        lee.close();
    }

    public void validarEdad() {
        System.out.println(this.edad >= 18
                ? "Eres mayor de edad."
                : "Eres menor de edad.");
    }

    public static void main(String[] args) {

        Persona p1 = new Persona();

        p1.leerDatos();
        p1.validarEdad();
        //lee.close();
    }
}
