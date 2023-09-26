package Ejercicio133;

/**
 *
 * @author Nicolás
 */
public class Trabajador {
    
    private int run;
    private char dv;
    private String nombre;

    public Trabajador() {
    }

    public Trabajador(int run, char dv, String nombre) {
        this.run = run;
        this.dv = dv;
        this.nombre = nombre;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public char getDv() {
        return dv;
    }

    public void setDv(char dv) {
        this.dv = dv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "run=" + run + ", dv=" + dv + ", nombre=" + nombre + '}';
    }
    
    
    
}
