import java.util.ArrayList;
import java.util.List;

public class Supervisor extends Empleado implements IContrato {

    //Atributos
    List<RentaPorHora> rentaPlazaList;
    List<Visitante> visitantes;
    List<Regular> regulares;

    //Constructor
    public Supervisor(String nombre, String apellido) {
        super(nombre, apellido);
        visitantes= new ArrayList<>();
        regulares= new ArrayList<>();
    }

    //Getters
    public float getSueldo(){
        return sueldo;
    }


    //Metodos de la clase
    public String generarSuscripcion(){
        return " generó una suscripcion";
    }

    public String generarRentaPorHora(){
        return " generó una Renta por hora";
    }


    //Metodos de la interfaz
    @Override
    public void trabajar(){
        System.out.println("atendiendo clientes");
    }

    @Override
    public void cumplirHorario(){
        System.out.println("Trabaja de 8 a 6 de la tarde");
    }
}
