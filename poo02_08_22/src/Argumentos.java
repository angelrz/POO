/**
 * @author angel
 */

public class Argumentos {

    public static void main(String[] args) {
        System.out.println("Cantidad de argumentos "
                           + args.length);
        for (byte conde = 0; conde < args.length; conde++) {
            System.out.println("Elemento: " + conde + ": "
                               + args[conde]);
        }
    }
}

