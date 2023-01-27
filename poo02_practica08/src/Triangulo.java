import java.util.Scanner;

/**
 * @author angel
 */

public class Triangulo extends Poligono {

    private float base, altura, l1, l2, l3;
    Scanner lee;

    public Triangulo() {
        System.out.println("Se crea objeto de Triangulo");
        this.lados = 3;
    }

    public Triangulo(String color, float base, float altura) {
        super(color);
        this.lados = 3;
        System.out.println("Se crea objeto de Triangulo.");
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
        System.out.print("Ingresa longitud lado 1: ");
        this.l1 = lee.nextFloat();
        System.out.print("Ingresa longitud lado 2: ");
        this.l2 = lee.nextFloat();
        System.out.print("Ingresa longitud lado 3: ");
        this.l3 = lee.nextFloat();
    }

    // el metodo es sobrescrito porque el código es diferente
    @Override
    public float calcularArea() {
        return (this.base * this.altura) / 2;
    }

    @Override
    public float calcularPerimetro() {
        return this.l1 + this.l2 + this.l3;
    }

    @Override
    public String toString() {
        return super.toString() + "Triangulo \nBase: " + this.base
               + "\nAltura: " + this.altura
               + "\nLados: " + this.lados;
    }
}
