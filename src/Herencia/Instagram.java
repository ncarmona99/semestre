package Herencia;

/**
 *
 * @author Nicolás
 */
public class Instagram extends RedSocial{
    
    private int id;
    private String historia;
    private boolean estado;

    public Instagram() {
        super();
    }

    public Instagram(int id, String historia, boolean estado, String usuario, String password) {
        super(usuario, password);
        this.id = id;
        this.historia = historia;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Instagram{" + "id=" + id + ", historia=" + historia + ", estado=" + estado + '}'+ super.toString(); //Se agregó al toString, el toString de la superclase
        
    }
    
    public void listar(){
        String estadoStr = "";
        System.out.println("Usuario: " + super.getUsuario());
        System.out.println("Historia: " + this.getHistoria());
        if (estado){
            estadoStr = "Visible";
        }else{
            estadoStr = "No visible";
        }
        System.out.println("Estado " + estadoStr);
        
    }
    
    @Override
    public String visualizar(){
        
        return super.visualizar() + " " + this.getHistoria();
        
    }
    
}
