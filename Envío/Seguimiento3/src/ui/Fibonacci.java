import java.util.Scanner;

/**
 * Programa que calcula el n-ésimo número de la serie de Fibonacci
 * @param args n: entero que representa el n-ésimo número de la serie de Fibonacci
 * @return el n-ésimo número de la serie de Fibonacci
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Ingrese el n-ésimo número de la serie de Fibonacci:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Si el usuario ingresa 0, debe devolver un mensaje de error
        if (n == 0) {
            System.out.println("Por favor, use un número mayor a 0.");
            return;
        }

        // Si el usuario ingresa 1 o 2, devolver 1 directamente
        if (n == 1) {
            System.out.println("El término 1 de la serie de Fibonacci es: 1");
            return;
        } else if (n == 2) {
            System.out.println("El término 2 de la serie de Fibonacci es: 1");
            return;
        }

        int[] secuenciaFibo = new int[n];  // Crear el arreglo para almacenar la secuencia

        // Inicializar los primeros dos números de la secuencia
        secuenciaFibo[0] = 1;
        secuenciaFibo[1] = 1;

        // Generar la serie Fibonacci desde el tercer número en adelante
        for (int i = 2; i < n; i++) {
            secuenciaFibo[i] = secuenciaFibo[i - 1] + secuenciaFibo[i - 2];
        }

        // Imprimir cada iteración de la serie hasta el n-ésimo término con relleno de ceros
        for (int i = 0; i < n; i++) {
            System.out.print("Iteración " + (i + 1) + ": [");
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    System.out.print(secuenciaFibo[j]);
                } else {
                    System.out.print(0);  // Rellenar con ceros
                }
                if (j < n - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }

        // Imprimir el término n-ésimo
        System.out.println("El término " + n + " de la serie de Fibonacci es: " + secuenciaFibo[n - 1]);
    }
}
