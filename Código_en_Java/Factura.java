import java.util.Date;

public class Factura {

    //Atributos
    private Date fecha;
    private int numero;
    private float total;
    Suscripcion suscripcion;
    RentaPorHora rentaPorHora;

    public Factura(Suscripcion suscripcion) {
        this.total=suscripcion.getPrecio();
    }

    public Factura(RentaPorHora rentaPorHora) {
        this.total=rentaPorHora.getTotal();
    }


    public float getTotal() {
        return total;
    }
}
