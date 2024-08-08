import java.util.*;
public class pos
{
    public static void main(String[] args) {
        String nombreProducto;
        float  vlrUnitario, vlrCobrar;

        final float IVA = 0.19f;
        Scanner lectorConsola = new Scanner(System.in);
        System.out.print(" Ingrese el nombre del producto: ");
        nombreProducto = lectorConsola.nextLine();
        System.out.print(" Ingrese el valor unitario del producto: ");
        vlrUnitario = lectorConsola.nextFloat();
        vlrCobrar = vlrUnitario + (vlrUnitario * IVA);
        System.out.println("El valor total es: " + vlrCobrar + " pesos" );

        
    }
}