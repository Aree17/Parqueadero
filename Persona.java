import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Persona{

    //Atributos
    protected String nombre;
    protected String apellido;

    //Constructor
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Setters y Getters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;

    }
    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido=apellido;
    }


}