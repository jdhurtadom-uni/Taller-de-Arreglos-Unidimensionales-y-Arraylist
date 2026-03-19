package matrices;

import java.util.Random;
import java.util.Scanner;

/**
 * Ejercicio 11: Inicializar una matriz de m x n con números aleatorios.
 * Leer un entero por teclado y buscar su primera ocurrencia en la matriz,
 * indicando su posición o si no se encuentra
 */
public class E11 {

    public static void main(String[] args) {
        int m = 4; // Número de filas
        int n = 5; // Número de columnas

        int[][] matriz = generarMatrizAleatoria(m, n);
        imprimirMatriz(matriz, "Matriz Generada:");

        int numeroBuscado = solicitarNumero();
        buscarEnMatriz(matriz, numeroBuscado);
    }

    /**
     * Crea y llena una matriz bidimensional con números aleatorios del 1 al 50
     */
    public static int[][] generarMatrizAleatoria(int filas, int columnas) {
        Random random = new Random();
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(50) + 1;
            }
        }
        return matriz;
    }

    /**
     * Pide al usuario el número que desea buscar
     */
    public static int solicitarNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nIngrese número a buscar: ");
        int numero = sc.nextInt();
        // Nota: no cerramos el scanner aquí para evitar problemas si se requiere más adelante
        return numero;
    }

    /**
     * Recorre la matriz secuencialmente para buscar un número.
     * Se detiene al encontrar la primera coincidencia (usando un return para salir rápido)
     */
    public static void buscarEnMatriz(int[][] matriz, int numero) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
                if (matriz[i][j] == numero) {
                    System.out.println("El número " + numero + " se encuentra en la posición: Fila " + i + ", Columna " + j);
                    return; // Terminamos la ejecución del método inmediatamente (solo primera ocurrencia)
                }
            }
        }
        System.out.println("El número " + numero + " NO se encuentra en la matriz.");
    }

    /**
     * Método genérico para imprimir la matriz de forma tabular
     */
    public static void imprimirMatriz(int[][] matriz, String titulo) {
        System.out.println(titulo);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t"); // \t tabula para que quede alineado
            }
            System.out.println();
        }
    }
}