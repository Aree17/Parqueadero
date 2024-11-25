public class Automovil extends Vehiculo{
    //Atributos
    private String matricula;
    private int capacidadPersonas;
    //constructor
    public Automovil(String modelo, String color, String marca, float tarifa, String matricula, int capacidadPersonas) {
        super(modelo, color, marca, tarifa);
        this.matricula=matricula;
        this.capacidadPersonas=capacidadPersonas;
    }

}
