package Entidades;

import java.util.*;

/**
 * @author Andrés Panella
 */
public class Alumno {

    /* Atributos de la clase Alumno(objeto o instancia*/
    private String nombre;
    private List<Double> notas;

    /*constructores: vacío y con parámetros*/
    public Alumno() {
    }

    public Alumno(String nombre, List<Double> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    /*getters and setters*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }
    @Override
    public String toString() {
//        String nota="[";
//        for(double elemento: notas)   {
//            nota+=elemento+", ";  
//        } 
//        nota+="]";


//        notas.stream().forEach(System.out::println);
        
        
        return "Alumno{" + "nombre=" + nombre + ", notas=" + notas.toString() +'}';
    }
}
