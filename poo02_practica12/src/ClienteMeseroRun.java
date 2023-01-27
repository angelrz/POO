
/**
 *
 * @author angel
 */
public class ClienteMeseroRun {

    public static void main(String[] args) {

        String[] p1 = {"Jugo", "Molletes", "Huevos"};
        String[] p2 = {"Pasta", "Salmon", "Coca Cola"};
        String[] p3 = {"Pan dulce", "Capuchino", "Confleis"};

        ClienteRun c1 = new ClienteRun((byte)1, p1);
        Thread h1 = new Thread(c1);
        h1.start();

        ClienteRun c2 = new ClienteRun((byte)2, p2);
        Thread h2 = new Thread(c2);
        h2.start();

        ClienteRun c3 = new ClienteRun((byte)3, p3);
        Thread h3 = new Thread(c3);
        h3.start();
    }
}
