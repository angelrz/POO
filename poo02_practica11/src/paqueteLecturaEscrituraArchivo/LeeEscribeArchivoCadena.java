package paqueteLecturaEscrituraArchivo;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author angel
 */


public class LeeEscribeArchivoCadena {

    char[] texto;
    String mensaje;
    byte conde; // Guarda la cantidad de caracteres del archivo

    public LeeEscribeArchivoCadena() {
        System.out.println("Se crea un objeto de LeeEscribeArchivoCadena.");
        texto = new char[100];
    }

    public void leerArchCadena() {
        int c = 0; // Guarda el caracter como número leído del archivo
        FileReader archivo;
        BufferedReader buffer = null;

        try {
            archivo = new FileReader("prueba.txt");
            buffer = new BufferedReader(archivo);

            // el metodo read() devuelve el carácter leído como entero
            // -1 en la lectura indica fin del archivo
            while ((c = buffer.read()) != -1) {
                // convierte el entero devuelto a carácter y guarda en arreglo
                texto[conde] = (char) c;
                conde++;
            }
            texto[conde] = '\0';

//			System.out.println("\nImpresión de datos desde el arreglo: ");
//			for (int i = 0; i < conde; i++) {
//				System.out.print(texto[i]);
//			}
            mensaje = String.valueOf(texto);
//			System.out.println("\n\nConvirtiendo arreglo a cadena: " + "\n" + mensaje);
        } catch (FileNotFoundException no) {
            System.out.println(":( No pude cargar el archivo: " + no);
        } catch (IOException e) {
            System.out.println(":( No pude leer el archivo: " + e);
        } finally {
            try {
                if (buffer != null) {
                    buffer.close();
                }
            } catch (IOException ec) {
                System.out.println(":( No pude cerrar el archivo: " + ec);
            }
        }
    }

    public void escribirArchCadena(String mensaje, String rutaNombre) {
        this.mensaje = mensaje;
        FileWriter archivo;
        BufferedWriter buffer;
        PrintWriter escribe = null;

        try {
            archivo = new FileWriter(rutaNombre);
            buffer = new BufferedWriter(archivo);
            escribe = new PrintWriter(buffer);
            for (int i = 0; i < 10; i++) {
                escribe.print(mensaje);
            }
        } catch (IOException e) {
            System.out.println(":( No puede escribir el archivo " + e);
        } finally {
            assert escribe != null;
            escribe.close();
        }
    }

    public String devolverCadena() {
        return this.mensaje;
    }

    public void imprimirCadena() {
        System.out.println("\nImpresi\u00F3n de datos del texto: ");
        for (int i = 0; i < conde; i++) {
            System.out.print(texto[i]);
        }
        System.out.println("\n\nConvirtiendo arreglo a cadena: " + "\n" + mensaje);
    }

    public static void main(String[] args) {

        LeeEscribeArchivoCadena a1 = new LeeEscribeArchivoCadena();

        a1.leerArchCadena();
        // a1.devolverCadena();
        a1.imprimirCadena();
    }
}
