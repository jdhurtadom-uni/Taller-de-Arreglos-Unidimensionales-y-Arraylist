package arraylist;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejercicio 7: Inicializar un ArrayList con los 20 primeros números pares.
 * Permitir al usuario insertar un número manteniendo el orden y eliminar un número específico
 */
public class E7 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = generarDatos();

        imprimirLista(numeros);

        insertarNumero(numeros);
        imprimirLista(numeros);

        eliminarNumero(numeros);
        imprimirLista(numeros);
    }

    /**
     * Genera dinámicamente una lista con los primeros 20 números pares positivos
     */
    public static ArrayList<Integer> generarDatos() {

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            numeros.add(i * 2); // Multiplicar por 2 garantiza que sea par
        }

        return numeros;
    }

    /**
     * Pide un número al usuario y lo inserta en la posición correcta 
     * para mantener la lista ordenada de menor a mayor.
     */
    public static void insertarNumero(ArrayList<Integer> numeros) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número para insertar: ");
        int numero = sc.nextInt();

        int i = 0;

        // Busca el primer índice donde el número actual es mayor al ingresado
        while (i < numeros.size() && numeros.get(i) < numero) {
            i++;
        }

        numeros.add(i, numero); // Inserta desplazando los demás a la derecha
        // Nota: Mantenemos el scanner abierto si lo usamos en el mismo hilo luego
    }

    /**
     * Solicita al usuario un número y lo elimina de la lista si existe.
     */
    public static void eliminarNumero(ArrayList<Integer> numeros) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número a eliminar: ");
        int numero = sc.nextInt();

        // Usamos Integer.valueOf() para obligar a Java a borrar el OBJETO (el valor)
        // y no el ÍNDICE (la posición).
        if (numeros.remove(Integer.valueOf(numero))) {
            System.out.println("Número eliminado.");
        } else {
            System.out.println("El número no existe en la lista.");
        }
        sc.close();
    }

    /**
     * Recorre la lista y la imprime separada por espacios.
     */
    public static void imprimirLista(ArrayList<Integer> numeros) {

        System.out.println("ArrayList:");

        for (int n : numeros) {
            System.out.print(n + " ");
        }

        System.out.println("\n");
    }
}