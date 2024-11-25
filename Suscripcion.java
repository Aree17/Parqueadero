import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Suscripcion {

    // Atributos
    private String codigo;
    private Date fechaInicio;
    private Date fechaTerminacion;
    private float precio;
    MetodoPago metodoPago;

    // Relaciones
    private Regular regular;
    private Cajero cajero;
    private Supervisor supervisor;

    // Constructor
    public Suscripcion(String codigo, String fechaInicio, String fechaTerminacion, MetodoPago metodoPago) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.codigo = codigo;
        try {
            this.fechaInicio = dateFormat.parse(fechaInicio);
            this.fechaTerminacion = dateFormat.parse(fechaTerminacion);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.precio = 20.0f;
        this.metodoPago=metodoPago;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaTerminacion() {
        return fechaTerminacion;
    }

    public float getPrecio() {
        return precio;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }
}