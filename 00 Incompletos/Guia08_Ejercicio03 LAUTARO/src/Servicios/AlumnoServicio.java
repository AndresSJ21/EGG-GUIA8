
package Servicios;

import Entidades.Alumno;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Andrés Panella
 */
public class AlumnoServicio {
    public Alumno crearAlumno(){
        //Instanciamos objetos
        Alumno alumno1 = new Alumno();
        Scanner lee = new Scanner(System.in);
       
        //Pido los datos por consola y los guardo
        System.out.println("Ingrese nombre y apellido del alumno");
        alumno1.setNombre(lee.nextLine());
        System.out.println("Ingrese las notas del alumno");
        System.out.println("Nota 1:");
        alumno1.setNotas(lee.nextInt());
        System.out.println("Nota 2:");
        alumno1.setNotas(lee.nextInt());
        System.out.println("Nota 3:");
        alumno1.setNotas(lee.nextInt());
        return alumno1;
    }
        public Alumno crearAlumno(Alumno alumno1){
        //Instanciamos objetos
        Scanner lee = new Scanner(System.in);
       
        //Pido los datos por consola y los guardo
        System.out.println("Ingrese nombre y apellido del alumno");
        alumno1.setNombre(lee.nextLine());
        System.out.println("Ingrese las notas del alumno");
        System.out.println("Nota 1:");
        alumno1.setNotas(lee.nextInt());
        System.out.println("Nota 2:");
        alumno1.setNotas(lee.nextInt());
        System.out.println("Nota 3:");
        alumno1.setNotas(lee.nextInt());
        System.out.println("El alumno creado es: "+ alumno1.toString());
        return alumno1;
    }
}
