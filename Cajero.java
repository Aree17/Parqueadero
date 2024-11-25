import java.util.ArrayList;
import java.util.List;

public class Cajero extends Empleado implements IContrato {

    //Atributos
    List<Suscripcion> suscripciones;
    List<Factura> facturas;
    List<RentaPorHora> rentasPorHora;

    //Constructor
    public Cajero(String nombre, String apellido) {
        super(nombre, apellido);
        suscripciones=new ArrayList<>();
        facturas=new ArrayList<>();
        rentasPorHora=new ArrayList<>();
    }

    //métodos de la clase
    public String cobrarFactura(Factura factura) {
        return " cobró una factura con un total de " + factura.getTotal();
    }

    public String generarFactura() {
        return "Se generó una factura ";
    }

    //interfaz
    @Override
    public void trabajar(){
        System.out.println("laborando..");
    }

    @Override
    public void cumplirHorario(){
        System.out.println("Trabaja de 8 a 12");
    }
}
