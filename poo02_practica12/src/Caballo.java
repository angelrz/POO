
/**
 *
 * @author angel
 */

public class Caballo extends Thread {

    private final byte carril;
    private int metros;
    static private byte lugar;

    public Caballo(byte carril) {
        this.carril = carril;
        System.out.println("Carril " + this.carril + "arranca");
    }

    @Override
    public void run() {
        double aleatorio;

        try {
            while(metros < 400) {
                aleatorio = Math.random() * 10;
                metros = (int)(metros + aleatorio);
                System.out.println("Carril " + this.carril
                                   + " lleva " + metros + " metros");
                sleep(300); //duerme 0.5 seg
            }
            lugar++;
            System.out.println("\n\n ******* \n");
            System.out.println("\n\t Carril " + this.carril
                               + ": " + lugar + "lugar");
            if(lugar == 1) {
                System.out.println("\n\t Ganador: Carril"
                                   + this.carril + "\n\n");
            }
        } catch (InterruptedException e) {
            System.out.println(":( Hilo interrumpido");
        }
    }
}
