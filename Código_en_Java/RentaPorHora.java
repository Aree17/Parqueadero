import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class RentaPorHora {
    //Atributos
    private float total;
    private float horasUso;
    private Date fecha;


    //Relaciones
    private Vehiculo vehiculo;
    Plaza plaza;

    //Constructor
    public RentaPorHora(Vehiculo vehiculo, Plaza plaza, float horasUso) {

        //Atributos
        this.total = calcularTotal(horasUso, vehiculo);
        this.horasUso = horasUso;
        this.fecha = new Date();
        this.vehiculo = vehiculo;
        this.plaza= plaza;
    }

    //Getters
    public float getTotal() {
        return total;
    }

    public Date getFecha() {
        return fecha;
    }

    public float getHorasUso(){
        return horasUso;
    }

    //Metodo de la clase
    public float calcularTotal(float horasUso, Vehiculo vehiculo) {
        this.total = horasUso * vehiculo.tarifa;
        return total;
    }

}
