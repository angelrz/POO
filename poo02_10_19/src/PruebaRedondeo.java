
/**
 *
 * @author angel
 */
public class PruebaRedondeo {

    public static void main(String[] args) {

        Redondeo r = new Redondeo();

        double valor = 3.14159265358979;
        double valorRedondeado;

        System.out.println("\nValor sin redondear: " + valor);

        valorRedondeado = r.redondear(valor, 4);
        System.out.println("\nValor redondeado a cuatro cifras: " + valorRedondeado);
    }
}
