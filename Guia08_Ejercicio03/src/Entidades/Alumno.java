
package Entidades;

import java.util.*;

public class Alumno {
    //Atributos
    private String nombre;
    private ArrayList<Integer> notas;
    
    //Constructores
    public Alumno(){
    }
    
    public Alumno(String nombre, ArrayList<Integer> notas){
        this.nombre=nombre;
        this.notas= notas;
    }
    
    //Getters and Setters
    public String getNombre (){
        return nombre;
    }
    
    public void setNombre (String nombre){
        this.nombre=nombre;
    }
    
    public ArrayList<Integer> getNotas(){
        return notas;
    }
    
    public void setNotas(ArrayList<Integer> notas){
        this.notas=notas;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + ", y sus notas " + notas;
    }
 
    public  int notaFinal(){
        int notafinal, suma=0, cont=0;
        Iterator<Integer> it = notas.iterator(); //debemos especificar tipo de variable del iterador
        while(it.hasNext()){
            suma+=it.next();
            cont++;
        } 
        notafinal=suma/cont;
        return notafinal;
    }
}
