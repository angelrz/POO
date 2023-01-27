package paqueteBasica;

/**
 *
 * @author angel
 */

public class OperacionesBasicas {

    private double numUno, numDos;

    public OperacionesBasicas() {
        System.out.println("Se crea objeto de OperacionesBasicas");
    }

    public double getNumUno() {
        return numUno;
    }

    public void setNumUno(double numUno) {
        this.numUno = numUno;
    }

    public double getNumDos() {
        return numDos;
    }

    public void setNumDos(double numDos) {
        this.numDos = numDos;
    }

    public double suma() {
        return this.numUno + this.numDos;
    }

    public double suma(double numUno, double numDos) {
        this.numUno = numUno;
        this.numDos = numDos;
        return this.numUno + this.numDos;
    }
}
