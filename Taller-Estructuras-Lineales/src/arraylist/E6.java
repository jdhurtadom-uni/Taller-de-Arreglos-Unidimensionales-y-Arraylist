package arraylist;

import java.util.ArrayList;
import java.util.Random;

/**
 * Ejercicio 6: Leer números aleatorios entre -10 y 10 en un ArrayList 
 * hasta que salga el número 10. Calcular y mostrar la suma y la media de los números leídos.
 */
public class E6 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = generarDatos();

        int suma = calcularSuma(numeros);
        double media = calcularMedia(numeros, suma);

        imprimirResultados(numeros, suma, media);
    }

    /**
     * Genera números aleatorios entre -10 y 10 y los agrega a la lista.
     * El bucle se detiene en el momento en que se genera el número 10.
     * @return ArrayList con los números generados.
     */
    public static ArrayList<Integer> generarDatos() {

        Random random = new Random();
        ArrayList<Integer> numeros = new ArrayList<>();

        int numero;

        // Usamos do-while para asegurar que al menos se genere un número
        do {
            numero = random.nextInt(21) - 10; // Rango de -10 a 10
            numeros.add(numero);
        } while (numero != 10);

        return numeros;
    }

    /**
     * Calcula la sumatoria de todos los elementos de la lista.
     */
    public static int calcularSuma(ArrayList<Integer> numeros) {

        int suma = 0;

        for (int n : numeros) {
            suma += n;
        }

        return suma;
    }

    /**
     * Calcula el promedio matemático de la lista.
     * Convierte la suma a 'double' para no perder los decimales en la división.
     */
    public static double calcularMedia(ArrayList<Integer> numeros, int suma) {

        return (double) suma / numeros.size();
    }

    /**
     * Imprime en consola la lista generada, su suma total y el promedio.
     */
    public static void imprimirResultados(ArrayList<Integer> numeros, int suma, double media) {

        System.out.println("Números leídos:");

        for (int n : numeros) {
            System.out.print(n + " ");
        }

        System.out.println("\n");

        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
    }
}