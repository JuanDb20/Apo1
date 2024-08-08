//Scanner es una clase en Java que permite leer datos de entrada desde el teclado, archivos, etc.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre:");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su edad:");
        int edad = scanner.nextInt();

        System.out.println("Hola " + nombre + "! Tienes " + edad + " años.");
    }
}
// En este ejemplo, el programa solicita al usuario su nombre y edad, y luego imprime un mensaje de bienvenida con esos datos. La clase Scanner se utiliza para leer los valores ingresados por el usuario.