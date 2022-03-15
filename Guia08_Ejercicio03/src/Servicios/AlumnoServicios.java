package Servicios;

import java.util.*;
import Entidades.Alumno;

public class AlumnoServicios {

    public Alumno creaAlumno() {
        String nombre;
        Scanner leer = new Scanner(System.in);
        ArrayList<Integer> notas = new ArrayList();
        System.out.println("Ingrese datos del Alumno");
        System.out.println("Nombre y Apellido");
        nombre = leer.nextLine();
        System.out.println("Ingrese notas");
        for (int i = 0; i < 3; i++) {
            System.out.println("Nota " + (i + 1));
            notas.add(leer.nextInt());
        }
        Alumno student = new Alumno(nombre, notas);
        return student;
    }

    public void buscaAlumno(ArrayList<Alumno> matricula) {
        String nombre, eleccion;
        do {
            System.out.println("Ingrese el nombre del alumno a buscar");
            Scanner leer = new Scanner(System.in);
            nombre = leer.nextLine();
            int posicion=-1;
            for (int i = 0; i < matricula.size(); i++) {
                if (matricula.get(i).getNombre().equalsIgnoreCase(nombre)) {
                    posicion = i;
                }
            }  
            if(posicion>=0){
                System.out.println("El promedio de notas de "+matricula.get(posicion).getNombre() +" es "+matricula.get(posicion).notaFinal()+ ", notas ="+matricula.get(posicion).getNotas().toString());
            }else{
                System.out.println("La persona ingresada no se encuentra en nuestros registros");
            }
            System.out.println("Si desea buscar otro alumno presione 's'");
            eleccion = leer.nextLine();
        } while (eleccion.equalsIgnoreCase("s"));
    }
}
