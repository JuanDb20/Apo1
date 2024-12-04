import java.util.*;
public class ConversionTemp {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
          System.out.println("# Bienvenido. escoge lo que quieres convertir.");
          System.out.println("# 1. Convertir grados Fahrenheit a Celsius.");
         System.out.println("# 2. Convertir grados Celsius a Fahrenheit.");
         System.out.println("# 3. Convertir Kelvin a Celsius.");
         System.out.println("# 4. salir.");
    
          int opcion = scanner.nextInt();
          scanner.nextLine();
    
          switch (opcion) {
            case 1:
              System.out.println("# Ingresa los grados Fahrenheit:");
              double fahrenheit = scanner.nextDouble();
              double celsius = (fahrenheit - 32) * 5 / 9;
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