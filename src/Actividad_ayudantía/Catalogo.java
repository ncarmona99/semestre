package Actividad_ayudantía;

import java.util.ArrayList;

/**
 *
 * @author Nicolás
 */
public class Catalogo {
    ArrayList<Libro> lista = new ArrayList<>();
    public void agregarLibro(Libro libro){
        lista.add(libro);
    }
    public void eliminarLibro(String isbn){
        for (Libro libro : lista) {
            if(isbn.equalsIgnoreCase(libro.getIsbn())){
                lista.remove(libro);
                break;
            }   
        }
    }
    public void buscarTitulo(String titulo){
        for (Libro libro : lista) {
            if(titulo.equalsIgnoreCase(libro.getTitulo())){
                libro.imprimirLibro();
                break;
            }
        }
    }
    public void buscarApellido(String apellido){
        for (Libro libro : lista) {
            if(libro.getAutor().getApellido().equalsIgnoreCase(apellido)) {
                libro.imprimirLibro();
                break;
            }
        }
    }
    public void mostrarCatalogo(){
        for (Libro libro : lista) {
            System.out.println(libro.toString());
        }
    }
}
