import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author angel
 */

public class Navidad implements Runnable {

    String rutaNombre;
    ArrayList<String> datos = new ArrayList<>();
    String[] mensaje = null;
    boolean suspender;

    public Navidad(String rutaNombre) {
        this.rutaNombre = rutaNombre;
        this.suspender = false;
    }

    public void leerArchivo() {
        String linea;

        FileReader archivo;
        BufferedReader buffer = null;

        try {
            archivo = new FileReader(rutaNombre);
            buffer = new BufferedReader(archivo);

            //el metodo readLine() lee por bloques y devuelve el renglón como String
            // null en la lectura indica fin del archivo
            while((linea = buffer.readLine()) != null) {
                datos.add(linea);
            }

            mensaje = new String[datos.size()];
            for(int conde = 0; conde < datos.size(); conde++) {
                mensaje[conde] = datos.get(conde);
            }
        } catch(FileNotFoundException nosta) {
            System.out.println(":( No pude cargar el archivo: " + nosta);
        } catch (IOException e) {
            System.out.println(":( No pude leer el archivo: " + e);
        } finally {
            try {
                if(buffer != null) {
                    buffer.close();
                }
            } catch (IOException ec) {
                System.out.println(":( No pude cerrar el archivo: " + ec);
            }
        }
    }

    public synchronized void suspenderHilo() {
        this.suspender = true;
    }

    public synchronized void continuarHilo() {
        this.suspender = false;
        notify();
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        leerArchivo();
        try {
            for (String elemento : mensaje) {
                System.out.println(elemento);
                Thread.sleep(1000);	//duerme 1 seg

                synchronized (this) {
                    while (this.suspender == true) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(":( Hilo interrumpido");
        }
    }
}
