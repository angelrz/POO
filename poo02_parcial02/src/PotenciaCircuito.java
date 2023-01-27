/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angel
 */
public class PotenciaCircuito {

    private float v, i;

    public PotenciaCircuito() {
        System.out.println("Se crea objeto de PotenciaCircuito.");
    }

    public PotenciaCircuito(float v, float i) {
        System.out.println("Se crea objeto de PotenciaCircuito.");
        this.v = v;
        this.i = i;
    }

    public float getV() {
        return v;
    }

    public void setV(float v) {
        this.v = v;
    }

    public float getI() {
        return i;
    }

    public void setI(float i) {
        this.i = i;
    }

    public float calcularP() {
        return v * i;
    }

    public void mostrarDatos() {
        System.out.print("\nVoltaje: " + this.v
                + "\nCorriente: " + this.i);
    }
}
