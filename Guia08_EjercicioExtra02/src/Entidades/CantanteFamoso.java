package Entidades;

import java.util.ArrayList;
import java.util.Objects;
import java.util.HashSet;

public class CantanteFamoso {
//atributos

    private String nombre;
    private HashSet<Disco> discografia;

    //constructores
    public CantanteFamoso() {

    }

    public CantanteFamoso(String nombre, HashSet<Disco> discografia) {
        this.nombre = nombre;
        this.discografia = discografia;

    }
   
    //getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Disco> getDiscoConMasVentas() {
        return discografia;
    }

    public void setDiscoConMasVentas(HashSet<Disco> discografia) {
        this.discografia = discografia;
    }
    
    
    //equals and hashCode

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.nombre);
        hash = 23 * hash + Objects.hashCode(this.discografia);
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
        final CantanteFamoso other = (CantanteFamoso) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.discografia, other.discografia)) {
            return false;
        }
        return true;
    }



    @Override
    public String toString() {

        String muestraDiscos="Cantante: "+nombre+ "\nDiscografia:\n";
        
        for (Disco disco : discografia) {
            
         muestraDiscos += "Nombre: " + disco.getNombre() + " ,Vendidos: " + disco.getCantDiscosVendidos() + "\n";
            
        }
                
        return muestraDiscos;
    }
    

}
