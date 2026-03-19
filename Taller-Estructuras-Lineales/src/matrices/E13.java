package matrices;

import java.util.Random;

/**
 * Ejercicio 13: Inicializar una matriz de n x n, rellenar aleatoriamente, 
 * determinar si es simétrica e imprimir los números de las 4 esquinas
 */
public class E13 {

    public static void main(String[] args) {
        int n = 4;
        int[][] matriz = generarMatrizAleatoria(n);
        
        imprimirMatriz(matriz);
        
        verificarSimetria(matriz);
        imprimirEsquinas(matriz);
    }

    /**
     * Genera la matriz con números aleatorios
     */
    public static int[][] generarMatrizAleatoria(int n) {
        Random random = new Random();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(20);
            }
        }
        return matriz;
    }

    /**
     * Verifica si una matriz es simétrica.
     * Una matriz es simétrica si matriz[i][j] es igual a matriz[j][i] en todas sus posiciones
     */
    public static void verificarSimetria(int[][] matriz) {
        int n = matriz.length;
        boolean simetrica = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break; // Basta con que uno falle para que no sea simétrica
                }
            }
        }

        if (simetrica) {
            System.out.println("\nLa matriz es simétrica.");
        } else {
            System.out.println("\nLa matriz NO es simétrica.");
        }
    }

    /**
     * Imprime exclusivamente los valores ubicados en los 4 extremos de la matriz
     */
    public static void imprimirEsquinas(int[][] matriz) {
        int n = matriz.length;
        System.out.println("Números de las esquinas:");
        System.out.println("Superior Izquierda: " + matriz[0][0]);
        System.out.println("Superior Derecha: " + matriz[0][n - 1]);
        System.out.println("Inferior Izquierda: " + matriz[n - 1][0]);
        System.out.println("Inferior Derecha: " + matriz[n - 1][n - 1]);
    }

    public static void imprimirMatriz(int[][] matriz) {
        System.out.println("Matriz generada:");
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
    }
}