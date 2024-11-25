public abstract class Empleado extends Persona implements IContrato {

    //Atributo
    protected float sueldo=550.0f;

    //Constructor
    public Empleado(String nombre, String apellido) {
        super(nombre, apellido);
    }

    protected float getSueldo(){
        return sueldo;
    }
}
