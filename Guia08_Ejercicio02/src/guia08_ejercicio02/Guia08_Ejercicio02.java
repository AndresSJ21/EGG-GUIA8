
package guia08_ejercicio02;
import java.util.*;

/* @author Andrés Panella
 */
public class Guia08_Ejercicio02 {

    public static void main(String[] args) {
        ArrayList<String> perros=new ArrayList();
        Scanner leer = new Scanner (System.in);
        String option;
        do {
            System.out.println("Ingrese una raza de perro");
            perros.add(leer.nextLine());
            System.out.println("La raza ingresada es: "+perros.get(perros.size()-1));
            System.out.println("Para salir presione:\n S o s\nPara seguir ingresando razas presiones cualquier otra tecla");
            option=leer.nextLine();
        } while (!option.equalsIgnoreCase("s"));
        System.out.println("Las razas ingresasdas son:");        
        perros.forEach((recorre) -> {
            System.out.println("*_"+recorre);
        }); // despues de mostrar perros (ejercicio 1) el usuario debe ingresar una raza de perro
        
        System.out.println("Ingrese la raza que desea eliminar");
        Iterator <String> iterador = perros.iterator();
        String razaAeliminar = leer.nextLine();
        boolean encontrado=false;
        while (iterador.hasNext()){
            
            if (iterador.next().equalsIgnoreCase(razaAeliminar)){// buscar perro con iterator
                encontrado=true;
                iterador.remove(); // eliminar perro si está en la lista 
            }
        }
        // mostrar advertencia si el perro no está en la lista
            if(!encontrado){
                System.out.println("La raza ingresada no se encuentra en la lista");
            }
        
        Collections.sort(perros);  // ordenar lista
        perros.forEach((recorre)  ->{        // mostrar lista
        System.out.println(recorre);
        }); 
    }
}
