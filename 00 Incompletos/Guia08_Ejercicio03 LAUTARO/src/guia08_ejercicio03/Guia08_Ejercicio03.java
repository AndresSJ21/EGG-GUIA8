//3. Crear una clase llamada Alumno que mantenga información sobre las notas de
//distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
//tipo Integer con sus 3 notas.
//En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
//información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
//pregunta al usuario si quiere crear otro Alumno o no.
//Después de ese bluce tendremos el siguiente método en la clase Alumno:
//Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
//nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
//Dentro del método se usará la lista notas para calcular el promedio final de alumno.
//Siendo este promedio final, devuelto por el método y mostrado en el main.
//Nota: encontrarán en Moodle un ejemplo de una Colección como Atributo.

package guia08_ejercicio03;
import Entidades.Alumno;
import Servicios.AlumnoServicio;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

        

/* @author Andrés Panella
 */
public class Guia08_Ejercicio03 {

    public static void main(String[] args) {
        AlumnoServicio servicio = new AlumnoServicio();
        List<Alumno> alumnos = new ArrayList();
        Scanner leer = new Scanner(System.in);
        String option;
        do{
            Alumno alumno1 = new Alumno(); 
            alumnos.add(servicio.crearAlumno(alumno1));
           
            System.out.println("si desea ingresar otro alumno presione s,\n"
                    + "si quiere finalizar presione cualquier otra tecla");
            option = leer.nextLine();
        }while(option.equalsIgnoreCase("s"));
        
    
    }

}
