
package guia08_ejercicioextra01;

import Servicios.ServiciosNumero;


public class Guia08_EjercicioExtra01 {

    public static void main(String[] args) {

     ServiciosNumero servNumero = new ServiciosNumero(); 
     boolean cargaNum, muestraNum;
     cargaNum = servNumero.guardaNumero();
     muestraNum = servNumero.muestraNumeros();
     double promedio = servNumero.promedioNumeros();
    }

}
