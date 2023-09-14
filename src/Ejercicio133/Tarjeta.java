package Ejercicio133;

import java.util.Date;

/**
 *
 * @author Nicolás
 */
public class Tarjeta {
    
    int clave, monto;
    long codigo;
    private Trabajador trabajador;
    private Date vigencia;

    public Tarjeta() {
    }

    public Tarjeta(int clave, int monto, long codigo, Trabajador trabajador, Date vigencia) {
        this.clave = clave;
        this.monto = monto;
        this.codigo = codigo;
        this.trabajador = trabajador;
        this.vigencia = vigencia;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public Date getVigencia() {
        return vigencia;
    }

    public void setVigencia(Date vigencia) {
        this.vigencia = vigencia;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "clave=" + clave + ", monto=" + monto + ", codigo=" + codigo + ", trabajador=" + trabajador + ", vigencia=" + vigencia + '}';
    }
    
    public String valida(int clave){
       
        if(clave == this.clave){
            return "La clave es valida";
        }else{
            return "La clave no es valida";
        }
    }
    
    public String validaMonto(int valorCompra){
        
        if (monto >= valorCompra){
            return "El monto es valido";
        }else{
            return "Excede monto";
        }
    }
    
    public int descontar(int valorCompra){
        
        if(valorCompra <= monto){
            monto -= valorCompra;
            return monto;
        }else{
            return monto;
        }
    }
    public boolean validaVigencia(Date fechaActual){
        
        if(fechaActual.compareTo(this.vigencia)>=0){
            return false;
        }else{
            return true;
        }
    }
    
}
