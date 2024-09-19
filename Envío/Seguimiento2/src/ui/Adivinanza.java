import java.util.Scanner;

public class Adivinanza {
    /**La funcion saluda al usuario
     * @param args 
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido a una adivinanza");
        jugarAdivinanza(); 
    }

    /** La funcion genera un numero aleatorio entre 1 y 40.
     * @return El número generado aleatoriamente.
     */
    public static int generarNumeroAleatorio() {
        // Generar un número aleatorio entre 1 y 100
        int numeroAleatorio = (int) (Math.random() * 40) + 1;
        return numeroAleatorio;

    }
    /** La funcion juega la adivinanza
     * @return El número que ha adivinado el usuario o 0 si no ha adivinado para salir del while.
     */
    public static int jugarAdivinanza() {
        int numeroAleatorio = generarNumeroAleatorio();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adivina el número que he generado (entre 1 y 40): ");
        int intentos = 0;
        int maxIntentos = 10;

        while (intentos < maxIntentos) {
            if (scanner.hasNextInt()) {
                int numeroUsuario = scanner.nextInt();
                intentos++;
                if (numeroUsuario == numeroAleatorio) {
                    System.out.println("Acertaste!");
                    scanner.close();
                    return numeroUsuario;
                } else if (numeroUsuario < numeroAleatorio) {
                    System.out.println("El número generado es más alto. Inténtalo de nuevo. (" + (maxIntentos - intentos) + " intentos restantes)");
                } else {
                    System.out.println("El número generado es más bajo. Inténtalo de nuevo. (" + (maxIntentos - intentos) + " intentos restantes)");
                }
            } else {
                System.out.println("Por favor, ingresa un número entero.");
                scanner.next(); 
            }
        }

        System.out.println("Lo siento, has agotado tus intentos. El número era " + numeroAleatorio);
        scanner.close();
        return 0; // El usuario no ha adivinado el número
    }
}

