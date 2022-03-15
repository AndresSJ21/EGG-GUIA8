package Utilidades;

import Entidades.CantanteFamoso;
import java.util.Comparator;

public class Comparadores {

public static Comparator<CantanteFamoso> comparaNombre = new Comparator<CantanteFamoso>(){
    @Override
    public int compare(CantanteFamoso c1, CantanteFamoso c2){
        return c2.getNombre().compareTo(c1.getNombre());
    }
};  
}
