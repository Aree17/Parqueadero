import java.util.ArrayList;
import java.util.List;

public class Piso {

    ////Atributos
    private int numero;
    private List<Plaza> plazas;

    //Constructor
    public Piso(int numero) {
        this.numero = numero;
        this.plazas = new ArrayList<>();
    }

    //Getters y Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<String> getCodigosPlazas() {
        List<String> codigos = new ArrayList<>();
        for (Plaza plaza : plazas) {
            codigos.add(plaza.getCodigo());
        }
        return codigos;
    }

    //Metodo para agregar una plaza
    public void agregarPlaza(Plaza plaza) {
        plazas.add(plaza);
    }
}