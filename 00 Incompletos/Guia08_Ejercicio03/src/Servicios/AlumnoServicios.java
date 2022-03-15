package Servicios;

import Entidades.Alumno;

import java.util.*;

/**
 * @author Andrés Panella
 */
public class AlumnoServicios {

 

    public Alumno creaAlumno() {

        ArrayList<Double> listaNotas = new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        System.out.println("Nombre y Apellido:");
        String nombre= leer.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese nota " + (i + 1));
            listaNotas.add(leer.nextDouble());
        }

        return new Alumno(nombre, listaNotas);
    }

    public ArrayList<Alumno> llenaListaAlumnos() {
        ArrayList<Alumno> listadoAlumnos = new ArrayList();
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Ingrese datos del alumno a cargar");
            listadoAlumnos.add(creaAlumno());
            System.out.println("");
            System.out.println("Si quieres ingresar otro alumno presiona s o S");
        } while (leer.next().equalsIgnoreCase("s"));
        System.out.println(listadoAlumnos.get(listadoAlumnos.size()-1).toString());   

//    for (Alumno listadoAlumno : listadoAlumnos) {
//            System.out.println(listadoAlumnos);
//    }
    return listadoAlumnos ;
    }

    public void muestraAlumno(Alumno alumno1, ArrayList<Double> listaNotas) {
        Iterator<Double> it = listaNotas.iterator();
        int cont = 0;
        System.out.println("\nEl alumno ingresado es: " + alumno1.getNombre());
        while (it.hasNext()) {
            double notait = it.next();
            cont++;
            System.out.println("la nota " + cont + " es " + notait);
        }
    }
    
//    public double notaFinal(Alumno alumno1, ArrayList<Double> listaNotas){
//        //Método notaFinal(): 
//        //El usuario ingresa el nombre del alumno que quiere calcular su
//        //nota final
//
//        //Se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
//
//        //Dentro del método se usará la lista notas para calcular el promedio final de alumno.
//    
//        //Siendo este promedio final, devuelto por el método y mostrado en el main.
//
//       /* Iterator<Double> it = listaNotas.iterator();
//        int cont = 0;
//        double suma=0;
//        while (it.hasNext()) {
//            double notait = it.next();
//            cont++;
//            System.out.println("la nota " + cont + " es " + notait);
//        
//        return nota_final;
//        
//    }*/
}
