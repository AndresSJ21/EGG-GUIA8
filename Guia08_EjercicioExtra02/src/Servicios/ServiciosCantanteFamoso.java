package Servicios;

import Entidades.CantanteFamoso;
import Entidades.Disco;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

public class ServiciosCantanteFamoso {

    public HashSet<CantanteFamoso> creaListadoInicial(HashSet<CantanteFamoso> listadoInicialCantanteFamoso) {
        System.out.println("Crearemos un listado inicial de Cantantes");
        System.out.println("Cuántos cantantes quiere ingresar?");
        Scanner leer = new Scanner(System.in);

        int cant = leer.nextInt();
        for (int i = 0; i < cant; i++) {
            System.out.println("Cantante " + (i + 1) + " de " + cant);
            CantanteFamoso cantanteFamoso = creaCantanteFamoso();
            listadoInicialCantanteFamoso.add(cantanteFamoso);
        }

        boolean muestra = muestraCantantes(listadoInicialCantanteFamoso);

        return listadoInicialCantanteFamoso;
    }

    public CantanteFamoso creaCantanteFamoso() {
        HashSet<Disco> discograf = new HashSet();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese datos del Cantante");
        System.out.println("Nombre:");
        String nombre = leer.nextLine();
        System.out.println("Indique cantidad de discos a ingresar");
        int cant = leer.nextInt();
        for (int i = 0; i < cant; i++) {
            discograf.add(creaDisco());
        }
        return new CantanteFamoso(nombre, discograf);
    }

    public Disco creaDisco() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nombre del Disco");
        String nombre = leer.nextLine();
        System.out.println("Ingrese unidades vendidas");
        int cantVentas = leer.nextInt();
        return new Disco(nombre, cantVentas);
    }

    //cargar cantante - opcion 1 del menu
    public HashSet<CantanteFamoso> cargaCantanteFamoso(HashSet<CantanteFamoso> listadoInicialCantanteFamoso) {
        Scanner leer = new Scanner(System.in);
        String option;
        do {
            listadoInicialCantanteFamoso.add(creaCantanteFamoso());
            System.out.println("Presione S para ingresar otro Cantante\n"
                    + "Presiones cualquier otra tecla para volver al menu");
            option = leer.nextLine();
        } while (option.equalsIgnoreCase("S"));
        return listadoInicialCantanteFamoso;
    }

    //mostrar un cantante - opcion 2 menu
    public boolean muestraUnCantante(HashSet<CantanteFamoso> listadoInicialCantanteFamoso) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el cantante a mostrar");
        String cantanteAbuscar = leer.nextLine();
        boolean encontrado = false;
        for (CantanteFamoso cantante : listadoInicialCantanteFamoso) {
            if (cantante.getNombre().equals(cantanteAbuscar)) {
                System.out.println(cantante.toString());
                encontrado = true;
            }
        }
        if (encontrado == false) {
            System.out.println("El cantante que busca no está en nuestros registros");
        }
        return encontrado;
    }
    //modificar un cantante - opcion 3 menu

    //mostrar todos los cantantes - opcion 4 menu
    public boolean muestraCantantes(HashSet<CantanteFamoso> listadoInicialCantanteFamoso) {

        for (CantanteFamoso cantante : listadoInicialCantanteFamoso) {
            System.out.println(cantante.toString());
        }
        return true;
    }

    //borra cantante - Opción 5 menu
    public boolean borraUnCantante(HashSet<CantanteFamoso> listadoInicialCantanteFamoso) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el cantante a borrar");
        String cantanteAbuscar = leer.nextLine();
        boolean encontrado = false;



        for (CantanteFamoso cantante : listadoInicialCantanteFamoso) {
            if (cantante.getNombre().equals(cantanteAbuscar)) {
                listadoInicialCantanteFamoso.remove(cantante);
                encontrado = true;
                break;
            }
        }
        if (encontrado == false) {
            System.out.println("El cantante que busca no está en nuestros registros");
        }
        return encontrado;
    }
    //menu

    public boolean menu(HashSet<CantanteFamoso> listadoInicialCantanteFamoso) {
        Scanner leer = new Scanner(System.in);

        String option;
        boolean llama;

        HashSet<CantanteFamoso> aux = new HashSet();
        do {
            System.out.println("\nDiscografía V1.0\n");
            System.out.println("Ingrese una opción:\n"
                    + "     1- Ingresar Cantante\n"
                    + "     2- Mostrar Cantante\n"
                    + "     3- Modificar Cantante\n"
                    + "     4- Mostrar Cantantes\n"
                    + "     5- Eliminar Cantante\n"
                    + "     S- Salir\n");
            option = (leer.nextLine()).toLowerCase();
            switch (option) {

                case "1":
                    aux = cargaCantanteFamoso(listadoInicialCantanteFamoso);
                    break;
                case "2":
                    llama = muestraUnCantante(listadoInicialCantanteFamoso);
                    break;
                case "3":
                    //llama = modificaProducto();
                    break;
                case "4":
                    llama = muestraCantantes(listadoInicialCantanteFamoso);
                    break;
                case "5":
                    llama = borraUnCantante(listadoInicialCantanteFamoso);
                    break;
                case "s":
                    break;
                default:
                    System.out.println("La opcion ingresada es incorrecta\n");
            }

        } while (!option.equals("s"));
        System.out.println("\nThis is all for now, see you soon ;)\n ");
        return true;
    }

}
