//Después de ese bluce tendremos el siguiente método en la clase Alumno:
//Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
//nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
//Dentro del método se usará la lista notas para calcular el promedio final de alumno.
//Siendo este promedio final, devuelto por el método y mostrado en el main.

package Service;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class servicioAlumno {
     private Scanner leer;
    private List<Alumno>  alumnos;

    public servicioAlumno() {
        this.leer= new Scanner(System.in).useDelimiter("\n");
        this.alumnos = new ArrayList();   }   

    private Alumno crearAlumno() {
        System.out.println("Ingrese Nombre del Alumno");
        String nombre = leer.next();
        System.out.println("Ingrese Nota1");
        int nota1 = leer.nextInt();
        System.out.println("Ingrese Nota2");
        int nota2 = leer.nextInt();
        System.out.println("Ingrese Nota3");
        int nota3 = leer.nextInt();
        Alumno a = new Alumno(nombre, nota1, nota2, nota3);
        alumnos.add(a);

        return a;

    }

    public void fabicAlumno() {
        boolean fin = false;
        do {
            
            crearAlumno();
            System.out.println("desea Ingresar otro Alumno? s/n");
            String repuesta = leer.next();
            if (repuesta.equalsIgnoreCase("n")) {
                fin = true;
            } else ;

        } while (fin != true);
        
    }
    public void mostrarAlumnos(){
        System.out.println("Los Alumnos Ingresados Son");
        alumnos.forEach((aux) -> {
            System.out.println(aux.toString());
         });
    }
   
    public void buscarCalcular() {
        double promedio=0;
        System.out.println("Ingrese el Nombre del Alumno para ver Promedio");
        String nombre=leer.next();
        for (int i = 0; i < alumnos.size(); i++) {
            Alumno A = alumnos.get(i);
            if(A.getNombre().equals(nombre)){
                promedio=((A.getNota1()+A.getNota2()+A.getNota3())/3);
                 System.out.println("el promedio del alumno "+A.getNombre()+" es de :"+ promedio);
            }else{
                System.out.println("Alumno no se encuentra en la lista");
            }
        }
        
        
    }

 
  
    
    
    
}

