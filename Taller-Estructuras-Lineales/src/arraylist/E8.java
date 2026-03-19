package arraylist;
import java.util.ArrayList;
import java.util.Random;

/**
 * Ejercicio 8: Generar un ArrayList con 100 números aleatorios entre 1 y 20.
 * Construir una tabla de frecuencias e identificar el número más repetido
 */
public class E8 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = generarDatos(100);

        int[] frecuencias = calcularFrecuencias(numeros);

        imprimirResultados(numeros, frecuencias);
    }

    /**
     * Crea una lista de tamaño 'n' con valores aleatorios del 1 al 20
     */
    public static ArrayList<Integer> generarDatos(int n) {

        Random random = new Random();
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numeros.add(random.nextInt(20) + 1);
        }

        return numeros;
    }

    /**
     * Calcula cuántas veces aparece cada número.
     * Utiliza un arreglo primitivo donde el ÍNDICE representa el número 
     * y el VALOR almacena la cantidad de veces que apareció.
     */
    public static int[] calcularFrecuencias(ArrayList<Integer> numeros) {

        int[] frecuencias = new int[21]; // Tamaño 21 para usar índices del 1 al 20

        for (int numero : numeros) {
            frecuencias[numero]++; // Aumenta el contador en la posición del número
        }

        return frecuencias;
    }

    /**
     * Imprime la lista original, la tabla de distribución y determina el máximo
     */
    public static void imprimirResultados(ArrayList<Integer> numeros, int[] frecuencias) {

        System.out.println("Lista generada:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }

        System.out.println("\n");
        System.out.println("Número | Frecuencia");

        int maxFrecuencia = 0;
        int numeroMasFrecuente = 0;

        // Recorremos las frecuencias para encontrar la mayor
        for (int i = 1; i <= 20; i++) {

            System.out.println(i + " | " + frecuencias[i]);

            if (frecuencias[i] > maxFrecuencia) {
                maxFrecuencia = frecuencias[i];
                numeroMasFrecuente = i; // Guardamos quién fue el número ganador
            }
        }

        System.out.println("\nNúmero más frecuente: " + numeroMasFrecuente);
        System.out.println("Frecuencia: " + maxFrecuencia);
    }
}