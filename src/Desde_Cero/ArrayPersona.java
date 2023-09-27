package Desde_Cero;

import java.util.ArrayList;

/**
 *
 * @author Nicolás
 */
public class ArrayPersona {
    ArrayList<Persona_ArrayList> lista = new ArrayList<>();
    public void addLista(){
            Persona_ArrayList persona1 = new Persona_ArrayList(1,23,"Nicolas Carmona");
            Persona_ArrayList persona2 = new Persona_ArrayList(2,24,"Vicente Solorza");
            Persona_ArrayList persona3 = new Persona_ArrayList(3,28,"Eduardo Reyes");
            lista.add(persona1);
            lista.add(persona2);
            lista.add(persona3);
    }
    public void mostrarLista(){
        for (Persona_ArrayList Persona_ArrayList : lista) {
            System.out.println(Persona_ArrayList.getNombre());
        }
    }
}
