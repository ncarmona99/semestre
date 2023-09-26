package Ejercicio133;

/**
 *
 * @author Nicolás
 */
public class Principal {
    public static void main(String[] args) {
        Trabajador trabajador1 = new Trabajador(20161406,'6',"Nicolas Carmona");
        Trabajador trabajador2 = new Trabajador(8774904,'5',"Carlos Carmona");
        Validaciones validacion = new Validaciones();
        Tarjeta tarjeta1 = new Tarjeta(validacion.creaClave(trabajador1.getRun()),10000,1,trabajador1);
        System.out.println("El trabajador " + trabajador1.getNombre() + " tiene el run " + trabajador1.getRun() + "-" + trabajador1.getDv());
        System.out.println("La tarjeta asociada al trabajador 1 tiene como número correlativo " + validacion.correlativo());
        System.out.println("La clave de la tarjeta 1 es " + tarjeta1.getClave());
    }
}
