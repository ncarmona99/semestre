package Ejercicio122;

/**
 *
 * @author Nicolás
 */
public class Canciones {
    
    private String titulo, artista;
    private char favorita;
    private boolean descargada;
    private int duracion;

    public Canciones(String titulo, String artista, char favorita, boolean descargada, int duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.favorita = favorita;
        this.descargada = descargada;
        this.duracion = duracion;
    }

    public Canciones() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public char getFavorita() {
        return favorita;
    }

    public void setFavorita(char favorita) {
        this.favorita = favorita;
    }

    public boolean isDescargada() {
        return descargada;
    }

    public void setDescargada(boolean descargada) {
        this.descargada = descargada;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    public int adelantarCancion(int segundosActuales, int segundosAd){
       segundosActuales = segundosActuales + segundosAd;
        
        return segundosActuales;
    }
    
    public void imprimirCanciones(){
        int minutos = 0, segundos = 0;
        
        minutos = this.duracion / 60;
        segundos = this.duracion - minutos*60;
        
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Artista: " + this.getArtista());
        System.out.println("Duracion: " + minutos + ":" + segundos);
    }
    
    public String obtenerTipoCancion(){
        
        if (duracion >= 300){
            return "Larga";
        }else
            return "Normal";
    }
    
}
