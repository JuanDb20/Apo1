public class ConversionProfe

    public static void main(String[] args) {
        
        int opcion;
        float usr_cent, usr_fahr, usr_kel, conv cent, conv_fahr, conv_kel;
        Scanner lector = new Scanner(System.in);
        System.out.println ("Conversion de temperaturas");
        System.out.println (" (1) Centigrados a Fahrenheit");
        System.out.println (" (2) Fahrenheit a Centigrados");
        System.out.println (" (3) Centigrados a Kelvin");
        System.out.println (" (4) Kelvin a Centigrados");
        System.out.println (" (5) Seleccione una opción\n");
        opcion = lector.nextInt();
        lector.nextLine();
    