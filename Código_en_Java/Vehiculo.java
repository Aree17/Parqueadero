public abstract class Vehiculo {
    //Atributos
    public String modelo;
    public String color;
    public String marca;
    public float tarifa;

    //Constructor
    public Vehiculo(String modelo, String color, String marca, float tarifa) {
        this.modelo = modelo;
        this.color = color;
        this.marca = marca;
        this.tarifa = tarifa;
    }

    //Setters
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTarifa(float tarifa) {
        this.tarifa = tarifa;
    }

    //Getters
    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public float getTarifa() {
        return tarifa;
    }


}
