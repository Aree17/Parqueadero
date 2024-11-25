import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
    Parqueadero parqueadero1=new Parqueadero();
    System.out.println("Bienvenido al "+parqueadero1.getNombre());
    System.out.println("Dirección "+parqueadero1.getDireccion());

    Piso piso1= new Piso(1);
    Plaza plaza1=new Plaza("1A", false);
    piso1.agregarPlaza(plaza1);
    Cajero cajero1= new Cajero("Shamira", "Espinoza");
    Supervisor supervisor1= new Supervisor("Leslie", "Gonzaga");
    Regular regular1=new Regular("Aylin", "Aguirre");
    Motocicleta moto1=new Motocicleta("Urbana", "Roja", "Honda", 0.5f, "JILY14", "Trifásico");
    Suscripcion suscripcion1=new Suscripcion("0001", "25/11/2024", "25/12/2024", MetodoPago.efectivo);
    Factura factura1=new Factura(suscripcion1);
    regular1.addFactura(factura1);
    regular1.addSupervisor(supervisor1);
    Reserva reserva1=new Reserva(plaza1, "R001", "12:00", "25/11/2024");

    System.out.println("El supervisor "+supervisor1.getNombre()+supervisor1.generarSuscripcion()+" en la plaza "+piso1.getCodigosPlazas());
    System.out.println("El cliente "+regular1.getNombre()+" "+regular1.getApellido()+" adquirió una suscripción el día "+ suscripcion1.getFechaInicio()+", con fecha de culminación "+suscripcion1.getFechaTerminacion()+" y su metodo de pago fue "+suscripcion1.getMetodoPago());
    System.out.println("El cajero "+cajero1.getNombre()+cajero1.cobrarFactura(factura1)+" al cliente regular "+regular1.getNombre()+" "+regular1.getApellido());
    System.out.println(reserva1.generarReserva());
    System.out.println("El cliente regular "+regular1.getNombre()+plaza1.getReservado());

    Piso piso2=new Piso(2);
    Plaza plaza2=new Plaza("2A", false);
    piso2.agregarPlaza(plaza2);
    Cajero cajero2= new Cajero("Josuet", "Loor");
    Supervisor supervisor2= new Supervisor("Carolina", "Zambrano");
    Visitante visitante1=new Visitante("Cristhian", "Malla");
    Automovil automovil1=new Automovil("Deportivo", "Azul", "Chevrolet", 1.0f, "KLUP18", 4);
    RentaPorHora rentaPorHora1= new RentaPorHora(automovil1, plaza2, 1.5f);
    Factura factura2=new Factura(rentaPorHora1);
    visitante1.addSupervisor(supervisor2);
    System.out.println("El supervisor "+supervisor2.getNombre()+supervisor2.generarRentaPorHora()+" en la plaza "+piso2.getCodigosPlazas());
    System.out.println(visitante1.pagarFactura(factura2));
    System.out.println("El cajero "+cajero2.getNombre()+cajero2.cobrarFactura(factura2)+" al cliente visitante "+visitante1.getNombre()+" "+visitante1.getApellido()+" el día "+rentaPorHora1.getFecha());

    }
}