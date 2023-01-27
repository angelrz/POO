/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angel
 */
public class PruebaUSB {

    public static void main(String[] args) {

        USB u1 = new USB();

        u1.marca = "Pirametro";
        u1.capacidad = 8;
        u1.veloEsc = 16.5f;
        u1.veloLec = 55.0f;
        u1.tipoPuerto = 'A';
        u1.tipoUSB = 2.0f;
        u1.setDisenho("Yoda");
        u1.mostrarEspecif();
        u1.formatear("rapido", "NTFS");
        String SO = u1.bootear(true);
        System.out.println("\n La PC inicio con el s.o " + SO);

    }
}
