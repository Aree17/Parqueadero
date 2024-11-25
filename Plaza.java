public class Plaza {
    //Declaracion de atributos
    private String codigo;
    private boolean reservado;

    //Constructor
    public Plaza(String codigo, boolean reservado) {
        this.codigo = codigo;
        this.reservado= reservado;
    }

    //Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public String getReservado() {
        if (reservado) {
            return "Plaza reservada";
        } else {
            return " ha reservado una plaza correctamente";
        }
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    //metodo para verificar si una plaza esta reservada
    public boolean isReservado() {
        return reservado;
    }

}