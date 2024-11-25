public class Motocicleta extends Vehiculo{

    //Atributos
    private String matricula;
    private String tipoMotor;

    //constructor
    public Motocicleta(String modelo, String color, String marca, float tarifa, String matricula,String tipoMotor ) {
        super(modelo, color, marca, tarifa);
        this.matricula=matricula;
        this.tipoMotor=tipoMotor;
    }
}
