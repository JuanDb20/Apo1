import java.util.Scanner;

public class Rutas {

    /**
     * Método principal que ejecuta la aplicación.
     * Solicita datos del usuario, selecciona la ruta, solicita y verifica condiciones meteorológicas,
     * calcula el número de buses necesarios, y muestra toda la información.
     * @author Juan Diego Balanta Molina A00407538 y Daniel Francisco Varela A00407620 - Cali, Colombia
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre = solicitarNombre(scanner);
        String cedula = solicitarCedula(scanner);
        saludarUsuario(nombre);

        String[] detallesRuta = seleccionarRuta(scanner);
        mostrarDetallesRuta(detallesRuta);

        int participantes = solicitarCantidad(scanner, "participantes");
        int guias = solicitarCantidad(scanner, "guías");
        int totalPersonas = participantes + guias;

        solicitarYVerificarCondicionesMeteorologicas(scanner);

        calcularYMostrarBuses(totalPersonas);
    }

    /**
     * Solicita al usuario su nombre.
     * 
     * @param scanner El Scanner utilizado para leer la entrada del usuario.
     * @return El nombre ingresado por el usuario.
     */
    public static String solicitarNombre(Scanner scanner) {
        System.out.println("# Bienvenido voluntario a la aplicación de Interacción de Rutas Ecológicas COP 16 Cali - Colombia. ¿Cuál es tu nombre?");
        return scanner.nextLine();
    }

    /**
     * Solicita al usuario su cédula.
     * 
     * @param scanner El oScanner utilizado para leer la entrada del usuario.
     * @return La cédula ingresada por el usuario.
     */
    public static String solicitarCedula(Scanner scanner) {
        System.out.println("# Por favor, digita tu cédula.");
        return scanner.nextLine();
    }

    /**
     * Muestra un saludo al voluntario.
     * 
     * @param nombre El nombre del usuario que se va a saludar.
     */
    public static void saludarUsuario(String nombre) {
        System.out.println("# ¡Bienvenido, " + nombre + "!");
    }

    /**
     * Solicita al usuario que seleccione una ruta y devuelve los detalles de la misma.
     * 
     * @param scanner El Scanner utilizado para leer la entrada del usuario.
     * @return Un arreglo de Strings con los detalles de la ruta seleccionada
     *         [punto de encuentro, hora de inicio, hora de fin].
     */
    public static String[] seleccionarRuta(Scanner scanner) {
        System.out.println("# ¿Qué ruta registrarás el día de hoy?");
        System.out.println("1. Ruta de los Farallones");
        System.out.println("2. Ruta del Oriente");
        System.out.println("3. Ruta de Ladera");
        int ruta = scanner.nextInt();
        scanner.nextLine();

        String puntoEncuentro = "";
        String horaInicio = "";
        String horaFin = "";

        switch (ruta) {
            case 1:
                puntoEncuentro = "Calle 16 - Universidad del Valle";
                horaInicio = "6:40 am";
                horaFin = "4:00 pm";
                break;
            case 2:
                puntoEncuentro = "Bulevar del Río";
                horaInicio = "7:00 am";
                horaFin = "1:00 pm";
                break;
            case 3:
                puntoEncuentro = "Bulevar del Río";
                horaInicio = "7:00 am";
                horaFin = "1:30 pm";
                break;
            default:
                System.out.println("# Opción de ruta inválida.");
                return new String[]{"", "", ""};
        }

        return new String[]{puntoEncuentro, horaInicio, horaFin};
    }

    /**
     * Muestra los detalles de la ruta seleccionada.
     * 
     * @param detallesRuta Un arreglo de Strings con los detalles de la ruta
     *                     [punto de encuentro, hora de inicio, hora de fin].
     */
    public static void mostrarDetallesRuta(String[] detallesRuta) {
        System.out.println("# ¡Excelente! La Ruta seleccionada tiene como punto de encuentro " + detallesRuta[0]
                + ", iniciando a las " + detallesRuta[1] + ", y termina a las " + detallesRuta[2] + ".");
    }

    /**
     * Solicita al usuario la cantidad de participantes o guías.
     * 
     * @param scanner El Scanner utilizado para leer la entrada del usuario.
     * @param tipo    Un String que indica si se está solicitando la cantidad de
     *                "participantes" o "guías".
     * @return La cantidad ingresada de participantes o guías.
     */
    public static int solicitarCantidad(Scanner scanner, String tipo) {
        System.out.println("# ¿Cuántos " + tipo + " acudirán a la caminata el día de hoy?");
        return scanner.nextInt();
    }

    /**
     * Solicita al usuario las condiciones meteorológicas (temperatura y humedad),
     * y verifica si las condiciones son adecuadas para la caminata.
     * 
     * @param scanner El Scanner utilizado para leer la entrada del usuario.
     */
    public static void solicitarYVerificarCondicionesMeteorologicas(Scanner scanner) {
        System.out.println("# Ingresar la temperatura en grados centígrados °C");
        float temperatura = scanner.nextFloat();
        
        System.out.println("# Ingresar el porcentaje de humedad relativa");
        float humedad = scanner.nextFloat();

        if (temperatura >= 20 && temperatura <= 25 && humedad >= 40 && humedad <= 60) {
            System.out.println("# ¡Hace un buen día para caminar por Cali!");
        }
    }

    /**
     * Calcula el número de buses necesarios para transportar a todos los
     * participantes y guías, y muestra el resultado.
     * 
     * @param totalPersonas La cantidad total de personas que participarán en la
     *                      caminata.
     */
    public static void calcularYMostrarBuses(int totalPersonas) {
        int busesNecesarios = (totalPersonas + 24) / 25;
        System.out.println("# Al ser un total de " + totalPersonas
                + " personas que harán parte de la actividad, se necesitarán un total de: " + busesNecesarios
                + " buses para llevarla a cabo de manera exitosa. ¡Nos vemos en la COP16!");
    }
}
