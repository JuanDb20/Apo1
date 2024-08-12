import java.util.Scanner;
/**
 * @author Juan Diego Balanta Molina A00407538
 * La clase {@code Rutas} es una aplicación que permite a un voluntario ingresar la información
 * de una ruta ecológica para la COP 16 en Cali, incluyendo la ruta seleccionada, el número de participantes,
 * guías, condiciones meteorológicas, y el cálculo del número de buses necesarios para el transporte.
 * 
 */
public class Rutas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario su nombre y cédula, y muestra un saludo de bienvenida.

        System.out.println(
                "# Bienvenido voluntario a la aplicación de Interacción de Rutas Ecológicas COP 16 Cali - Colombia. ¿Cuál es tu nombre?");
        String nombre = scanner.nextLine();
        System.out.println("# Por favor, digita tu cédula.");
        String cedula = scanner.nextLine();
        System.out.println("# ¡Bienvenido, " + nombre + "!");
        
        // Solicita al usuario seleccionar una ruta y muestra los detalles de la ruta seleccionada.

        System.out.println("# ¿Qué ruta registrarás el día de hoy?");
        System.out.println("1. Ruta de los Farallones");
        System.out.println("2. Ruta del Oriente");
        System.out.println("3. Ruta de Ladera");
        int ruta = scanner.nextInt();
        scanner.nextLine();

        // Datos de la ruta
        String puntoEncuentro = "";
        String horaInicio = "";
        String horaFin = "";

        // Asigna los datos de la ruta según la opción seleccionada (Swtich alternativa al if-else)

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
                return;
        }

                // Muestra los detalles de la ruta seleccionada

        System.out.println("# ¡Excelente! La Ruta seleccionada tiene como punto de encuentro " + puntoEncuentro
                + ", iniciando a las " + horaInicio + ", y termina a las " + horaFin + ".");

         // Solicita el número de participantes y guías, y calcula el total de personas.

        System.out.println("# ¿Cuántos participantes acudirán a la caminata el día de hoy?");
        int participantes = scanner.nextInt();
        System.out.println("# ¿Cuántos guías acudirán a la caminata el día de hoy?");
        int guias = scanner.nextInt();
        int totalPersonas = participantes + guias;

        // Solicita y recibe la temperatura y humedad relativa


        System.out.println("# Ingresar la temperatura en grados centígrados °C");
        float temperatura = scanner.nextFloat();
        System.out.println("# Ingresar el porcentaje de humedad relativa");
        float humedad = scanner.nextFloat();

        // Verifica las condiciones meteorológicas y muestra un mensaje adecuado

        if (temperatura >= 20 && temperatura <= 25 && humedad >= 40 && humedad <= 60) {
            System.out.println("# ¡Hace un buen día para caminar por Cali!");
        }
        // Calcula y muestra el número de buses necesarios para el transporte

        int busesNecesarios = (totalPersonas + 24) / 25; 
        System.out.println("# Al ser un total de " + totalPersonas
                + " personas que harán parte de la actividad, se necesitarán un total de: " + busesNecesarios
                + " buses para llevarla a cabo de manera exitosa. ¡Nos vemos en la COP16!");
    }
}
