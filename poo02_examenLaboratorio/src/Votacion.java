/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Machorro Marco
 * @author Mendoza Ángel
 * @author Ramírez Carolina
 */

public class Votacion {
    
    private String voto;
    
    public Votacion() {
        this.voto = "A favor.";
    }
    
    public void mostrarValor() {
        System.out.println("Valor del voto: " + this.voto);
    }

    public void setVoto(String voto) {
        this.voto = voto;
    }

    /**
     * @return voto
     */
    public String getVoto() {
        return voto;
    }
    
    public static void main(String[] args) {
        
        Votacion v = new Votacion();
        
        v.mostrarValor();
        v.getVoto();
        v.setVoto("En contra.");
        v.mostrarValor();
    }
}
