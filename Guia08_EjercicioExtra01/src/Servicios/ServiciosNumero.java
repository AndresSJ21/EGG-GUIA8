package Servicios;

import Entidades.Numero;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiciosNumero {
//declaracion

    ArrayList<Numero> listaNumeros = new ArrayList();

//creamos elemento
    public Numero creaNumero() {
        Numero numero = new Numero();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese número:");
        numero.setValor(leer.nextInt());
        return numero;
    }

    //guardamos el elemento en ArrayList
    public boolean guardaNumero() {
        Numero numAux;
        int valNumAux;
        do{
           numAux=creaNumero();
     
            if (numAux.getValor()!=(-99)) {
                listaNumeros.add(numAux);
                System.out.println("El número se ingresó con éxito\n");
            }else{
                System.out.println("\n\n-----------FINALIZO LA CARGA-----------");
            }
        }while(numAux.getValor()!=(-99));
   
        return true;
    }

    public boolean muestraNumeros() {
        int cantNumeros =listaNumeros.size();
        System.out.println("---------NUMEROS INGRESADOS = "+cantNumeros+" ---------");
        for (int i = 0; i < cantNumeros; i++) {
            System.out.println("            Numero "+(i+1)+"-"+listaNumeros.get(i).toString());
        }
        System.out.println("");
        return true;
    }
    
    public int sumaNumeros(){
        int suma=0;
               for (Numero listaNumero : listaNumeros) {
            suma+=listaNumero.getValor();
        }
        System.out.println("La suma de los números ingresados es: "+suma+"\n");       
        return suma;   
    }
    
    public double promedioNumeros(){
        double promedio=0;
        if (listaNumeros.size()==0) {
            System.out.println("El promedio de los números ingresados es 0\n");
        } else {
            promedio= Double.valueOf(sumaNumeros())/Double.valueOf(listaNumeros.size());
            System.out.println("El promedio de los números ingresados es "+promedio+"\n");
        }
        return promedio;
    }
            
}
