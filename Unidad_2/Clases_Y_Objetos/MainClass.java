public class MainClass {
    public static void main(String[] args) 
    {
            //crear una biblioteca:
            Biblioteca miBiblioteca = new Biblioteca("Juan Diego");
            //crera un videojuego:
            Videojuego RDR II = new Videojuego("Red Dead Redemption II", "Acción-Aventura", "Acción", "Rockstar Games", "Estados Unidos", 20.00, 9.0f, 5.5f, 1000000);
            Videojuego TLOUS = new Videojuego("The Last of Us Part II", "Acción-Aventura", "Acción", "Nintendo Switch", "Estados Unidos", 19.99f, 9.5f, 5. f, 1000000);
            //agregar videojuego a biblioteca:
            miBiblioteca.agregarVideojuego(videoJuego1);
    }

}
