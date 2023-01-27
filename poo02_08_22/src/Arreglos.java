/**
 * @author angel
 */

public class Arreglos {

    public static void main(String[] args) {

        //int datos[50];
        //int arr[] = new int[3]; Es otra forma de inicializar el arreglo.
        int[] arr;
        arr = new int[3];

        String[] nombres = new String[3];
        //byte conde;

        arr[0] = 3;
        arr[1] = 5;
        arr[2] = 7;
        //arr[3] = 9;

        nombres[0] = "Hugo";
        nombres[1] = "Paco";
        nombres[2] = "Luis";

        System.out.println("Elemento 0: " + arr[0]);
        System.out.println("Elemento 1: " + arr[1]);
        System.out.println("Elemento 2: " + arr[2] + "\n");

        for (byte conde = 0; conde <= 2; conde++) {
            System.out.println("Elemento " + conde + ": " + arr[conde]);
        }
        System.out.println("");

        for (byte conde = 0; conde <= 2; conde++) {
            System.out.println("Nombre " + conde + ": " + nombres[conde]);
        }
    }
}
