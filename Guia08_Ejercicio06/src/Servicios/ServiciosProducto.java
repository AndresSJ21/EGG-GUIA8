package Servicios;

import Entidades.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ServiciosProducto {

    /*
    creamos conjunto
     */
    HashMap<String, Double> listaProductos = new HashMap();


    /*
    codificamos los metodos de la clase Producto
     */
    // creamos objeto
    public Producto creaProducto() {
        String nombre = null;
        Double precio = null;
        boolean validacionDatosIngresados = true;
        do {

            try {
                Scanner leer = new Scanner(System.in);
                System.out.println("Datos del producto a cargar");
                System.out.println("\nNombre: ");
                nombre = leer.nextLine();
                System.out.println("\nPrecio: ");
                precio = leer.nextDouble();
                validacionDatosIngresados = true;
            } catch (Exception datoIncorrecto) {
                System.out.println("Tipo de datos incorrecto, intente nuevamente");
                validacionDatosIngresados = false;
            }
        } while (validacionDatosIngresados == false);
        return new Producto(nombre, precio);
    }

    public boolean cargaProducto(Producto producto) {
        listaProductos.put(producto.getNombre(), producto.getPrecio());
        System.out.println(muestraProducto());
        return true;
    }

    public boolean muestraProducto() {
        System.out.println("\nListado de Productos:\n");
        for (Map.Entry<String, Double> entry : listaProductos.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println("        Producto: " + key + " , Precio: $" + value);
        }
        System.out.println("        Total de productos: " + listaProductos.size());
        return true;
    }

    public boolean modificaProducto() {
        Scanner leer = new Scanner(System.in);
        System.out.println("\nIngrese el nombre del producto a actualizar:");
        String aux = leer.nextLine();
        for (Map.Entry<String, Double> entry : listaProductos.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            if(key.equals(aux)){
                System.out.println("\nIngrese el nuevo precio");
                entry.setValue(leer.nextDouble());
            }
        
        }
        return true;
    }

    public boolean eliminaProducto() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el producto a eliminar");
        String aux = leer.nextLine();
        if (listaProductos.containsKey(aux)) {
            listaProductos.remove(aux);
            System.out.println("El producto fue eliminado");
            return true;
        } else {
            System.out.println("El producto ingresado no existe");
            return false;
        }

    }

    public boolean menuTienda() {
        Scanner leer = new Scanner(System.in);
        String option;
        boolean llama;

        do {
            System.out.println("\nTienda V1.0");
            System.out.println("Ingrese una opción:\n"
                    + "     1- Ingresar Producto\n"
                    + "     2- Mostrar Producto\n"
                    + "     3- Modificar Producto\n"
                    + "     4- Eliminar Producto\n"
                    + "     S- Salir\n");
            option = (leer.nextLine()).toLowerCase();
            switch (option) {

                case "1":
                    llama = cargaProducto(creaProducto());
                    break;
                case "2":
                    llama = muestraProducto();
                    break;
                case "3":
                    llama = modificaProducto();
                    break;
                case "4":
                    llama = eliminaProducto();
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
