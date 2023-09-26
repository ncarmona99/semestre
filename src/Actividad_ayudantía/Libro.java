package Actividad_ayudantía;

import java.util.Scanner;

/**
 *
 * @author Nicolás
 */
public class Libro {
    private String titulo,autor,isbn;
    private int precio;
    Scanner sc = new Scanner(System.in);

    public Libro() {
    }

    public Libro(String titulo, String autor, int precio, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }



    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + ", isbn=" + isbn + '}';
    }
    public void eliminarLibro(String isbn){
        if(this.isbn.equals(isbn)){
            setTitulo(" ");
            setAutor(" ");
            setPrecio(0);
            setIsbn(" ");
            System.out.println("El libro se ha borrado con éxito");
        }else{
            System.out.println("El isbn ingresado no pertence a ningún libro");
        }
    }
}
