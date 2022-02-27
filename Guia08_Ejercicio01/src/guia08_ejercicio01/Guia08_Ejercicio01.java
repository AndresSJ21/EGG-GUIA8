
package guia08_ejercicio01;

import java.util.*;
/* @author Andrés Panella
 */
public class Guia08_Ejercicio01 {

    public static void main(String[] args) {
    ArrayList <String> razasDePerros =new ArrayList ();
    Scanner ingresaPorTeclado = new Scanner(System.in);
    
    do{
        System.out.print("Ingrese una raza de perro:\n");
        
        razasDePerros.add(ingresaPorTeclado.nextLine());
        
        System.out.println("la raza ingresada es: "+ razasDePerros.get(razasDePerros.size()-1));
        System.out.println("Presione 0 para salir\n"
                + "O cualquier otra tecla para cargar una nueva raza");
        
    }while(!(ingresaPorTeclado.nextLine().equals("0")));
    
    for (String recorrePerros: razasDePerros){
        System.out.println(recorrePerros);
    }
    
    }


}
