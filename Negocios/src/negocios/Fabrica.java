/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

/**
 *
 * @author Angel
 */
public class Fabrica {
   private static iConexion instancia;
   
   /**
    * Metodo que te regresa la instancia de la fachada
    * @return instancia
    */
   public static  iConexion getInstance(){
       if(instancia ==null){
           instancia = new Fachada();
       }
       return instancia;
   }
    
    
   
}
