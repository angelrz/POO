import java.util.Scanner;

/**
 *
 * @author angel
 */

public class CamposCam extends VehiculoAereo {

    private byte duracionBateria;
    Scanner lee;

    public CamposCam() {
        System.out.println("Se crea un objeto de Campos Cam.");
        duracionBateria = 3;
    }

    public CamposCam(String fuenteMotriz, String color, String medioVia, String ruta,
                     float longitud, float velocidad, byte cantidadHelices, String uso, byte duracionBateria) {
        super(fuenteMotriz, color, medioVia, ruta, longitud, velocidad, cantidadHelices);
        System.out.println("Se crea un objeto de CamposCam.");
        this.duracionBateria = duracionBateria;
    }

    public byte getDuracionBateria() {
        return duracionBateria;
    }

    public void setDuracionBateria(byte duracionBateria) {
        this.duracionBateria = duracionBateria;
    }

    @Override
    public void leerDatos() {
        lee = new Scanner(System.in);
        super.leerDatos();
        System.out.print("Ingresa el uso del dron: ");
        this.duracionBateria = lee.nextByte();
    }

    @Override
    public void mostrarDatos() {
        System.out.println();
        super.mostrarDatos();
        System.out.println("Línea: " + this.duracionBateria);
    }
}
