package arreglos;

import java.util.Random;

/**
 * Ejercicio 5: Inicializar un arreglo con 20 números aleatorios, 
 * invertir las cifras de cada número y guardarlos en un nuevo arreglo
 */
public class E5 {

    public static void main(String[] args) {
        int[] numeros = generarDatos(20);
        int[] invertidos = invertirNumeros(numeros);

        imprimirResultados(numeros, invertidos);
    }

    /**
     * Genera un arreglo de tamaño 'n' con números de 3 dígitos
     */
    public static int[] generarDatos(int n) {
        Random random = new Random();
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            // Genera números aleatorios garantizando que estén entre 100 y 999
            numeros[i] = random.nextInt(900) + 100; 
        }
        return numeros;
    }

    /**
     * Procesa un arreglo completo, invirtiendo cada uno de sus elementos
     */
    public static int[] invertirNumeros(int[] numeros) {
        int[] invertidos = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            invertidos[i] = invertirNumero(numeros[i]); // Inversión individual
        }
        return invertidos;
    }

    /**
     * Algoritmo matemático para darle la vuelta a un número entero
     * (Ejemplo: convierte 123 en 321).
     */
    public static int invertirNumero(int numero) {
        int invertido = 0;
        
        while (numero != 0) {
            int digito = numero % 10;                // Extrae el último dígito
            invertido = invertido * 10 + digito;     // Lo empuja a la nueva variable
            numero = numero / 10;                    // Elimina el último dígito del original
        }
        
        return invertido;
    }

    /**
     * Muestra la comparativa entre el arreglo original y el modificado
     */
    public static void imprimirResultados(int[] numeros, int[] invertidos) {
        System.out.println("Arreglo original:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println("\n");

        System.out.println("Arreglo con números invertidos:");
        for (int n : invertidos) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}