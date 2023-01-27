import java.util.Scanner;

/**
 *
 * @author angel
 */

public class Punto {

    /**
     * atributo para guardar valor de x
     */
    float x;

    /**
     * atributo para guardar valor de y
     */
    float y;

    Scanner lee;

    /**
     * Forma 3 del método constructor que imprime al crear un objeto y da
     * valores iniciales a los atributos
     */
    //forma 3 del método constructor
    public Punto() {
        System.out.println("Se crea objeto de la clase Punto");
        this.x = 1.0f;
        this.y = 1.0f;
    }

    /**
     * Forma 4 del método constructor que imprime al crear un objeto, recibe
     * valores como argumentos y los asigna a los atributos
     *
     * @param x valor real para x
     * @param y valor real para y
     */
    //forma 4 del método constructor
    public Punto(float x, float y) {
        System.out.println("Se crea objeto de la clase Punto");
        this.x = x;
        this.y = y;
    }

    /*
     * método para leer valores de los atributos de cada objeto
     */
    public void pedirDatos() {
        lee = new Scanner(System.in);
        System.out.print("Ingresa la coordenada en x del punto: ");
        this.x = lee.nextFloat();
        System.out.print("Ingresa la coordenada en y del punto: ");
        this.y = lee.nextFloat();
        //lee.close();
    }

    /**
     * método para imprimir los valores de los atributos de cada objeto
     */
    public void mostrarDatos() {
        System.out.println("P(" + this.x + ", " + this.y + ")");
    }

    /**
     * método para hacer la clase ejecutable
     *
     * @param args arreglo de String para guardar argumentos de linea de
     * comandos
     */
    public static void main(String[] args) {

        //Punto p1 = new Punto();
        Punto p1 = new Punto();
        Punto p2 = new Punto();

        //Pedir las coordenadas de los puntos
        p1.pedirDatos();
        p2.pedirDatos();

        //Calcular la distancia entre p1 y p2
        float a = (p2.x - p1.x) * (p2.x - p1.x);
        float b = (p2.y - p1.y) * (p2.y - p1.y);
        System.out.println(a);
        System.out.println(b);
        double d = Math.sqrt((double) (a + b));

        //Imprimir las coordenadas y la distancia
        System.out.println("Los puntos son: ");
        p1.mostrarDatos();
        p2.mostrarDatos();
        System.out.println("\nLa distancia entre los dos puntos es: " + d);
        //lee.close();
    }
}
