
/**
 *
 * @author angel
 */

public class ClienteMeseroBloqueRun {

    public static void main(String[] args) {

        String[] p1 = {"Jugo", "Molletes", "Huevos"};
        String[] p2 = {"Pasta", "Salmon", "Coca Cola"};
        String[] p3 = {"Pan dulce", "Capuchino", "Confleis"};

        ClienteBloqueRun q1 = new ClienteBloqueRun((byte)1, p1);
        Thread h1 = new Thread(q1);
        h1.start();

        try {
            h1.join();
        } catch(InterruptedException e) {
            System.out.println(":( Hilo principal interrumpido.\n");
        }

        ClienteBloqueRun q2 = new ClienteBloqueRun((byte)2, p2);
        Thread h2 = new Thread(q2);
        h2.start();

        try {
            h2.join();
        } catch(InterruptedException e) {
            System.out.println(":( Hilo principal interrumpido.\n");
        }

        ClienteBloqueRun q3 = new ClienteBloqueRun((byte)3, p3);
        Thread h3 = new Thread(q3);
        h3.start();

        try {
            h3.join();
        } catch(InterruptedException e) {
            System.out.println(":( Hilo principal interrumpido.\n");
        }
    }
}
