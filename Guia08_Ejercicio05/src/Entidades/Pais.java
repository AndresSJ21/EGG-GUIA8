package Entidades;

import java.util.*;

public class Pais {

    //atributos
    private String nombre;

    //constructores
    //constructor vacio
    public Pais() {
    }
    //constructor por parámetro

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    //getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    //toString
    @Override
    public String toString() {

        return nombre + "\n";
    }

}
