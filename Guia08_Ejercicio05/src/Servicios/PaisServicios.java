package Servicios;

import Entidades.Pais;
import Utilidades.Comparadores;
import java.util.*;

public class PaisServicios {

    HashSet<Pais> paisesSet = new HashSet();

    Scanner leer = new Scanner(System.in);

    //leePais
    public Pais leePais() {
        System.out.println("\nIngrese país que desee agregar al conjunto\n"
                + "Pais:");
        String nombre = leer.nextLine();
        return new Pais(nombre);
    }

    //guardaPais(con bucle) 
    public String guardaPais() {
        String opcion;
        do {
            paisesSet.add(leePais());
            System.out.println("\nSi dese ingresar otro país presione 'S'");
            opcion = leer.nextLine();
        } while (opcion.equalsIgnoreCase("S"));
        return muestraPaises();
    }

    //muestraPaises(todos)
    public String muestraPaises() {
        int cont = 0;
        System.out.println("\nLos paises incluidos en el listado son:");
        for (Pais aux : paisesSet) {
            cont++;
            System.out.println("       " + cont + "- " + aux);
        }
        return "";
    }

    //ordenaPaises (y los muestra ordenados - comparator)
    public String ordenaPaises() {
        ArrayList<Pais> listaPaises = new ArrayList(paisesSet);

        Collections.sort(listaPaises, Comparadores.comparaAz);
        int cont = 0;
        System.out.println("Muestra ArrayList ordenado");
        for (Pais pais2 : listaPaises) {
            cont ++;
            System.out.println("     "+cont+"-"+pais2);
        }

        return "";
    }

    //borraPais (y los muestra, si no está avisa)
    public boolean borraPais() {
        System.out.println("Ingrese país a eliminar: ");
        Scanner lee = new Scanner(System.in);
        String aux = leer.nextLine();
        Iterator<Pais> it = paisesSet.iterator();

        boolean encontrado = false;
        while (it.hasNext()) {
            if (it.next().getNombre().equals(aux)) {
                it.remove();
                encontrado = true;
            }
        }
        if (encontrado == true) {
            System.out.println("\n\nPais eliminado\n");
            System.out.println(muestraPaises());
        } else {
            System.out.println("El pais ingresado no está en nuestros registros");
        }

        boolean estado = true;
        return estado;
    }

}
