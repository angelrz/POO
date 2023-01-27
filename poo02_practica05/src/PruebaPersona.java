
/**
 * @author angel
 */
public class PruebaPersona {

    public static void main(String[] args) {

        //Persona p1 = new Persona();
        //Persona p2;
        Persona p3;
        Persona p4 = new Persona();

        /*
        //objeto p1 con asignación de valores a atributos con métodos set
        p1.setNombre("Hugo Godinez");
        p1.setDireccion("Calle siempre viva");
        //asignación de fecha desde método set
        Fecha f1 = new Fecha();
        f1.setDia((byte)31);
        f1.setMes((byte)4);
        f1.setAnho((short)1983);
        p1.setFechaNacimiento(f1);

		//objeto p2 con asignación de valores desde método constructor y un objeto de fecha
		Fecha f2 = new Fecha();
		f2.setDia((byte)28);
		f2.setMes((byte)5);
        f2.setAnho((short)1982);
        p2= new Persona("Luis Godinez", "Calle siempre viva", f2);*/

        //objeto p3 con asignación de valores desde método constructor incluyendo fecha
        p3= new Persona("Paco Godinez", "Calle siempre viva", (byte)15, (byte)6, (short)1979);

        //llamada a metodos
		/*p1.caminar();
		p1.hablarPorTelefono("Juanito");
		p1.mostrarDatos();

		p2.mostrarDatos();
		*/
        p3.mostrarDatos();
        p4.leerDatos();
        p4.mostrarDatos();
    }
}
