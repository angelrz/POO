import java.util.Scanner;

public class AlumnoIngeniero extends Persona {

    private int numCuenta, numEquipo;
    private String carrera;

    public AlumnoIngeniero() {
        super();
    }

    public AlumnoIngeniero(String nombre, String direccion, Fecha fechaNacimiento,
                           int numCuenta, int numEquipo, String carrera) {
        super(nombre);

        System.out.println("Se crea objeto de AlumnoIngeniero");
        this.numCuenta = numCuenta;
        this.numEquipo = numEquipo;
        this.carrera = carrera;
    }

    public int getnumCuenta() {
        return numCuenta;
    }

    public void setnumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getnumEquipo() {
        return numEquipo;
    }

    public void setnumEquipo(int numEquipo) {
        this.numEquipo = numEquipo;
    }

    public String getcarrera() {
        return carrera;
    }

    public void setcarrera(String carrera) {
        this.carrera = carrera;
    }

    public void leerDatos() {
        Scanner lee = new Scanner(System.in);
        super.leerDatos();
        System.out.print("Ingresa la base: ");
        this.numCuenta = lee.nextInt();
        System.out.print("Ingresa la altura: ");
        this.numEquipo = lee.nextInt();
        System.out.println("ingresa la ingenieria que cursas");
        this.carrera = lee.next(getcarrera());
    }

    @Override
    public String programar() {
        return null;
    }

    public String toString() {
        return super.toString() + "Alumno Ingeniero" +
                "\nNumero de cuenta: " + this.numCuenta +
                "\nnNumero de Equipo: " + this.numEquipo +
                "\nIngenieria que se cursa" + this.carrera;
    }
}
