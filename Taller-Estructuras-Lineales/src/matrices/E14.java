package matrices;

/**
 * Ejercicio 14: Inicializar una matriz de m x n (predeterminada) y 
 * encontrar su matriz transpuesta
 */
public class E14 {

    public static void main(String[] args) {
        
        // 1. Generación / Definición de datos
        int[][] matrizOriginal = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // 2. Procesamiento
        int[][] matrizTranspuesta = calcularTranspuesta(matrizOriginal);

        // 3. Impresión
        imprimirMatriz(matrizOriginal, "Matriz original (2x3):");
        imprimirMatriz(matrizTranspuesta, "\nMatriz transpuesta (3x2):");
    }

    /**
     * Convierte las filas de la matriz original en las columnas de la nueva matriz
     */
    public static int[][] calcularTranspuesta(int[][] matriz) {
        int m = matriz.length;          // Número de filas originales
        int n = matriz[0].length;       // Número de columnas originales

        // La transpuesta invierte las dimensiones (de m x n pasa a n x m)
        int[][] transpuesta = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpuesta[j][i] = matriz[i][j]; // Intercambio de coordenadas
            }
        }

        return transpuesta;
    }

    /**
     * Imprime cualquier matriz bidimensional que se le pase
     */
    public static void imprimirMatriz(int[][] matriz, String titulo) {
        System.out.println(titulo);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}