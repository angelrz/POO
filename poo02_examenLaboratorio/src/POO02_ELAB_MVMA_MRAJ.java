import java.util.Scanner;

/**
 *
 * @author angel
 * @author marco
 */

public class POO02_ELAB_MVMA_MRAJ {

    public int celsius;
    public float fahrenheit;

    public void leerDatos() {
        Scanner lee = new Scanner(System.in);
        System.out.print("Ingresa los grados Celsius a convertir: ");
        this.celsius = lee.nextInt();
        lee.close();
    }

    public void convertirTemperatura() {
        this.fahrenheit = (float)(32 + 1.8 * this.celsius);
    }

    public void mostrarResultado() {
        System.out.println(this.celsius + "°C corresponde a " + this.fahrenheit + " F");
    }

    public static void main(String[] args) {

        POO02_ELAB_MVMA_MRAJ c1 = new POO02_ELAB_MVMA_MRAJ();

        c1.leerDatos();
        c1.convertirTemperatura();
        c1.mostrarResultado();
    }
}
