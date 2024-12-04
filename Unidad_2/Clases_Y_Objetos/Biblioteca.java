public class Biblioteca {
    // Atributos:
    final int MAX_VIDEOJUEGOS = 1000;
    String nombreUsuario;
    Videojuego[] videojuegos;
    //Metodos:
    public Biblioteca() {

    }
    public Biblioteca(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.videojuegos = new Videojuego[MAX_VIDEOJUEGOS];
    
    }
    
    public void agregarVideojuego(Videojuego nuevoVideojuego) 
    {

    }
}
