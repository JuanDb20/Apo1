package ui;
import model.Cop16Controller;
import java.util.Scanner;

public class Cop16UI {
Cop16Controller myCop16Controller;

public static void main(String[] args) {
    Cop16UI myCop16Program = new Cop16UI();
    myCop16Program.iniciarPrograma();

}

/**
 * Clase que representa la interfaz gráfica de la aplicación de Interacción de Rutas Ecológicas
 * y la Gestión de Lugares Biodiversos para la COP 16 en Cali, Colombia.
 */
public Cop16UI() {
    myCop16Controller = new Cop16Controller();
}
public void showMenu () {
    System.out.println("\nMenu:");
    System.out.println("1. Registrar lugar biodiverso");
    System.out.println("2. Consultar lugar biodiverso");
    System.out.println("3. Gestionar ruta ecológica");
    System.out.println("4. Salir");
}
public void showPlaceWithMostSpecies () {
    String [] places = myCop16Controller.getPlacesWithMostSpecies();
    for (int i=0; i < places.length; i++) 
    {
        System.out.println((i+1) + ". " + places[i]);   
    }
}