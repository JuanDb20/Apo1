import java.util.*;
public class Holamundo
{
    static String nombre="Diego";
    static int edad=18; 
    public static void main(String[] args) {
        {
        System.out.println("Hola mundo");
        Scanner lectorConsola=new Scanner (System.in);
        nombre = lectorConsola.next();
        System.out.println("Tu nombre es: " + nombre);
        }
    }
}
