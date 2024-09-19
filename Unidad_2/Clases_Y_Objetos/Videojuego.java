package Clases_Y_Objetos;

public class Videojuego {
    String nombre, genero, categoria, desarrolladores[], país;
    float precio, rating, tamanio;
    int num_descargas;


    public Videojuego
    
    (String nombre, String genero, String categoría, String desarolladores, String país, float precio, Float rating, float tamanio, int num_descargas) {
        this.nombre = nombre;
        this.genero = genero;
        this.categoria = categoría;
        this.desarrolladores = desarolladores.split(", ");
        this.país = país;
        this.precio = precio;
        this.rating = rating;
        this.tamanio = tamanio;
        this.num_descargas = num_descargas;
    }
}

