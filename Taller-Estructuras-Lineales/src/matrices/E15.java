package matrices;

import java.util.Random;
import java.util.Scanner;

/**
 * Ejercicio 15: Leer dimensiones m x n por teclado, rellenar aleatoriamente,
 * e intercambiar la primera fila con la segunda
 */
public class E15 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese número de filas (m) [Mínimo 2]: ");
        int m = sc.nextInt();
        
        System.out.print("Ingrese número de columnas (n): ");
        int n = sc.nextInt();

        int[][] matriz = generarMatrizAleatoria(m, n);
        
        imprimirMatriz(matriz, "\nMatriz original:");

        // Validamos que al menos existan 2 filas para poder intercambiarlas
        if (m >= 2) {
            intercambiarFilas(matriz);
            imprimirMatriz(matriz, "\nMatriz después de intercambiar las dos primeras filas:");
        } else {
            System.out.println("\nLa matriz tiene menos de 2 filas, no se pueden intercambiar.");
        }
        
        sc.close();
    }

    /**
     * Llena una matriz con dimensiones dadas por el usuario
     */
    public static int[][] generarMatrizAleatoria(int m, int n) {
        Random random = new Random();
        int[][] matriz = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(50);
            }
        }
        return matriz;
    }

    /**
     * Modifica la matriz intercambiando la fila de índice 0 con la de índice 1.
     * Esto se hace directamente moviendo las referencias de los arreglos internos,
     * lo cual es mucho más eficiente que mover elemento por elemento
     */
    public static void intercambiarFilas(int[][] matriz) {
        // En Java, una matriz 2D es un "arreglo de arreglos"
        // Podemos simplemente cambiar toda la fila (el sub-arreglo) de una sola vez
        int[] filaTemporal = matriz[0];
        matriz[0] = matriz[1];
        matriz[1] = filaTemporal;
    }

    /**
     * Imprime la matriz.
     */
    public static void imprimirMatriz(int[][] matriz, String titulo) {
        System.out.println(titulo);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}