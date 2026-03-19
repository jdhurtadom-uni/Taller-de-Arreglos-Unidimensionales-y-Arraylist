package arreglos;

import java.util.Random;

/**
 * Ejercicio 4: Generar 25 números aleatorios entre -50 y 50 y encontrar 
 * el valor máximo y mínimo dentro del arreglo
 */
public class E4 {
    
    public static void main(String[] args) {
        int[] numeros = generarDatos(25);
        int menor = EncontrarMenor(numeros);
        int mayor = EncontrarMayor(numeros);

        imprimirResultados(numeros, menor, mayor);
    }
    
    /**
     * Llena un arreglo con números aleatorios que pueden ser negativos o positivos
     */
    public static int[] generarDatos(int n){
        Random random = new Random();
        int[] numeros = new int[n];
        for(int i = 0; i < n; i++){
            // nextInt(101) genera de 0 a 100. Restando 50, el rango queda de -50 a +50
            numeros[i] = random.nextInt(101) - 50;
        }
        return numeros;
    }
    
    /**
     * Busca el valor más pequeño dentro de un arreglo
     */
    public static int EncontrarMenor(int[] arreglo){
        int menor = arreglo[0]; // Asumimos que el primero es el menor inicialmente
        for (int numero : arreglo) {
            if (numero < menor) {
                menor = numero; // Se actualiza si encontramos uno más pequeño
            }
        }
        return menor;
    }
    
    /**
     * Busca el valor más grande dentro de un arreglo
     */
    public static int EncontrarMayor(int[] arreglo){
        int mayor = arreglo[0]; // Asumimos que el primero es el mayor inicialmente
        for (int numero : arreglo) {
            if (numero > mayor) {
                mayor = numero; // Se actualiza si encontramos uno más grande
            }
        }
        return mayor;
    }
    
    /**
     * Muestra la lista completa y los valores extremos encontrados
     */
    public static void imprimirResultados(int[] arreglo, int menor, int mayor){
        System.out.println("Números generados:");
        for (int n : arreglo) {
            System.out.print(n + " ");
        }
        System.out.println("\n");
        System.out.println("Menor número: " + menor);
        System.out.println("Mayor número: " + mayor);
    }
}