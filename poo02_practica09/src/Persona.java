import java.util.Scanner;

public abstract class Persona implements SerVivo {
    String nombre;
    private String direccion;
    private Fecha fechaNacimiento;
    private Scanner lee;

    public Persona(String nombre) {
        System.out.println("Se crea objeto de persona");
        fechaNacimiento = new Fecha();
    }

    public Persona(String nombre, String direccion, Fecha fechaNacimiento) {
        System.out.println("Se crea objeto de persona\n");
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(String nombre, String direccion, byte dia, byte mes, int anio) {
        System.out.println("Se crea objeto de persona");
        fechaNacimiento = new Fecha(dia, mes, (short) anio);
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Persona() {
        System.out.println("Se crea objeto de persona");
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

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
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

    public void hablarPorTelefono() {
        System.out.println(this.nombre + " habla por telefono");
    }

    public void leerDatos() {
        Scanner lee = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona: ");
        this.nombre = lee.next();
        System.out.println("Ingrese direccion de la persona: ");
        this.direccion = lee.next();
        System.out.println("Ingrese fecha de nacimiento de la persona: ");
        System.out.println("Dia: ");
        byte dia = lee.nextByte();
        this.fechaNacimiento.setDia(dia);
        System.out.println("Mes: ");
        byte mes = lee.nextByte();
        this.fechaNacimiento.setMes(mes);
        System.out.println("Año: ");
        short anio = lee.nextShort();
        this.fechaNacimiento.setAnio(anio);
    }

    public abstract String programar();

    public String toString() {
        return "\nPersona: " + this.getNombre() + "\nDireccion: " + this.getDireccion()
                + "\nFecha de nacimiento: " + this.fechaNacimiento.getDia() + "/"
                + this.fechaNacimiento.getMes() + "/" + this.fechaNacimiento.getAnio();
    }
}