import java.util.Scanner;

/**
 *
 * @author angel
 */

public class BiciTaxi extends VehiculoTerrestre {

    private String contaminacion;
    private String nombre;
    Scanner lee;

    public BiciTaxi() {
        System.out.println("Se crea objeto de BiciTaxi.");
    }

    public BiciTaxi(String fuenteMotriz, String color, String medioVia, String ruta,
                    float longitud, float velocidad, byte cantidadRuedas, String contaminacion, String nombre) {
        super(fuenteMotriz, color, medioVia, ruta, longitud, velocidad, cantidadRuedas);
        System.out.println("Se esta creando objeto de BiciTaxi");
        this.contaminacion = contaminacion;
        this.nombre = nombre;
    }

    public String getContaminacion() {
        return contaminacion;
    }

    public void setContaminacion(String contaminacion) {
        this.contaminacion = contaminacion;
    }

    public String getOtroNombre() {
        return nombre;
    }

    public void setOtroNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void leerDatos() {
        lee = new Scanner(System.in);
        super.leerDatos();
        System.out.print("Ingresa si este vehículo genera Contaminación: ");
        this.contaminacion = lee.next();
        System.out.print("Ingresa otro nombre de este vehículo: ");
        this.nombre = lee.next();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Contaminacion: " + this.contaminacion
                           + "\nOtro nombre: " + this.nombre);
    }
}
