import java.util.Scanner;

/**
 * Programa para calcular el indice de Masa Corporal (IMC) de una persona con base en su peso y altura.
 * Luego,lanza un mensaje personalizado con el nombre del usuario e indica si esta en estado
 * de peso bajo, normal o sobrepeso.
 * 
 * @author Juan Diego Balanta Molina
 */
public class Imc {

    /**
     * Metodo principal que ejecuta el programa para calcular el IMC.
     * Solicita el nombre, peso y altura del usuario, calcula el IMC e imprime un mensaje
     * indicando el estado de peso de la persona.
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita el nombre del usuario
        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();
        
        // Solicita el peso del usuario (ingresado con coma)
        System.out.println("Ingrese su peso (separado por coma):");
        double peso = scanner.nextDouble();
        
        // Solicita la altura del usuario (ingresada con coma)
        System.out.println("Ingrese su altura (separada por coma):");
        double altura = scanner.nextDouble();
        
        // Calcula el IMC del usuario
        double imc = peso / (altura * altura);
        
        // Mensaje personalizado con el nombre del usuario e IMC
        String mensaje = "Hola " + nombre + ", tu IMC es de " + imc;
        System.out.println(mensaje);
        
        // Rangos de IMC para evaluar el estado del peso
        final float RANGO_INFERIOR = 18.5f;
        final float RANGO_SUPERIOR = 24.9f;
        
        // terminos para evaluar el estado de peso del usuario segun su IMC
        if (imc < RANGO_INFERIOR) {
            System.out.println("Estás en estado de peso bajo");
        } else if (imc >= RANGO_INFERIOR && imc < RANGO_SUPERIOR) {
            System.out.println("Estás en estado de peso normal");
        } else if (imc >= RANGO_SUPERIOR) {
            System.out.println("Estás en estado de sobrepeso");
        }
    }
}
