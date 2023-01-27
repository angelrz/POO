import java.util.Scanner;

/**
 *
 * @author angel
 */

public class Vehiculo {

    private String fuenteMotriz;
    private String color;
    private String ruta;
    private String medioVia;
    private float longitud;
    private float velocidad;
    Scanner lee;

    public Vehiculo() {
        System.out.println("Se crea objeto de Vehiculo.");
        fuenteMotriz = "motor";
        color = "Rojo";
        medioVia = "Terrestre";
        ruta = "Atlalilco";
        longitud = 4.5f;
        velocidad = 120f;
    }

    public Vehiculo(String fuenteMotriz, String color, String medioVia, String ruta,
                    float longitud, float velocidad) {
        System.out.println("Se crea objeto de Vehí­culo.");
        this.fuenteMotriz = fuenteMotriz;
        this.color = color;
        this.medioVia = medioVia;
        this.ruta = ruta;
        this.longitud = longitud;
        this.velocidad = velocidad;
    }

    public String getFuenteMotriz() {
        return fuenteMotriz;
    }

    public void setFuenteMotriz(String fuenteMotriz) {
        this.fuenteMotriz = fuenteMotriz;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMedioVia() {
        return medioVia;
    }

    public void setMedioVia(String medioVia) {
        this.medioVia = medioVia;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public void leerDatos() {

        lee = new Scanner(System.in);

        System.out.print("Ingresa la forma de fuente motriz: ");
        this.fuenteMotriz = lee.nextLine();

        System.out.print("Ingresa el color: ");
        this.color = lee.nextLine();

        System.out.println("Ingresa la ruta: ");
        this.ruta = lee.nextLine();

        System.out.print("Ingresa el medio de via: ");
        this.medioVia = lee.nextLine();

        System.out.print("Ingresa la longitud en metros: ");
        this.longitud = lee.nextFloat();

        System.out.print("Ingresa la velocidad: ");
        this.velocidad = lee.nextFloat();
    }

    public void mostrarDatos() {
        System.out.println("Fuente motriz: " + this.fuenteMotriz
                           + "\nColor: " + this.color
                           + "\nMedio de via: " + this.medioVia
                           + "\nRuta: " + this.ruta
                           + "\nLongitud: " + this.longitud
                           + "\nVelocidad: " + this.velocidad);
    }
}
