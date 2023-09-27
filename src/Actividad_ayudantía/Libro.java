package Actividad_ayudantía;

/**
 *
 * @author Nicolás Carmona
 */
public class Libro {
    private String titulo,isbn;
    private int precio;
    private Autor autor;

    public Libro() {
    }

    public Libro(String titulo, String isbn, int precio, Autor autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.isbn = isbn;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", precio=" + precio + ", isbn=" + isbn + ", autor=" + autor + '}';
    }
    public void imprimirLibro(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Nombre del autor: " + this.autor.getNombre()+ " " + this.autor.getApellido());
        System.out.println("Nacionalidad del autor: " + this.autor.getNacionalidad());
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Precio: " + this.precio);
    }
}
