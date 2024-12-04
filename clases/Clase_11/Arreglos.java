import java.util.Scanner;

public class Arreglos {

    public static void main(String[] args) {
        // Arreglo de 24 casillas de variables tipo float para almacenar notas de
        // estudiantes
        float[] notas_s1 = new float[24];
        Scanner sc = new Scanner(System.in);

        float suma = 0.0f, promedio;
        // leer las notas desde consola
        for (int i = 0; i < notas_s1.length; i++) {
            System.out.print("Ingrese la nota del estudiante " + (i + 1) + ": ");
            notas_s1[i] = sc.nextFloat();
            suma = suma + notas_s1[i];
        }
        // promedio es la suma de notas dividida por el número de estudiantes
        promedio = suma / notas_s1.length;
        System.out.print("El promedio de las notas es: " + promedio);
    }
}