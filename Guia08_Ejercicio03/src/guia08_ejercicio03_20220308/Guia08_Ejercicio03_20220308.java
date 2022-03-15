
package guia08_ejercicio03_20220308;

import java.util.*;
import Servicios.AlumnoServicios;
import Entidades.Alumno;

public class Guia08_Ejercicio03_20220308 {

    public static void main(String[] args) {
       AlumnoServicios aServicio = new AlumnoServicios();
       ArrayList<Alumno> matricula = new ArrayList();
       Scanner leer = new Scanner(System.in);
       do{
          matricula.add(aServicio.creaAlumno());
          System.out.println("El alumno ingresado es:");
          System.out.println(matricula.get(matricula.size()-1) );
           System.out.println("");
          System.out.println("Para ingresar nuevo alumno presiones 's' o 'S' ");            
       }while(leer.next().equalsIgnoreCase("s"));
       aServicio.buscaAlumno(matricula);
        System.out.println("Hasta pronto ejercicio 3 de la guia 8!!!!!");
    }
}
