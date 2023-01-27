package paqueteLecturaEscrituraArchivo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author angel
 */

public class LeeEscribeArchivoMatriz {

    int[][] matriz;

    public LeeEscribeArchivoMatriz() {
        System.out.println("Se crea objeto de LeeArchivoMatriz.");
        this.matriz = new int[3][3];
    }

    public void leerArchMatriz(String rutaNombre) {
        byte conde = 0;
        String cadena;
        String[] elem = new String[3];
        FileReader archivo;
        BufferedReader buffer = null;

        try {
            archivo = new FileReader(rutaNombre);
            buffer = new BufferedReader(archivo);

            // el metodo readLine() devuelve el renglón completo
            // -1 en la lectura indica fin del archivo
            while ((cadena = buffer.readLine()) != null) {
                elem = cadena.split("\\s+");
                this.matriz[conde][0] = Integer.parseInt(elem[0]);
                this.matriz[conde][1] = Integer.parseInt(elem[1]);
                this.matriz[conde][2] = Integer.parseInt(elem[2]);
                conde++;
            }
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

    public void escribirArchMatriz(int[][] matriz, String rutaNombre) {
        this.matriz = matriz;
        FileWriter archivo;
        BufferedWriter buffer;
        PrintWriter escribe = null;

        try {
            archivo = new FileWriter(rutaNombre);
            buffer = new BufferedWriter(archivo);
            escribe = new PrintWriter(buffer);

            for (byte conde = 0; conde <= 2; conde++) {
                escribe.println(matriz[conde][0] + " " + matriz[conde][1] + " " +
                                matriz[conde][2]);
            }
        } catch (IOException e) {
            System.out.println(":( No pude escribir el archivo: " + e);
        } finally {
            escribe.close();
        }
    }

    public int[][] devolverMatriz() {
        return this.matriz;
    }

    public void imprimirMatriz() {
        System.out.println("\nImpresi\u00F3n como matriz");
        for (byte reng = 0; reng <= 2; reng++) {
            for (byte col = 0; col <= 2; col++) {
                System.out.print(this.matriz[reng][col] + " ");
            }
            System.out.println();
        }
    }
}
