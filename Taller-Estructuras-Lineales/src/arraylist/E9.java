package arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Ejercicio 9: Generar un ArrayList con 20 números aleatorios entre 1 y 100.
 * Crear copias de la lista para ordenarlas de forma ascendente, descendente 
 * y separarlas en pares e impares
 */
public class E9 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = generarDatos(20);

        // Copiamos la lista para no alterar la original
        ArrayList<Integer> ascendente = new ArrayList<>(numeros);
        Collections.sort(ascendente); // Ordena de menor a mayor

        ArrayList<Integer> descendente = new ArrayList<>(numeros);
        Collections.sort(descendente, Collections.reverseOrder()); // Ordena de mayor a menor

        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        separarNumeros(numeros, pares, impares);

        imprimirLista("Lista original", numeros);
        imprimirLista("Orden ascendente", ascendente);
        imprimirLista("Orden descendente", descendente);
        imprimirLista("Números pares", pares);
        imprimirLista("Números impares", impares);
    }

    /**
     * Genera 'n' números aleatorios entre el 1 y el 100
     */
    public static ArrayList<Integer> generarDatos(int n) {

        Random random = new Random();
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numeros.add(random.nextInt(100) + 1);
        }

        return numeros;
    }

    /**
     * Recorre la lista base y clasifica sus elementos matemáticamente 
     * inyectándolos por referencia en las listas de pares e impares
     */
    public static void separarNumeros(ArrayList<Integer> numeros,
                                      ArrayList<Integer> pares,
                                      ArrayList<Integer> impares) {

        for (int n : numeros) {

            // Si el residuo de la división entre 2 es 0, es par
            if (n % 2 == 0) {
                pares.add(n);
            } else {
                impares.add(n);
            }

        }
    }

    /**
     * Método genérico para imprimir cualquier lista con un título personalizado
     */
    public static void imprimirLista(String titulo, ArrayList<Integer> lista) {

        System.out.println(titulo + ":");

        for (int n : lista) {
            System.out.print(n + " ");
        }

        System.out.println("\n");
    }
}