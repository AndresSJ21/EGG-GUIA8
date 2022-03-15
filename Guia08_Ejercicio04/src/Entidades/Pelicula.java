
package Entidades;
import java.util.*;

public class Pelicula {
    
    //Atributos
    private String titulo;
    private String director;
    private Double duracion; //la duracion está en horas
            
    //Constructores
    public Pelicula (){ // constructor vacio    
    }
    
    public Pelicula (String titulo, String director, Double duracion){ // constructor por parámetros
        this.titulo=titulo;
        this.director=director;
        this.duracion=duracion;
    }
    
    //Getters and Setters
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    public Double getDuracion(){
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    //toString
    @Override
    public String toString() {
        return "Película: \n"
                + "Título: " + titulo + "\n"
                + "Director: " + director + "\n"
                + "Duración: " + duracion + "hs" + "\n";
    }



}
