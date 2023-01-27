import java.util.Scanner;

/**
 *
 * @author angel
 */

public class Rombo extends Poligono {

    private float base, altura;
    Scanner lee;

    public Rombo() {
        System.out.println("Se crea un objeto de la clase Rombo.");
        this.lados = 4;
    }

    public Rombo(String color, float base, float altura) {
        super(color);
        System.out.println("Se crea objeto de Rombo");
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    // el metodo es sobrescrito llamando al de la clase padre
    // y agregando contenido propio
    @Override
    public void leerDatos() {
        lee = new Scanner(System.in);
        super.leerDatos();
        System.out.print("Ingresa la base: ");
        this.base = lee.nextFloat();
        System.out.print("Ingresa la altura: ");
        this.altura = lee.nextFloat();
    }

    // el metodo es sobrescrito porque el código es diferente
    @Override
    public float calcularArea() {
        return this.base * this.altura;
    }

    @Override
    public float calcularPerimetro() {
        return this.base * this.altura;
    }

    @Override
    public String toString() {
        return super.toString() + "Romobo \nBase: " + this.base
               + "\nAltura: " + this.altura;
    }
}
