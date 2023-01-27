import java.util.Scanner;

/**
 *
 * @author angel
 */

public class Persona {

    byte edad;  // podría ser short 32mil
    Scanner lee;

    public Persona() {
        System.out.println("Se crea objeto de Persona.");
        lee = new Scanner(System.in);
    }

    public void leerDatos() {
        System.out.print("Ingresa tu edad: ");
        this.edad = lee.nextByte();
    }

    public void validarEdad() {
        if (edad > 0 && edad <= 96) {
            String decision = (this.edad >= 18
                    ? "Eres mayor de edad."
                    : "Eres menor de edad.");
            System.out.println(decision);
        } else {
            System.out.println("Error, edad fuera de rango.");
        }
    }

    public void cerrarFlujo() {
        lee.close();
    }

    public static void main(String[] args) {

        Persona p1 = new Persona();
        System.out.println("Programa que lee la edad del usuario y "
                           + "determinimar si es mayor o no");
        p1.leerDatos();
        p1.validarEdad();
        p1.cerrarFlujo();
        //lee.close();
    }
}
