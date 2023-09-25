package Herencia;

import java.util.Date;

/**
 *
 * @author Nicolás
 */
public class Principal {
    public static void main(String[] args) {
        
        //Date fecha = new Date();
        
        Instagram insta = new Instagram(100,"La mejor clase!!",true,"admin","admin");
        Twitter twit = new Twitter(200,"Se quemó el bus",new Date(),"adm","123");
        
        System.out.println(insta.toString());
        System.out.println(twit.toString());
        System.out.println(insta.visualizar());
        System.out.println(twit.visualizar());
    }
    
}
