import java.util.List;
import java.util.ArrayList;

public class Visitante extends Cliente{

    //Atributos
    List<RentaPorHora> rentasPorHora;
    List<Supervisor> supervisores;
    List<Factura> facturas;

    //Contructor
    public Visitante(String nombre, String apellido) {
        super(nombre, apellido);
        rentasPorHora = new ArrayList<>();
        supervisores = new ArrayList<>();
        facturas = new ArrayList<>();
    }


    //Métodos de la clase
    public void addRentaPorHora(RentaPorHora rentaPorHora) {
        rentasPorHora.add(rentaPorHora);
    }

    public void addSupervisor(Supervisor supervisor) {
        supervisores.add(supervisor);
    }

    public void addFactura(Factura factura) {
        facturas.add(factura);
    }

    public String pagarFactura(Factura factura) {
        return "El cliente ha pagado una factura de "+factura.getTotal();
    }
}
