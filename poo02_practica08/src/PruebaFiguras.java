import java.util.Scanner;

/**
 *
 * @author angel
 */

public class PruebaFiguras {

    public static void main(String[] args) {

        Scanner lee;
        byte opcion;
        boolean repite = true;

        while (repite) {
            System.out.print("*** Programa de Figuras ***\n"
                             + "\n1. Rect\u00e1ngulo"
                             + "\n2. Tri\u00e1ngulo"
                             + "\n3. Rombo"
                             + "\n4. C\u00edrculo"
                             + "\n5. Salir"
                             + "\n\nIngresa la opci\u00f3n: ");
            lee = new Scanner(System.in);
            opcion = lee.nextByte();

            switch (opcion) {
                case 1 -> {
                    System.out.println("\nRect\u00e1ngulo");
                    Rectangulo r1 = new Rectangulo();
                    r1.leerDatos();
                    System.out.print(r1.toString());
                    System.out.print("\nEl \u00e1rea del rect\u00e1ngulo de color " + r1.getColor()
                                     + " con base " + r1.getBase()
                                     + " y altura " + r1.getAltura() + " es " + r1.calcularArea()
                                     + "\nAdem\u00e1s, su perimetro es " + r1.calcularPerimetro()
                                     + ". Y tiene " + r1.lados + " lados.");
                    System.out.println();
                    System.out.println();
                }
                case 2 -> {
                    System.out.println("\nTri\u00e1ngulo");
                    Triangulo t1 = new Triangulo();
                    t1.leerDatos();
                    System.out.println(t1.toString());
                    System.out.println("El \u00e1rea del tri\u00e1ngulo de color " + t1.getColor()
                                       + " con base " + t1.getBase()
                                       + " y altura " + t1.getAltura() + " es " + t1.calcularArea()
                                       + "\nAdem\u00e1s, su perimetro es " + t1.calcularPerimetro()
                                       + ". Y tiene " + t1.lados + " lados");
                    System.out.println();
                    System.out.println();
                }
                case 3 -> {
                    System.out.println("\nRombo");
                    Rombo Ro1 = new Rombo();
                    Ro1.leerDatos();
                    System.out.println(Ro1.toString());
                    System.out.println("El \u00e1rea del rombo de color " + Ro1.getColor()
                                       + " con diagonal mayor " + Ro1.getBase()
                                       + " y diagonal menor " + Ro1.getAltura() + " es " + Ro1.calcularArea()
                                       + "\nAdem\u00e1s, su perimetro es " + Ro1.calcularPerimetro()
                                       + ". Y tiene " + Ro1.lados + " lados.");
                    System.out.println();
                    System.out.println();
                }
                case 4 -> {
                    System.out.println("\nCírculo");
                    Circunferencia c1 = new Circunferencia();

                    // lectura usando su método
                    c1.leerDatos();
                    // impresión de atributos con toString sobrescrito
                    System.out.println(c1.toString());
                    // impresión de atributos y resultado de área
                    System.out.println("El \u00e1rea del Circulo de color " + c1.getColor()
                                       + " con radio " + c1.getRadio() + " es " + c1.calcularArea()
                                       + "\nAdem\u00e1s, su perimetro es: " + c1.calcularPerimetro());
                    System.out.println();
                    System.out.println();
                }
                case 5 -> {
                    System.out.print("Elegiste la opcion salir.");
                    repite = false;
                }
                default -> System.out.print("Opción no v\u00e1lida.\n\n");
            }

            if (repite) {
                System.out.print("¿Desea repetir? (true/false): ");
                repite = lee.nextBoolean();
            }
        }
    }
}
