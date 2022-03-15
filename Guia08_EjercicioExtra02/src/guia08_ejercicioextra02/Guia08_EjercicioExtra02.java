package guia08_ejercicioextra02;


import Entidades.CantanteFamoso;
import Servicios.ServiciosCantanteFamoso;
import java.util.HashSet;



public class Guia08_EjercicioExtra02 {

    public static void main(String[] args) {
    HashSet<CantanteFamoso> listadoInicialCantanteFamoso = new HashSet();

        ServiciosCantanteFamoso servicioCF = new ServiciosCantanteFamoso();
        servicioCF.creaListadoInicial(listadoInicialCantanteFamoso);
        servicioCF.menu(listadoInicialCantanteFamoso);
    }

}
