import java.util.Scanner;

/**
 *
 * @author angel
 */

public class Circunferencia implements Figura {

    private final double pi = 3.1416;
    private String color;
    private float radio;
    Scanner lee;

    public Circunferencia() {
        System.out.println("Se crea objeto de Circulo");
    }

    public Circunferencia(float radio) {
        System.out.println("Se crea objeto de Circulo");
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public void leerDatos() {
        lee = new Scanner(System.in);
        System.out.print("Ingresa el color: ");
        this.color = lee.next();
        System.out.print("Ingresa el radio: ");
        this.radio = lee.nextFloat();
    }

    // el método es sobrescrito porque el código es diferente
    @Override
    public float calcularArea() {
        return ((float) pi * (this.radio) * (this.radio));
    }

    public float calcularPerimetro() {
        return (float) pi * (2 * this.radio);
    }

    @Override
    public String toString() {
        return "Círculo \nRadio: " + this.radio;
    }
}
