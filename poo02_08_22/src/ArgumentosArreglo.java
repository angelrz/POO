
/**
 * @author angel
 */
public class ArgumentosArreglo {

    public static void main(String[] args) {

        float[] datos;

        System.out.println("Cantidad de arguementos: "
                           + args.length);

        for (byte conde = 0; conde < args.length; conde++) {
            System.out.println("Elemento " + conde + ": "
                               + args[conde]);
        }

        datos = new float[args.length];

        for (byte conde = 0; conde <= 2; conde++) {
            datos[conde] = Float.parseFloat(args[conde]);
        }

        for (byte conde = 0; conde <= 2; conde++) {
            System.out.println("Elemento " + conde + ": "
                               + datos[conde]);
        }

        int cero = Integer.parseInt(args[0]);
        int uno = Integer.parseInt(args[1]);
        //int dos = Integer.parseInt(args[2]);

        int resul = cero + uno;
        System.out.println("La suma de los primeros 2 es: " + resul);

        float Cero = Float.parseFloat(args[0]);
        float Uno = Float.parseFloat(args[1]);

        float Resul = Cero + Uno;
        System.out.println("La suma de los primeros dos es: " + Resul);
    }
}
