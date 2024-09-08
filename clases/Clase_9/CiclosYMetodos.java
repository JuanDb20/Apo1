/**
 * Manejo de cinco cuentas de ahorro con 3 Funciones: Depositar, Retirar, Consultar Saldo.
 */
import java.util.Scanner;
public class CiclosYMetodos {
    
    public static void main (String[] args) {
    // Variables y Constantes:
    float saldo_c1 = 0.0f;
    int op_usuario=0;
    float vlr_deposito, vlr_retiro;
    Scanner lector = new Scanner(System.in);


    //menu de opciones:
    // 1. imprimir menu
    // 2. capturar selección del usuario
    // 3. Manejar seleccion del usuario con condiicional/funciones
    // 4. mientra la seleccion no sea (0 = salir
    do{
        System.out.println("1. Hacer deposito");
        system.out.println("2. Retirar dinero");
        system.out.println("3. Consultar saldo");
        //2. capturar selección del usuario
        op_usuario = lector.nextInt();
        //3. manejar seleccion del usuario con condicional/funciones
        switch(op_usuario){
            case 1: // Hacer deposito
                System.out.println("Ingrese el monto del deposito:");
                vlr_deposito = lector.nextFloat();
                saldo_c1 = hacerDeposito(vlr_deposito, saldo_c1);
                break;
            case 2:// Hacer retiro
            system.out.println("Ingrese el monto del retiro:");
            vlr_retiro = lector.nextFloat();
            saldo_c1 = hacerDeposito(vlr_retiro, saldo_c1);
            
                break;

            case 3: // Consultar saldo
                System.out.println("Su saldo es: " + saldo_c1);
                 break;

        default:
            break;
   
    } while (op_usuario!=0);
 }
 }

    private static void hacerRetiro() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hacerRetiro'");
    }

    private static float hacerDeposito(float vlr_deposito, float saldo_anterior) {
        float saldo_nuevo;
        saldo_nuevo = saldo_anterior + vlr_deposito;

        return saldo_nuevo;
    }
}