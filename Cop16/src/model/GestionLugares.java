import java.util.*;
/**
 * La clase {@code GestionLugares} proporciona una aplicación para gestionar y consultar lugares con diversidad biológica.
 * Permite registrar lugares, consultar su área ordenadamente, y determinar el departamento con más lugares registrados.
 * @author Juan Diego Balanta Molina
 */
public class GestionLugares {
    /**
     * La clase interna {@code Lugar} representa un lugar biodiverso con nombre, departamento y área.
     */
    static class Lugar {
        String nombre; /// Nombre del lugar
        String departamento; /// Departamento en el que se encuentra el lugar
        int km2; /// Area del lugar en kilómetros cuadrados
         /**
         * Función para inicializar un lugar biodiverso.
         *
         * @param nombre Nombre del lugar
         * @param departamento Departamento donde se encuentra el lugar
         * @param km2 Área del lugar en kilómetros cuadrados
         */

        Lugar(String nombre, String departamento, int km2) {
            this.nombre = nombre;
            this.departamento = departamento;
            this.km2 = km2;
        }
    }
  /**
     * Método principal que ejecuta la aplicación de gestión de lugares biodiversos.
     * Proporciona un menú para registrar lugares, consultar lugares ordenados por área, y determinar el departamento con más lugares.
     *
     * 
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Lugar> lugares = new ArrayList<>();
        Map<String, Integer> departamentoCount = new HashMap<>();

              // Menú de opciones para el usuario
            System.out.println("# Bienvenido voluntario a la aplicación de Gestión de Lugares Biodiversos COP 16 Cali - Colombia.");
            System.out.println("# Te presentamos las siguientes opciones, ingresa:");
            System.out.println("# 1. Para registrar un lugar con diversidad biológica");
            System.out.println("# 2. Para consultar los lugares ordenados de menor a mayor con respecto al área");
            System.out.println("# 3. Para consultar el departamento que tiene más lugares con diversidad biológica registrados hasta el momento.");
            System.out.println("# 4. Para salir del programa.");
            int opcion = scanner.nextInt(); // Leer la opción del usuario
            scanner.nextLine();   // Limpiar

            switch (opcion) {
                case 1:
                 // Registro de un nuevo lugar biodiverso

                    System.out.println("# Ingresa el nombre del lugar biodiverso");
                    String nombre = scanner.nextLine();// Leer nombre del lugar
                    System.out.println("# Ingresa el departamento en el cual está el lugar");
                    String departamento = scanner.nextLine(); // Leer departamento
                    System.out.println("# Ingresa la cantidad de kilómetros cuadrados que abarca el lugar");
                    int km2 = scanner.nextInt(); // Leer área del lugar
                    scanner.nextLine();  // Limpiar
                    lugares.add(new Lugar(nombre, departamento, km2)); // Añadir el lugar a la lista
                    departamentoCount.put(departamento, departamentoCount.getOrDefault(departamento, 0) + 1);  // Actualizar el conteo de lugares por departamento
                    System.out.println("# Lugar ingresado con éxito.");
                    break;
                case 2:
                    // Consulta de lugares ordenados por área

                    lugares.sort(Comparator.comparingInt(l -> l.km2));// Ordenar la lista por área
                    System.out.println("# Los lugares ordenados de menor a mayor con respecto al área hasta el momento son:");
                    for (Lugar lugar : lugares) {
                        System.out.println("# " + lugar.nombre + " - " + lugar.km2 + " kilómetros cuadrados.");
                    }
                    break;
                case 3: 
                 // Consulta del departamento con más lugares
                    String maxDept = Collections.max(departamentoCount.entrySet(), Map.Entry.comparingByValue()).getKey();
                    int maxCount = departamentoCount.get(maxDept);
                    System.out.println("# El departamento con más lugares biodiversos registrados es: " + maxDept + ", con " + maxCount + " lugares biodiversos.");
                    break;
                case 4:
                 // Salir del programa
                    System.out.println("# Gracias por usar la aplicación. ¡Hasta luego!");
                    return; //  Terminar la ejecución del programa
                default:
                // Opción inválida
                    System.out.println("# Opción inválida. Por favor, ingresa una opción válida.");
            
        }
    }
}
