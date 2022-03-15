//Crear una clase llamada Alumno que mantenga información sobre las notas de
//distintos alumnos. 

//La clase Alumno tendrá como atributos, su nombre y una lista de
//tipo Integer con sus 3 notas.

//En el main deberemos tener un bucle que crea un objeto Alumno. 
//Se pide toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno.
//Se le pregunta al usuario si quiere crear otro Alumno o no.

//Después de ese bluce tendremos el siguiente método en la clase Alumno:
//Método notaFinal(): 
    //El usuario ingresa el nombre del alumno que quiere calcular su
    //nota final

    //Se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.

    //Dentro del método se usará la lista notas para calcular el promedio final de alumno.
    
    //Siendo este promedio final, devuelto por el método y mostrado en el main.

//Nota: encontrarán en Moodle un ejemplo de una Colección como Atributo.

package guia08_ejercicio03;
import Entidades.Alumno;
import Servicios.AlumnoServicios;
import java.util.*;
/* @author Andrés Panella
 */
public class Guia08_Ejercicio03 {

    public static void main(String[] args) {
    AlumnoServicios as =new AlumnoServicios();
    as.llenaListaAlumnos();
    

    

        
    
    
    
    }

}
