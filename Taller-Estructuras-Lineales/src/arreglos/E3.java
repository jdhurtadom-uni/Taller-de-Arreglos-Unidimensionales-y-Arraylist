package arreglos;

import java.util.Random;

/**
 * Ejercicio 3: Leer "n"números aleatorios, calcular el factorial de cada uno 
 * y almacenar los resultados en un segundo arreglo
 */
public class E3 {

    public static void main(String[] args) {
        int n = 10; // Cantidad de números a generar
        int[] numeros = generarDatos(n);
        long[] factoriales = calcularFactoriales(numeros);

        imprimirResultados(numeros, factoriales);
    }

    /**
     * Genera un arreglo de tamaño 'n' con números enteros aleatorios
     * @param n Tamaño del arreglo
     * @return Arreglo con números aleatorios entre 1 y 10
     */
    public static int[] generarDatos(int n) {
        Random random = new Random();
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            // random.nextInt(10) genera de 0 a 9. Se suma 1 para que sea de 1 a 10
            numeros[i] = random.nextInt(10) + 1; 
        }
        return numeros;
    }

    /**
     * Recorre un arreglo de números y calcula el factorial de cada uno
     * @param numeros Arreglo original de enteros
     * @return Arreglo de tipo 'long' con los factoriales
     */
    public static long[] calcularFactoriales(int[] numeros) {
        long[] factoriales = new long[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            factoriales[i] = factorial(numeros[i]); // Llamada al método de cálculo
        }
        return factoriales;
    }

    /**
     * Calcula la operación matemática factorial (ej: 5! = 5*4*3*2*1).
     */
    public static long factorial(int numero) {
        long resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i; // Multiplicación acumulativa
        }
        return resultado;
    }

    /**
     * Imprime tanto el arreglo original como el de los factoriales calculados.
     */
    public static void imprimirResultados(int[] numeros, long[] factoriales) {
        System.out.println("Arreglo de números:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println("\n");

        System.out.println("Arreglo de factoriales:");
        for (long f : factoriales) {
            System.out.print(f + " ");
        }
        System.out.println();
    }
}