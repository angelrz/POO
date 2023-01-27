
/**
 *
 * @author angel
 */

public class CaballoCarrera {

    public static void main(String[] args) {

        Caballo[] c;
        c = new Caballo[5];
        for(byte conde = 0; conde <= 4; conde++) {
            c[conde] = new Caballo((byte) (conde + 1));
            c[conde].start();
        }
    }
}
