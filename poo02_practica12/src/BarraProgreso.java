
/**
 *
 * @author angel
 */
public class BarraProgreso extends Thread {

    byte conde;

    @Override
    public void run() {
        for (conde = 1; conde <= 10; conde++) {
            System.out.println(" " + conde + " ");
            try {
                sleep(500); // duerme 0.5s
            } catch (InterruptedException e) {
                System.out.println(":( Hilo interrumpido.");
            }
        }
    }

    public static void main(String[] args) {

        BarraProgreso b = new BarraProgreso();
        b.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {
        }
        System.out.println("\n\nSigo aqui");
        System.err.println("y la tarea tambien sigue\n");
        //b.conde+=30;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {
        }
        System.out.println("\n\ny hasta quela tarea termine");
        System.out.println("el programa terminara.\n");
        //b.conde+=40;
    }
}
