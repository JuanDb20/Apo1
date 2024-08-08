// La función input en Java no existe de manera nativa. Sin embargo, se puede utilizar la clase Scanner para leer la entrada del usuario.

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena: ");
        String inputString = scanner.nextLine();
        System.out.println("La cadena ingresada es: " + inputString);

        String salidaString = "Hola, mundo!";
        System.out.println(salidaString);
        // En este ejemplo, System.out.println(salidaString) imprime la cadena "Hola,
        // mundo!" en la consola.
    }

}