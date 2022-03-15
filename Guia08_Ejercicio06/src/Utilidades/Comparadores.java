package Utilidades;
import Entidades.Producto;
import java.util.Comparator;

public class Comparadores {
    
    //metodo comparador por key
    public static Comparator<Producto> comparaKeyMenorAmayor = new Comparator<Producto>(){
        @Override
        public int compare(Producto p1, Producto p2) {
        return p1.getNombre().compareTo(p2.getNombre());       
        }
    };
    
    
    //metodo comparador por precio
        public static Comparator<Producto> comparaPrecioMenorAmayor = new Comparator<Producto>(){
        @Override
        public int compare(Producto p1, Producto p2) {
        return p1.getPrecio().compareTo(p2.getPrecio());       
        }
    };
   
}
