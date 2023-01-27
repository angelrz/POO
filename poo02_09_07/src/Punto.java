/**
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

    /**
     * Forma 3 del método constructor que imprime al crear un objeto y da
     * valores iniciales a los atributos
     */
    public Punto() //forma 3 del método constructor
    {
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
    public Punto(float x, float y) //forma 4 del método constructor
    {
        System.out.println("Se crea objeto de la clase Punto");
        this.x = x;
        this.y = y;
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
     *             comandos
     */
    public static void main(String[] args) {

        Punto p1 = new Punto();
        Punto pp = new Punto((float) 4.3, (float) 8.7);
        //p2

        p1.x = 2.3f;
        p1.y = 1.1f;

        p1.mostrarDatos();
        pp.mostrarDatos();

        //asignar valores para p2
        //calcular la distancia entre p1 y p2
        //imprimir las coordenadas y la distancia
    }
}
