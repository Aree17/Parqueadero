public class Bicicleta extends Vehiculo{
    //Atributos
    private float tamanioMetros;
    //constructor
    public Bicicleta(String modelo, String color, String marca, float tarifa, float tamanioMetros) {
        super(modelo, color, marca, tarifa);
        this.tamanioMetros=tamanioMetros;
    }
}
