import java.util.Scanner;
//@author Juan Diego Balanta Molina
public class Seguimiento_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su peso (separado por coma):");
        double peso = scanner.nextDouble();
        System.out.println("Ingrese su altura:");
        double altura = scanner.nextDouble();
        double imc = peso / (altura * altura);
        String mensaje = "Hola " + nombre + ", tu IMC es de " + imc;
        System.out.println(mensaje);
        final float RANGO_INFERIOR = 18.5f;
        final float RANGO_SUPERIOR = 24.9f;
        if (imc < RANGO_INFERIOR) {
            System.out.println("Estás en estado de peso bajo");
        } else if (imc >= RANGO_INFERIOR && imc < RANGO_SUPERIOR) {
            System.out.println("Estás en estado de peso normal");
        } else if (imc >= RANGO_SUPERIOR) {
            System.out.println("Estás en estado de sobrepeso");
        }
    
    }
}   

