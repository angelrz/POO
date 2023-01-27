import java.util.Scanner;

/**
 *
 * @author angel
 */

public class Metro extends VehiculoTerrestre {

    private String colorLinea;
    private int cantVagoneros;
    Scanner lee;

    public Metro() {
        System.out.println("Se crea objeto de Metro.");
        colorLinea = "Verde";
        cantVagoneros = 7;
    }

    public Metro(String fuenteMotriz, String color, String medioVia, String ruta, float longitud,
                 float velocidad, int cantidadRuedas, String colorLinea, int cantVagoneros) {
        super(fuenteMotriz, color, medioVia, ruta, longitud, velocidad, cantidadRuedas);
        System.out.println("Se esta crea objeto de Metro.");
        this.colorLinea = colorLinea;
        this.cantVagoneros = cantVagoneros;
    }

    public String getColorLinea() {
        return colorLinea;
    }

    public void setColorLinea(String colorLinea) {
        this.colorLinea = colorLinea;
    }

    public int getCantVagoneros() {
        return cantVagoneros;
    }

    public void setCantVagoneros(int cantVagoneros) {
        this.cantVagoneros = cantVagoneros;
    }

    @Override
    public void leerDatos() {
        lee = new Scanner(System.in);
        super.leerDatos();
        System.out.print("Ingresa el color de la línea: ");
        this.colorLinea = lee.nextLine();
        System.out.print("Ingresa la cantidad de vagoneros: ");
        this.cantVagoneros = lee.nextByte();
    }

    @Override
    public void mostrarDatos() {
        System.out.println();
        super.mostrarDatos();
        System.out.println("Línea: " + this.colorLinea
                           + "\nCantidad de vagoneros: " + this.cantVagoneros);
    }
}
