import java.util.Scanner;

/**
 *
 * @author angel
 */

public class VehiculoTerrestre extends Vehiculo {

    Scanner lee;
    private int cantidadRuedas;

    public VehiculoTerrestre() {
        System.out.println("Se crea objeto de VehiculoTerrestre.");
        cantidadRuedas = 16;
    }

    public VehiculoTerrestre(String fuenteMotriz, String color, String medioVia, String ruta,
                             float longitud, float velocidad,    // variables de la clase padre
                             int cantidadRuedas) {   // variables de ésta clase
        super(fuenteMotriz, color, medioVia, ruta, longitud, velocidad);    // Heredados de la Clase padre
        System.out.println("Se crea objeto de VehiculoTerrestre.");
        this.cantidadRuedas = cantidadRuedas;
    }

    public int getCantidadRuedas() {
        return cantidadRuedas;
    }

    public void setCantidadRuedas(int cantidadRuedas) {
        this.cantidadRuedas = cantidadRuedas;
    }

    @Override
    public void leerDatos() {
        lee = new Scanner(System.in);
        super.leerDatos();
        System.out.print("Ingresa la cantidad de ruedas: ");
        this.cantidadRuedas = lee.nextByte();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Cantidad de ruedas: " + this.cantidadRuedas);
    }
}
