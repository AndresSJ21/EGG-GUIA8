package Servicios;

import Entidades.Pelicula;
import Utilidades.Comparadores;
import java.util.*;
public class PeliculaServicios {

    
    ArrayList<Pelicula> catalogo = new ArrayList<>();
    Pelicula pelicula = new Pelicula();
    public String menu(){
        String opcion;
        do {
            System.out.println("\nBienvenido al catálogo de películas");
            System.out.println("Según el menú indique la opción deseada:");
            System.out.println("1- Agregar película al catálogo\n"
                    + "2- Mostrar catálogo de películas disponibles\n"
                    + "3- Mostrar películas cuya duración sea mayor a 1 hora\n"
                    + "4- Mostrar listado de películas ordenadas por duración de menor a mayor\n"
                    + "5- Mostrar listado de películas ordenadas por duración de mayor a menor\n"
                    + "6- Mostrar listado de películas ordenadas alfabéticamente por título\n"
                    + "7- Mostrar listado de películas ordenadas alfabéticamente por Director\n"
                    + "S- Finalizar");
            Scanner leer = new Scanner(System.in);
            opcion=leer.next();
            switch (opcion) {
                case "1": // crea y guarda una película en el catálogo
                    System.out.println(llenaCatalogo());
                    break;
                case "2": // muestra el catálogo de películas
                    System.out.println(toString());
                    break;
                case "3": // muestra listado de películas con duración mayor a 1hora
                    System.out.println(largaDuracion());
                    break;
                case "4": // muestra listado de películas ordenado por duración creciente
                    System.out.println(ordenaDuracionCreciente());
                    break;
                case "5": // muestra listado de películas ordenado por duración decreciente
                    System.out.println(ordenaDuracionDecreciente());
                    break;
                case "6": // muestra listado de películas ordenadas alfabéticamente por título
                    System.out.println(ordenaTitulosAZ());
                    break;
                case "7": // muestra listado de películas ordenadas alfabéticamente por nombre del director
                    System.out.println(ordenaDirectorAZ());
                    break;
                case "s": //salir
                    System.out.println("");
                    break;
                default:
                    System.out.println("\nLa opción ingresada no es válida, intente nuevamente");
                    break;
            }

        } while (!opcion.equalsIgnoreCase("s"));
        return "";
    }
    
    public Pelicula creaPelicula() {
        boolean falla=false;
        Scanner leer = new Scanner(System.in);
        System.out.println("\n"
                + "Ingrese los siguientes datos:");
        System.out.println("\n"
                + "Título:");
        String titulo = leer.nextLine();
        System.out.println("\nDirector:");
        String director = leer.nextLine();
         Double duracion;
        do{
        System.out.println("\nDuración (en horas):");
        String dura = leer.next();
       
        try{
            duracion = Double.parseDouble(dura);
            falla=false;
        }
        catch (Exception excepcion){
            System.out.println("prueba reemplazando la coma por un punto");
            falla=true;
            duracion=0.0;
            //dura=leer.next();
            //duracion = Double.parseDouble(dura); //https://aprenderaprogramar.com/foros/index.php?topic=7261.0
        }
        }while(falla==true);
        Pelicula pelicula = new Pelicula(titulo, director, duracion);
        return pelicula;
    }

    public String llenaCatalogo() {
        Scanner leer = new Scanner(System.in);
        String opcion;
        int cont=0;
        do {
            catalogo.add(creaPelicula());
            System.out.println("Para agregar otro título al catálogo presiones 'S'");
            opcion = leer.next();
        } while (opcion.equalsIgnoreCase("s"));
        return "\n"
                +"\n"
                + "Los datos ingresados se agregaron al catálogo\n"
                + "\n"
                + "";
    }
    
    public String muestraCatalogo(){
    
        return catalogo.toString();
    }
    
    public String largaDuracion(){
        for (Pelicula pelicula : catalogo) {
            if (pelicula.getDuracion()>1) {
                System.out.println("Película: \n"
                + "   Título: " + pelicula.getTitulo() + "\n"
                + "   Director: " + pelicula.getDirector() + "\n"
                + "   Duración: " + pelicula.getDuracion() + "hs" + "\n");
            }
        }

        return "";
    }

    @Override
    public String toString() {
        for (Pelicula pelicula : catalogo) {
            
                System.out.println("Película: \n"
                        + "   Título: " + pelicula.getTitulo() + "\n"
                        + "   Director: " + pelicula.getDirector() + "\n"
                        + "   Duración: " + pelicula.getDuracion() + "hs" + "\n");
        }
        return "";
    }
    
    public String ordenaTitulosAZ (){

        Collections.sort(catalogo, Comparadores.comparaTituloAZ);
        for (Pelicula pelicula : catalogo) {          
                System.out.println("Película: \n"
                        + "   Título: " + pelicula.getTitulo() + "\n"
                        + "   Director: " + pelicula.getDirector() + "\n"
                        + "   Duración: " + pelicula.getDuracion() + "hs" + "\n");
        }
        return "";
    }
    
        public String ordenaDuracionCreciente (){
        Collections.sort(catalogo, Comparadores.comparaDuracionCreciente);
        for (Pelicula pelicula : catalogo) {          
                System.out.println("Película: \n"
                        + "   Título: " + pelicula.getTitulo() + "\n"
                        + "   Director: " + pelicula.getDirector() + "\n"
                        + "   Duración: " + pelicula.getDuracion() + "hs" + "\n");
        }
        return "";
        }
        
                public String ordenaDuracionDecreciente (){
        Collections.sort(catalogo, Comparadores.comparaDuracionDecreciente);
        for (Pelicula pelicula : catalogo) {          
                System.out.println("Película: \n"
                        + "   Título: " + pelicula.getTitulo() + "\n"
                        + "   Director: " + pelicula.getDirector() + "\n"
                        + "   Duración: " + pelicula.getDuracion() + "hs" + "\n");
        }
        return "";
        }
                
                public String ordenaDirectorAZ (){
        Collections.sort(catalogo, Comparadores.comparaDirectorAZ);
        for (Pelicula pelicula : catalogo) {          
                System.out.println("Película: \n"
                        + "   Título: " + pelicula.getTitulo() + "\n"
                        + "   Director: " + pelicula.getDirector() + "\n"
                        + "   Duración: " + pelicula.getDuracion() + "hs" + "\n");
        }
        return "";
        }        
    }
