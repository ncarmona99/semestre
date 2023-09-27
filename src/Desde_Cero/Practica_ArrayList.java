package Desde_Cero;

/**
 *
 * @author Nicolás
 */
public class Practica_ArrayList {
    //Hereda de la clase AbstractList; permite colecciones o elementos duplicados; el orden de los registros son el orden de inserción; permite acceso aleatorio; 
    //manipulación lenta(recorrer todo el arraylist)
    public static void main(String[] args) {
        ArrayPersona persona = new ArrayPersona();
        persona.addLista();
        persona.mostrarLista();
    }
}
