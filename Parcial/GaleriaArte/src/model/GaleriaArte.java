import java.util.Scanner;

/**
 * Clase principal para gestionar una galería de arte.
 * Solicita al usuario el registro de obras de arte y permite realizar diversas operaciones sobre ellas.
 * @author Juan Diego Balanta Molina A00407538
 */
public class GaleriaArte {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar número de obras de arte
        System.out.print("¿Cuántas obras de arte quieres registrar? ");
        int numObras = scanner.nextInt();
        scanner.nextLine(); 

        // Crear arreglos para almacenar nombres y precios
        String[] nombresObras = new String[numObras];
        double[] preciosObras = new double[numObras];

        // Registrar obras de arte
        registrarObrasDeArte(nombresObras, preciosObras, scanner);

        // Mostrar menú de opciones
        mostrarMenu(nombresObras, preciosObras, scanner);

        scanner.close();
    }

    /**
     * Contrato: Registrar el nombre y precio de cada obra de arte.
     * @param nombresArreglo Arreglo que almacena los nombres de las obras.
     * @param preciosArreglo Arreglo que almacena los precios de las obras.
     * @param scanner Objeto Scanner para leer la entrada del usuario.
     */
    public static void registrarObrasDeArte(String[] nombresArreglo, double[] preciosArreglo, Scanner scanner) {
        for (int i = 0; i < nombresArreglo.length; i++) {
            System.out.println("Obra de arte #" + (i + 1));
    
            // Solicitar el nombre usando nextLine para permitir espacios
            System.out.print("Nombre de la obra: ");
            nombresArreglo[i] = scanner.nextLine(); 
    
            double precio = 0;
            boolean esValido;
            do {
                System.out.print("Precio de la obra (entre 100 y 10000): ");
                if (scanner.hasNextDouble()) {
                    precio = scanner.nextDouble();
                    esValido = precio >= 100 && precio <= 10000;
                    if (!esValido) {
                        System.out.println("El precio debe estar entre 100 y 10000.");
                    }
                } else {
                    System.out.println("Entrada inválida. Por favor, introduce un número.");
                    esValido = false;
                    scanner.next(); 
                }
            } while (!esValido);
    
            preciosArreglo[i] = precio;
            scanner.nextLine(); 
        }
    }
    
    /**
     * Contrato: Mostrar el menú de opciones y ejecutar las funciones
     * correspondientes.
     * 
     * @param nombresArreglo Arreglo que almacena los nombres de las obras.
     * @param preciosArreglo Arreglo que almacena los precios de las obras.
     * @param scanner        Objeto Scanner para leer la entrada del usuario.
     */
    public static void mostrarMenu(String[] nombresArreglo, double[] preciosArreglo, Scanner scanner) {
        int opcion;
        do {
            System.out.println("\nOpciones:");
            System.out.println("1. Mostrar todas las obras de arte y sus precios");
            System.out.println("2. Mostrar la obra de arte más cara");
            System.out.println("3. Mostrar la obra de arte más barata");
            System.out.println("4. Calcular el precio promedio de las obras de arte");
            System.out.println("5. Mostrar obras de arte cuyo precio esté por encima de un valor");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarObras(nombresArreglo, preciosArreglo);
                    break;
                case 2:
                    String obraMasCara = obtenerObraMasCara(nombresArreglo, preciosArreglo);
                    System.out.println("La obra más cara es: " + obraMasCara);
                    break;
                case 3:
                    String obraMasBarata = obtenerObraMasBarata(nombresArreglo, preciosArreglo);
                    System.out.println("La obra más barata es: " + obraMasBarata);
                    break;
                case 4:
                    double promedio = obtenerPrecioPromedio(preciosArreglo);
                    System.out.println("El precio promedio de las obras es: $" + promedio);
                    break;
                case 5:
                    System.out.print("Introduce el valor de precio mínimo: ");
                    double precioMinimo = scanner.nextDouble();
                    mostrarObrasPorPrecio(nombresArreglo, preciosArreglo, precioMinimo);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

        } while (opcion != 6);
    }

    /**
     * Contrato: Mostrar todas las obras de arte con sus precios.
     * 
     * @param nombresArreglo Arreglo que almacena los nombres de las obras.
     * @param preciosArreglo Arreglo que almacena los precios de las obras.
     */
    public static void mostrarObras(String[] nombresArreglo, double[] preciosArreglo) {
        System.out.println("Obras de arte registradas:");
        for (int i = 0; i < nombresArreglo.length; i++) {
            System.out.println(nombresArreglo[i] + " - $" + preciosArreglo[i]);
        }
    }

    /**
     * Contrato: Encontrar y retornar el nombre de la obra de arte más cara.
     * 
     * @param nombresArreglo Arreglo que almacena los nombres de las obras.
     * @param preciosArreglo Arreglo que almacena los precios de las obras.
     * @return El nombre de la obra de arte más cara.
     */
    public static String obtenerObraMasCara(String[] nombresArreglo, double[] preciosArreglo) {
        double maxPrecio = preciosArreglo[0];
        int index = 0;
        for (int i = 1; i < preciosArreglo.length; i++) {
            if (preciosArreglo[i] > maxPrecio) {
                maxPrecio = preciosArreglo[i];
                index = i;
            }
        }
        return nombresArreglo[index];
    }

    /**
     * Contrato: Encontrar y retornar el nombre de la obra de arte más barata.
     * 
     * @param nombresArreglo Arreglo que almacena los nombres de las obras.
     * @param preciosArreglo Arreglo que almacena los precios de las obras.
     * @return El nombre de la obra de arte más barata.
     */
    public static String obtenerObraMasBarata(String[] nombresArreglo, double[] preciosArreglo) {
        double minPrecio = preciosArreglo[0];
        int index = 0;
        for (int i = 1; i < preciosArreglo.length; i++) {
            if (preciosArreglo[i] < minPrecio) {
                minPrecio = preciosArreglo[i];
                index = i;
            }
        }
        return nombresArreglo[index];
    }

    /**
     * Contrato: Calcular y retornar el precio promedio de las obras de arte.
     * 
     * @param preciosArreglo Arreglo que almacena los precios de las obras.
     * @return El precio promedio de las obras de arte.
     */
    public static double obtenerPrecioPromedio(double[] preciosArreglo) {
        double suma = 0;
        for (double precio : preciosArreglo) {
            suma += precio;
        }
        return suma / preciosArreglo.length;
    }

    /**
     * Contrato: Mostrar todas las obras de arte cuyo precio esté por encima de un
     * valor dado.
     * 
     * @param nombresArreglo Arreglo que almacena los nombres de las obras.
     * @param preciosArreglo Arreglo que almacena los precios de las obras.
     * @param precioMinimo   Precio mínimo para filtrar las obras.
     */
    public static void mostrarObrasPorPrecio(String[] nombresArreglo, double[] preciosArreglo, double precioMinimo) {
        System.out.println("Obras cuyo precio es mayor a $" + precioMinimo + ":");
        for (int i = 0; i < preciosArreglo.length; i++) {
            if (preciosArreglo[i] > precioMinimo) {
                System.out.println(nombresArreglo[i] + " - $" + preciosArreglo[i]);
            }
        }
    }
}