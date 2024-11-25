import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Regular extends Cliente {

    //Relaciones
    List<Reserva> reservas;
    Suscripcion suscripcion;
    List<Factura> facturas;
    List<Supervisor> supervisores;
    private String codigoSuscripción=getSuscripcion();

    // Constructor
    public Regular(String nombre, String apellido) {
        super(nombre, apellido);
        reservas = new ArrayList<>();
        facturas = new ArrayList<>();
        supervisores = new ArrayList<>();
    }

    //Getters y Setters

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public String getSuscripcion() {
        return suscripcion != null ? suscripcion.getCodigo() : null;
    }

    public void setSuscripcion(Suscripcion suscripcion) {
        this.suscripcion = suscripcion;
    }


    //Métodos de la clase
    public void addReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void addFactura(Factura factura) {
        facturas.add(factura);
    }

    public void addSupervisor(Supervisor supervisor) {
        supervisores.add(supervisor);
    }


}
