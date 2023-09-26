package Desde_Cero;

/**
 *
 * @author Nicolás
 */
public class Matrices {
    public static void main(String[] args) {
        // Declaración de matriz con parámetros
        int [] mi_matriz = {15,5,7,-3,9};
        // Declaración de matriz sin parámetros
        int[] mi_matriz2 = new int [5];
        mi_matriz2[0] = 15;
        mi_matriz2[1] = 25;
        mi_matriz2[2] = 35;
        mi_matriz2[3] = -15;
        mi_matriz2[4] = 5;
        
        //Imprimir arrays uno a uno
        
        /*
        System.out.println(mi_matriz[0]);
        System.out.println(mi_matriz[1]);
        System.out.println(mi_matriz[2]);
        System.out.println(mi_matriz[3]);
        System.out.println(mi_matriz[4]);
        System.out.println(mi_matriz2[0]);
        System.out.println(mi_matriz2[1]);
        System.out.println(mi_matriz2[2]);
        System.out.println(mi_matriz2[3]);
        System.out.println(mi_matriz2[4]);
        */
        //Imprimir todos los array
        
        for(int i=0;i<mi_matriz.length;i++){
            System.out.println(mi_matriz[i]);
        }
        for(int i=0;i<mi_matriz2.length;i++){
            System.out.println(mi_matriz2[i]);
        }
        
        //uso de bucle for-each para recorrer los valores de una matriz
        
        for (int i : mi_matriz) {
            
            System.out.println(i);
        }
        for (int i : mi_matriz2) {
            System.out.println(i);
        }
    }
}
