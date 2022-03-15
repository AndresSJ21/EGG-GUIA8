package Entidades;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Andrés Panella
 */
public class Alumno {

//ATRIBUTOS
    private String nombre;
    private List<Integer> notas = new ArrayList();

//CONSTRUCTORES
    public Alumno() {

    }

    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }
// getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNotas(Integer nota) { //modificacion: esto permite ingresar de a una nota a la vez
        this.notas.add(nota);
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notas=" + notas + '}';
    }

//public void crearAlumno(){
//    
//}
//Scanner lee = new Scanner(System.in);
//public void cargaNotas (){
//    int [] nota=new int[3];
//    System.out.println("Ingrese primer nota");
//    nota[0]=lee.nextInt();
//    System.out.println("Ingrese segunda nota");
//    nota[1]=lee.nextInt();
//    System.out.println("Ingrese tercer nota");
//    nota[2]=lee.nextInt();
//    System.out.println("     Nota 1: "+nota[0]+"\n"
//            + "     Nota 2: "+nota[1]+"\n"
//            + "     Nota 3: "+nota[2]);
//}



}
