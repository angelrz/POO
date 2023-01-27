package paqueteLectura;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author angel
 */

public class Lectura {

    private InputStreamReader n;
    private BufferedReader cosa;
    private String renglon;
    private double realGrande;
    private int entero;
    private String cadena;

    public Lectura() {
        this.n = new InputStreamReader(System.in);
        this.cosa = new BufferedReader(n);
    }

    public void leerRenglon() {
        try {
            this.renglon = this.cosa.readLine();
        } catch (IOException lee) {
            System.out.println("\nFalla: No se pudo leer del teclado " + lee.getMessage());
        }
    }

    public void convierte(String tipo) {
        boolean repite = true;
        leerRenglon();
        while (repite) {
            try {
                switch (tipo) {
                    case "double" -> {
                        this.realGrande = Double.parseDouble(this.renglon);
                        repite = false;
                    }
                    case "int" -> {
                        this.entero = Integer.parseInt(this.renglon);
                        repite = false;
                    }
                    case "String" -> {
                        this.cadena = renglon;
                        repite = false;
                    }
                    default -> this.leerRenglon();
                }
            } catch (NumberFormatException convierte) {
                System.out.print(
                        "\nFalla: No se pudo convertir, " + convierte.getMessage() + "\nVuelve a ingresar el dato:  ");
                this.leerRenglon();
            }
        }
    }

    public double nextDouble() {
        this.convierte("double");
        return this.realGrande;
    }

    public int nextInt() {
        this.convierte("int");
        return this.entero;
    }

    public String nextLine() {
        this.convierte("String");
        return this.cadena;
    }

    public void cerrarFlujo() {
        try {
            if (this.cosa != null) {
                this.cosa.close();
            }
        } catch (IOException ec) {
            System.out.println(":( No pude cerrar el flujo: " + ec);
        }
    }
}
