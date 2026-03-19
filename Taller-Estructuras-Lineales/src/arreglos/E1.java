package arreglos;

/**
 * Ejercicio 1: Inicializar directamente un arreglo con los primeros 10 números primos 
 * e imprimir el arreglo.
 */
public class E1 {

    public static void main(String[] args) {
        int[] primos = generarDatos();   //  Obtener los datos base
        procesarDatos(primos);           //  Analizar o transformar los datos
        imprimirResultados(primos);      //  Mostrar el resultado final
    }

    /**
     * @return Un arreglo de enteros que contiene los primeros 10 números primos.
     */
    public static int[] generarDatos() {
        int[] primos = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        return primos;
    }

    /**
     * Procesa los datos del arreglo.Para calcular y 
     * mpstrar la cantidad total de elementos.
     * @param arreglo El arreglo a procesar.
     */
    public static void procesarDatos(int[] arreglo) {
        System.out.println("Cantidad de números primos: " + arreglo.length);
    }

    /**
     * Recorre el arreglo y muestra cada número separado por un espacio.
     * @param arreglo El arreglo de números primos que se va a imprimir.
     */
    public static void imprimirResultados(int[] arreglo) {
        System.out.println("Primeros 10 números primos:");
        for (int numero : arreglo) {
            System.out.print(numero + " ");
        }
    }
}