import java.util.Scanner;

/**
 *
 * @author angel
 */

public abstract class Poligono implements Figura {

    private String color;
    public byte lados;
    Scanner lee;

    public Poligono() {
        System.out.println("Se crea objeto de Poligono");
    }

    public Poligono(String color) {
        System.out.println("Se crea objeto de Poligono");
        this.color = color;
    }

    public Poligono(String color, byte lados) {
        System.out.println("Se crea objeto de Poligono");
        this.color = color;
        this.lados = lados;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void leerDatos() {
        lee = new Scanner(System.in);
        System.out.print("\nIngresa el color de la figura: ");
        this.color = lee.next();
        System.out.print("Ingresa el numero de lados: ");
        this.lados = lee.nextByte();
    }

    // metodo abstracto para calcular área que es heredado por
    // las clases hijas rectángulo, rombo, círculo y triángulo
    @Override
    public abstract float calcularArea();

    @Override
    public abstract float calcularPerimetro();

    @Override
    public String toString() {
        return "\nPolígono: ";
    }
}
