package sample;

import javafx.event.ActionEvent;
import sample.Controller;

public class Persona extends Controller {


    int identificacion;
    String nombre;
    String apellido;




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
