package Utilidades;

import Entidades.Pelicula;
import java.util.Comparator;

public class Comparadores {
    //comparamos por titulo creciente
    public static Comparator<Pelicula> comparaTituloAZ = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula pelicula1, Pelicula pelicula2) {
            return pelicula1.getTitulo().compareToIgnoreCase(pelicula2.getTitulo());
        }
    };
    
    //comparamos por director creciente
    public static Comparator<Pelicula> comparaDirectorAZ = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula pelicula1, Pelicula pelicula2) {
            return pelicula1.getDirector().compareToIgnoreCase(pelicula2.getDirector());
        }
    };
    //comparamos por duracion creciente
    public static Comparator<Pelicula> comparaDuracionCreciente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula pelicula1, Pelicula pelicula2) {
            return pelicula1.getDuracion().compareTo(pelicula2.getDuracion());
        }
    };
    //comparamos por duracion decreciente
    public static Comparator<Pelicula> comparaDuracionDecreciente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula pelicula1, Pelicula pelicula2) {
            return pelicula2.getDuracion().compareTo(pelicula1.getDuracion());
        }
    };
}
