import java.util.Scanner;

/**
 *
 * @author angel
 */

public class Persona {

    //lista de atributos
    private String nombre;
    private String direccion;
    private Fecha fechaNacimiento;
    private Scanner lee;

    // lista de métodos
    // constructores
    public Persona() {
        System.out.println("Se crea objeto de Persona");
        fechaNacimiento = new Fecha();
        lee = new Scanner(System.in);
    }

    public Persona(String nombre, String direccion,
                   Fecha fechaNacimiento) {
        System.out.println("Se crea objeto de Persona");

        lee = new Scanner(System.in);
        this.fechaNacimiento = new Fecha();
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(String nombre, String direccion,
                   byte dia, byte mes, short anho) {
        System.out.println("Se crea objeto de Persona");

        lee = new Scanner(System.in);
        fechaNacimiento = new Fecha(dia, mes, anho);
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void caminar() {
        System.out.println(this.nombre + " camina");
    }

    public void correr() {
        System.out.println(this.nombre + " corre");
    }

    public void hablarPorTelefono(String quien) {
        System.out.println(this.nombre + " habla por telefono con " + quien);
    }

    public void leerDatos() {
        System.out.print("Ingresa tu nombre: ");
        this.nombre = lee.nextLine();
        System.out.print("Ingresa tu direccion: ");
        this.direccion = lee.nextLine();
        System.out.print("Ingresa tu dia de nacimiento: ");
        this.fechaNacimiento.setDia(lee.nextByte());
        System.out.print("Ingresa tu mes de nacimiento: ");
        this.fechaNacimiento.setMes(lee.nextByte());
        System.out.print("Ingresa tu anho de nacimiento: ");
        this.fechaNacimiento.setAnho(lee.nextShort());
    }

    public void mostrarDatos() {
        System.out.println("\nNombre: " + this.nombre
                           + "\nDirección: " + this.direccion
                           + "\nFecha de nacimiento (dd/mm/aaaa): "
                           + this.fechaNacimiento.getDia() + " / "
                           + this.fechaNacimiento.getMes() + " / "
                           + this.fechaNacimiento.getAnho());
    }
}
