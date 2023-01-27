
/**
 * @author angel
 */

public class PruebaLibro {

    public static void main(String[] args) {

        Libro l = new Libro();

        //asignación de valores a atributos con objeto.set
        l.setAutor("Juan L");
        l.setTitulo("Hola Mundo");
        l.setEditorial("Editorial el pepe");
        l.setPaginas(10);

        //obtener valores de atributos con objeto.get
        System.out.print("\nAutor: " + l.getAutor()
                         + "\nTitulo: " + l.getTitulo()
                         + "\nEditorial: " + l.getEditorial()
                         + "\nPáginas: " + l.getPaginas() + "\n");
    }
}
