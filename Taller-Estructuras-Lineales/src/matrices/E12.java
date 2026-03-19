package matrices;

import java.util.Random;

/**
 * Ejercicio 12: Inicializar una matriz n x n con números entre -50 y 50.
 * Calcular la sumatoria de los elementos de la diagonal opuesta a la principal
 */
public class E12 {

    public static void main(String[] args) {
        int n = 4; // Matriz cuadrada de 4x4
        int[][] matriz = generarMatrizAleatoria(n);
        
        imprimirMatriz(matriz);
        
        int sumaDiagonalOpuesta = sumarDiagonalOpuesta(matriz);
        System.out.println("\nSumatoria de la diagonal opuesta: " + sumaDiagonalOpuesta);
    }

    /**
     * Llena una matriz cuadrada con números aleatorios (positivos y negativos)
     */
    public static int[][] generarMatrizAleatoria(int n) {
        Random random = new Random();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Rango de -50 a 50
                matriz[i][j] = random.nextInt(101) - 50; 
            }
        }
        return matriz;
    }

    /**
     * Calcula la suma de la diagonal secundaria (opuesta).
     * La lógica matemática es que la columna va disminuyendo a medida que la fila aumenta
     */
    public static int sumarDiagonalOpuesta(int[][] matriz) {
        int suma = 0;
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            // Fila i, Columna (n - 1 - i). Ejemplo en matriz 4x4:
            // Fila 0 -> Columna 3
            // Fila 1 -> Columna 2 ...
            suma += matriz[i][n - 1 - i];
        }
        return suma;
    }

    public static void imprimirMatriz(int[][] matriz) {
        System.out.println("Matriz generada:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}