import java.util.Scanner;

public class ConversionProfe

    public static void main(String[] args) {
        
        int opcion;
        float usr_cent, usr_fahr, usr_kel, conv cent, conv_fahr, conv_kel;
        Scanner lector = new Scanner(System.in);
        System.out.println ("Conversion de temperaturas");
        System.out.println (" (1) Centigrados a Fahrenheit");
        System.out.println (" (2) Fahrenheit a Centigrados");
        System.out.println (" (3) Centigrados a Kelvin");
        System.out.println (" (4) Kelvin a Centigrados");
        System.out.println (" (5) Seleccione una opción\n");
        opcion = lector.nextInt();
        lector.nextLine();
        switch (opcion) {
            case 1:
              System.out.println("# Ingresa los grados centigrados:");
              usr_cent = lector.nextFloat()
              conv_fahr = (usr_cent * 1.8f) + 32;
              System.out.println("# Los grados Celsius son: " + celsius);
              break;
            case 2:
              System.out.println("# Ingresa los grados Celsius:");
              double celsius2 = scanner.nextDouble();
              double fahrenheit2 = (celsius2 * 9 / 5) + 32;
              System.out.println("# Los grados Fahrenheit son: " + fahrenheit2);
              break;
            case 3:
              System.out.println("# Ingresa los grados Kelvin:");
              double kelvin = scanner.nextDouble();
              double celsius3
            = kelvin - 273.15;
            System.out.println("# Los grados Celsius son: " + celsius3);
            break;
            case 4:
            System.out.println("# Hasta luego!");
            return;
            default:
            System.out.println("# Opción no válida.");
            break;
          
        }
    }
}