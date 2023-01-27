
/**
 * @author angel
 */

public class ClienteBloqueRun implements Runnable {

    private final byte numCliente;
    private final String[] pedido;

    public ClienteBloqueRun(byte numCliente, String[] pedido) {
        this.numCliente = numCliente;
        this.pedido = pedido;
        System.out.println("Soy el cliente Runnable no. " + this.numCliente);
    }

    @Override
    public void run() {
        try {
            for (byte conde = 0; conde <= this.pedido.length - 1; conde++) {
                System.out.println("Cliente Runnable " + this.numCliente +
                                   " voy a consumir: " + this.pedido[conde]);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(":( Hilo interrumpido.\n");
        }
    }
}
