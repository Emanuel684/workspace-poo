package Clases;

public class RESERVACION {

	String FechaInicio;
	String CantidadDias;
	String Cliente;
	String NumeroHabitaciones;
	
	public RESERVACION() {
		// TODO Auto-generated constructor stub
		this.FechaInicio = "";
		this.CantidadDias = "";
		this.Cliente = "";
		this.NumeroHabitaciones = "";
	}
	
	public void IngresarReservacion(String fechaInicio, String cantidadDias, String cedulaCliente, String numeroHabitacion) {
		System.out.println("Reservar()");
		System.out.println("fechaInicio " + fechaInicio);
		System.out.println("cantidadDias " + cantidadDias);
		System.out.println("cedulaCliente " + cedulaCliente);
		System.out.println("numeroHabitacion " + numeroHabitacion);
	}
	
	public void ActualizarReservacion(String fechaInicio, String cantidadDias, String cedulaCliente, String numeroHabitacion) {
		System.out.println("Actualizar()");
		System.out.println("fechaInicio " + fechaInicio);
		System.out.println("cantidadDias " + cantidadDias);
		System.out.println("cedulaCliente " + cedulaCliente);
		System.out.println("numeroHabitacion " + numeroHabitacion);
	}
	
	public void EliminarReserva(String numeroReserva, String cedulaCliente) {
		System.out.println("Eliminar()");
		System.out.println("numeroReserva " + numeroReserva);
		System.out.println("cedulaCliente " + cedulaCliente);
	}
	
	public void ImprimirReserva(String numeroReserva, String cedulaCliente) {
		System.out.println("Imprimir()");
		System.out.println("numeroReserva " + numeroReserva);
		System.out.println("cedulaCliente " + cedulaCliente);
	}
	
	public String EstimarReservacion(String tipoHabitacion, String cedulaCliente, String cantidadNoches) {
		System.out.println("EstimarReservacion()");
		System.out.println("tipoHabitacion " + tipoHabitacion);
		System.out.println("cedulaCliente " + cedulaCliente);
		System.out.println("cantidadNoches " + cantidadNoches);
		return "500.000" + "$";
	}

}
