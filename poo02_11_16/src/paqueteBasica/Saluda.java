package paqueteBasica;

/**
 *
 * @author angel
 */

public class Saluda {

    private String nombre;

    public Saluda() {
        System.out.println("Se crea objeto de Saluda");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarSaludo() {
        System.out.println("Hola " + nombre);
    }

    public void mostrarSaludo(String nombre) {
        this.nombre = nombre;
        System.out.println("Hola " + nombre);
    }
}
