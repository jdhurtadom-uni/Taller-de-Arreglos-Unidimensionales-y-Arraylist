package arreglos;

/**
 * Ejercicio 2: Inicializar un arreglo con los 100 primeros números pares 
 * e imprimirlo en una sola línea y luego distribuido en 10 líneas
 */
public class E2 {
    
    public static void main(String[] args) {
        int[] pares = generarDatos();   // Generación de la lista de pares
        imprimirUnaLinea(pares);        // Impresión continua
        imprimirDiezLineas(pares);      // Impresión formateada en bloques
    }

    /**
     *  Se crea un arreglo de tamaño 100 y lo llena matemáticamente con números pares.
     * @return arreglo de enteros con números pares del 2 al 200
     */
    public static int[] generarDatos() {
        int[] pares = new int[100];
        for (int i = 0; i < pares.length; i++) {
            // La fórmula (i + 1) * 2 garantiza que el primer número sea 2, luego 4, etc
            pares[i] = (i + 1) * 2; 
        }
        return pares;
    }

    /**
     * Imprimira todos los elementos del arreglo de forma horizontal
     */
    public static void imprimirUnaLinea(int[] arreglo) {
        System.out.println("Números pares en una sola línea: ");
        for(int numero : arreglo){
            System.out.print(numero + " ");
        }
        System.out.println("\n"); // Salto de línea doble al final para separar
    }

    /**
     * Imprime los elementos agrupándolos en bloques de 10 por línea
     */
    public static void imprimirDiezLineas(int[] arreglo) {
        System.out.println("Números pares en diez líneas: ");
        int indice = 0; // Controla la posición actual dentro del arreglo global

        // Se crea un Bucle externo para controlar las 10 filas
        for (int linea = 0; linea < 10; linea++) {
            System.out.print("Línea " + linea + ": ");

            // Bucle interno: imprime 10 números por cada fila
            for (int i = 0; i < 10; i++) {
                System.out.print(arreglo[indice] + " ");
                indice++; // Avanzamos al siguiente número del arreglo
            }
            System.out.println(); // Salto de línea al terminar la fila
        }
    }
}
    

    
