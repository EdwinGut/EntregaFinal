/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaFormulario;

/**
 *
 * @author edwin
 */
public class Persona {
    
    int identificacion;
    String nombre;
   
    


    public void setnombre(String nombre){
        this.nombre = nombre; 
    }
    
    public void setidentificacion(int identificacion){
        this.identificacion = identificacion;
    }
    
    
    public String getnombre(){
        return nombre;
    }
    
    public int getidentificacion(){
        return identificacion;
    }
}