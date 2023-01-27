/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angel
 */
public class USB extends Memoria {

    private String disenho;
    public float tipoUSB;
    public char tipoPuerto;

    public USB() {
        System.out.println("Se crea un objeto de USB.");
    }

    public String getDisenho() {
        return disenho;
    }

    public void setDisenho(String disenho) {
        this.disenho = disenho;
    }

    public void mostrarEspecif() {
        System.out.println("\n marca: " + this.marca + "\n Capacidad (GB) "
                + this.capacidad + "\n velocidad de lectura (mbps) " + this.veloLec
                + "\n velocidad escritura (mbps) " + this.veloEsc
                + "\n Tipo de puerto (A/B/C): " + this.tipoPuerto
                + "\n Tipo USB (1.1 / 1.2 / 2.0 / 3.0 ): " + this.tipoUSB
                + "\n Descp diseno: " + this.disenho);
    }

    public String bootear(boolean accion) {
        if (accion == true) {
            return "Ubuntu";
        } else {
            return "Windows";
        }
    }

}
