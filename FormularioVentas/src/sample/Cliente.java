package sample;

public class Cliente extends Persona {

    public Cliente(String nombre, String apellido, int identificacion, String direccion, int numeroTelefono, String pais){
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;

        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
        this.pais = pais;

    }

    String pais;
    String direccion;
    int numeroTelefono;


    public void setnombre(String nombre){
        this.numeroTelefono= numeroTelefono;
    }


}
