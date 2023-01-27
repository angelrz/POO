package aquiProbando;
import paqueteLecturaEscrituraArchivo.*;

/**
 *
 * @author angel
 */

public class PruebaPaqueteLecturaEscrituraArchivo {

    public static void main(String[] args) {

        LeeEscribeArchivoMatriz a1 = new LeeEscribeArchivoMatriz();
        LeeEscribeArchivoMatriz a2 = new LeeEscribeArchivoMatriz();

        a1.leerArchMatriz("matriz.txt");
        a1.imprimirMatriz();

        a2.leerArchMatriz("matriz2.txt");
        a2.imprimirMatriz();

        int[][] m = new int[3][3];
        m = a1.devolverMatriz();

        int[][] n = new int[3][3];
        n = a2.devolverMatriz();

        int[][] q = new int[3][3];

        // Suma de las matrices
        for (byte r = 0; r <= 2; r++) {
            for (byte c = 0; c <= 2; c++) {
                q[r][c] = m[r][c] + n[r][c];
            }
        }

        System.out.println("\nImpresión como matriz desde prueba: ");
        for (byte reng = 0; reng <= 2; reng++) {
            for (byte col = 0; col <= 2; col++) {
                System.out.print(q[reng][col] + " ");
            }
            System.out.println();
        }

        // int m2[][] = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
        a1.escribirArchMatriz(q, "matrizSalida.txt");
    }
}
