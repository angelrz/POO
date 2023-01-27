/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angel
 */
public class PruebaPotenciaCircuito {

    public static void main(String[] args) {

        PotenciaCircuito p1 = new PotenciaCircuito((float)12, (float)1.275);
        p1.mostrarDatos();
        System.out.println("\nLa potencia en watts es " + p1.calcularP());

    }
}
