/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angel
 */
public class Memoria {

    protected int capacidad;
    protected String marca;
    protected float veloLec, veloEsc;
    protected String tipoEstructura;

    public Memoria() {
        System.out.println("Se crea un objeto de Memoria.");
    }

    public String getTipoEstructura() {
        return tipoEstructura;
    }

    public void setTipoEstructura(String tipoEstructura) {
        this.tipoEstructura = tipoEstructura;
    }

    protected void formatear(String tipo, String formato) {
        System.out.println("\n El dispositivo con capacidad de "
                + this.capacidad + "GB"
                + "\n fue formateado con sistema de archivos " + formato
                + "\n con opcion de formato" + tipo);
    }

}
