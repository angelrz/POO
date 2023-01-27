import java.util.Scanner;

/**
 *
 * @author angel
 */

public class VehiculoAereo extends Vehiculo {

    private byte cantidadHelices;
    Scanner lee;

    public VehiculoAereo() {
        System.out.println("Se crea objeto de vehiculo aéreo");
    }

    public VehiculoAereo(String fuenteMotriz, String color, String medioVia, String ruta,
                         float longitud, float velocidad, byte cantidadHelices) {
        super(fuenteMotriz, color, medioVia, ruta, longitud, velocidad);
        System.out.println("Se crea objeto de vehiculo aereo");
        this.cantidadHelices = cantidadHelices;
    }

    public byte getCantidadHelices() {
        return cantidadHelices;
    }

    public void setCantidadHelices(byte cantidadHelices) {
        this.cantidadHelices = cantidadHelices;
    }

    @Override
    public void leerDatos() {
        lee = new Scanner(System.in);
        super.leerDatos();
        System.out.print("Ingresa la cantidad de helices: ");
        this.cantidadHelices = lee.nextByte();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Cantidad de helices: " + this.cantidadHelices);
    }
}
