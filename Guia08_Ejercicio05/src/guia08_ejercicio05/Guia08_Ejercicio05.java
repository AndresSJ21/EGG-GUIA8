
package guia08_ejercicio05;
import Servicios.PaisServicios;

public class Guia08_Ejercicio05 {

    public static void main(String[] args) {
        PaisServicios paisServ = new PaisServicios();
        //prueba antes del menu
        System.out.println(paisServ.guardaPais());
        System.out.println(paisServ.ordenaPaises());
        boolean borraPais = paisServ.borraPais();

    }
    
}
