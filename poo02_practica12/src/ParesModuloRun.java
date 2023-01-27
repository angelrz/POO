
/**
 *
 * @author angel
 */
public class ParesModuloRun implements Runnable {

    protected long inicio;
    protected long fin;
    protected double tiempoCalculo;

    @Override
    public void run() {
        try {
            this.inicio = System.nanoTime();
            for (byte conde = 2; conde <= 10; conde += 2) {
                System.out.println(conde + " ");
                Thread.sleep(500); // duerme 0.5 seg
            }
            this.fin = System.nanoTime();
            this.tiempoCalculo = ((double) (this.fin - this.inicio) / 1000000000);
            System.out.println("\nTiempo con m\u00f3dulo. "
                               + this.tiempoCalculo + " s.\n");
        } catch (InterruptedException e) {
            System.out.println(":( Hilo interrumpido.");
        }
    }
}
