import java.util.ArrayList;
import java.util.List;

public class Parqueadero {

    //Atributos
    private String nombre;
    private String direccion;

    //Relaciones
    private List<Piso> pisos;
    private List<Vehiculo> vehiculos;

    //constructor
    public Parqueadero() {
        this.nombre = "Parqueadero Central";
        this.direccion = "Av. Pío Jaramillo";
        this.pisos = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public List<Piso> getPisos() {
        return pisos;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }


    //metodo para agregar un piso
    public void agregarPiso(int numero) {
        Piso piso = new Piso(numero);
        pisos.add(piso);
    }

    //metodo para agregar un vehiculo
    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

}