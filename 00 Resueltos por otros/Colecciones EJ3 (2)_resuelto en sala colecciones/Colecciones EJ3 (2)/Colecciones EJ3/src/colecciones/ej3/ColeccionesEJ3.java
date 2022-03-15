//En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
//información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
//pregunta al usuario si quiere crear otro Alumno o no.

package colecciones.ej3;

import Service.servicioAlumno;

public class ColeccionesEJ3 {

    public static void main(String[] args) {

        servicioAlumno A1 = new servicioAlumno();

        A1.fabicAlumno();
        A1.mostrarAlumnos();

        A1.buscarCalcular();
        A1.mostrarAlumnos();
    }

}
