import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Reserva {
    //Atributos
    private String codigo;
    private Date fecha;
    private String hora;


    //Relaciones
    private Plaza plaza;

    //Constructor
    public Reserva(Plaza plaza, String codigo, String hora, String fecha) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.fecha = dateFormat.parse(fecha);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.fecha = new Date();
        this.hora = hora;
        this.plaza = plaza;
        this.codigo= codigo;
    }

    //Getters
    public String getCodigo(){
        return codigo;
    }
    public Date getFecha() {
        return fecha;
    }
    public String getHora() {
        return hora;
    }

    //Metodo de la clase
    public String generarReserva() {
        if(plaza.isReservado()) {
            return "Esta plaza está ocupada";
        } else {
        return "Reserva generada";}
    }

}
