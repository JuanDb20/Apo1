import java.util.Scanner;

/**
 * @author Juan Diego Balanta Molina A00407538
 *         Este es un simple programa para generar una factura de venta de
 *         dulces.
 *         Calcula el valor total a cobrar incluyendo un impuesto IVA del 16%
 *         sobre el valor base.
 * 
 *         La aplicación solicita al usuario la cantidad de dulces vendidos,
 *         realiza los cálculos
 *         necesarios y muestra el valor base, el valor del impuesto y el valor
 *         total redondeado.
 */
public class CasoCarolina {

    public static void main(String[] args) {
        final double VALOR_UNITARIO_DULCE = 300.0; // Valor unitario del dulce como constante
        final double IMPUESTO = 0.16; // 16% de impuesto

        Scanner scanner = new Scanner(System.in);

        // Solicitar el número de dulces
        System.out.println("Ingrese el número de dulces vendidos:");
        int cantidadDulces = scanner.nextInt();

        // Calcular el valor de venta base
        double valorVentaBase = VALOR_UNITARIO_DULCE * cantidadDulces;

        // Calcular el valor del impuesto
        double valorImpuesto = valorVentaBase * IMPUESTO;

        // Calcular el valor total
        double valorTotal = valorVentaBase + valorImpuesto;

        // Redondear valores al peso más cercano
        int valorVentaBaseRedondeado = (int) Math.round(valorVentaBase);
        int valorImpuestoRedondeado = (int) Math.round(valorImpuesto);
        int valorTotalRedondeado = (int) Math.round(valorTotal);

        // Mostrar la factura
        System.out.println("Factura de Venta:");
        System.out.println("Cantidad de dulces: " + cantidadDulces);
        System.out.println("Valor unitario por dulce: " + VALOR_UNITARIO_DULCE + " COP");
        System.out.println("Valor de venta base: " + valorVentaBaseRedondeado + " COP");
        System.out.println("Valor del impuesto (16%): " + valorImpuestoRedondeado + " COP");
        System.out.println("Valor total a pagar: " + valorTotalRedondeado + " COP");

        scanner.close();
    }
}
