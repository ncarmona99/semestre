package Ejercicio133;

/**
 *
 * @author Nicolás
 */
public class Validaciones {

    public int correlativo(){
    int num = 0;
    num += 1;
        
    return num;
    }
    
    public int creaClave(int runTrabajador){
        String runTrabajadorTrans = Integer.toString(runTrabajador);
        runTrabajadorTrans = runTrabajadorTrans.substring(0, 4);
        runTrabajador = Integer.parseInt(runTrabajadorTrans);
        
        return runTrabajador;
    }
}
