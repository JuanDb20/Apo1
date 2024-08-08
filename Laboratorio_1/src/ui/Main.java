package ui;

    import model.Manager;
public class Main {
    
    public static void main(String[] args) {
        Manager m = new Manager ("Hola Mundo!");
        System.out.print(m.getTexto());
    }
}