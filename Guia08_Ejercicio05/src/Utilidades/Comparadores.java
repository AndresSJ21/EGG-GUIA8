package Utilidades;

import Entidades.Pais;
import java.util.Comparator;

public class Comparadores {
    
    // metodos comparadores
    public static Comparator<Pais> comparaAz = new Comparator<Pais>(){
      @Override
      public int compare(Pais p1, Pais p2){
          return p1.getNombre().compareToIgnoreCase(p2.getNombre());
      }
    };
}
