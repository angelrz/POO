import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author angel
 */

public class Redondeo {

    public Redondeo() {
        System.out.println("Se crea objeto de redondeo.");
    }

    public double redondear(double numero, int cuantos) {
        BigDecimal bigDecimal = new BigDecimal(numero);
        BigDecimal red = bigDecimal.setScale(cuantos, RoundingMode.HALF_UP);
        return red.doubleValue();
    }
}
