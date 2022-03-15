package Entidades;

import java.util.Objects;

public class Disco {
    //atributos
    private String nombreDisco;
    private int cantDiscosVendidos;
    
    //constructores
    public Disco(){
        
    }
    public Disco(String nombreDisco, int cantDiscosVendidos){
        this.nombreDisco=nombreDisco;
        this.cantDiscosVendidos=cantDiscosVendidos;
    }
    
    //getters and Setters

    public String getNombre() {
        return nombreDisco;
    }

    public void setNombre(String nombreDisco) {
        this.nombreDisco = nombreDisco;
    }

    public int getCantDiscosVendidos() {
        return cantDiscosVendidos;
    }

    public void setCantDiscosVendidos(int cantDiscosVendidos) {
        this.cantDiscosVendidos = cantDiscosVendidos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.nombreDisco);
        hash = 17 * hash + this.cantDiscosVendidos;
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
        final Disco other = (Disco) obj;
        if (this.cantDiscosVendidos != other.cantDiscosVendidos) {
            return false;
        }
        if (!Objects.equals(this.nombreDisco, other.nombreDisco)) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        System.out.println("Nombre: "+nombreDisco+" ,Vendidos: "+cantDiscosVendidos+"\n");
        
        return "";
    }
    
    
}
