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

	public void IngresarReservacion(String fechaInicio, String cantidadDias, String cedulaCliente,
			String numeroHabitacion) {
		System.out.println("Reservar()");
		System.out.println("fechaInicio " + fechaInicio);
		System.out.println("cantidadDias " + cantidadDias);
		System.out.println("cedulaCliente " + cedulaCliente);
		System.out.println("numeroHabitacion " + numeroHabitacion);

		// Hacemos la reservacion
		for (int i = 0; i < INICIO.datosReservas.length; i++) {
			if (INICIO.datosReservas[i][3] == null) {
				System.out.println("fechaInicio()" + INICIO.datosReservas[i][0]);
				System.out.println("cantidadDias()" + INICIO.datosReservas[i][1]);
				System.out.println("cedulaCliente()" + INICIO.datosReservas[i][2]);
				System.out.println("numeroHabitacion()" + INICIO.datosReservas[i][3]);
				INICIO.datosReservas[i][0] = fechaInicio;
				INICIO.datosReservas[i][1] = cantidadDias;
				INICIO.datosReservas[i][2] = cedulaCliente;
				INICIO.datosReservas[i][3] = numeroHabitacion;
				INICIO.datosReservas[i][4] = String.valueOf(i);
				break;
			}

		}
	}

	public void ActualizarReservacion(String fechaInicio, String cantidadDias, String cedulaCliente,
			String numeroHabitacion) {
		System.out.println("Actualizar()");
		System.out.println("fechaInicio " + fechaInicio);
		System.out.println("cantidadDias " + cantidadDias);
		System.out.println("cedulaCliente " + cedulaCliente);
		System.out.println("numeroHabitacion " + numeroHabitacion);
		// Hacemos la reservacion

		for (int i = 0; i < INICIO.datosReservas.length; i++) {
			if (INICIO.datosReservas[i][3].equals(numeroHabitacion)) {
				System.out.println("fechaInicio()" + INICIO.datosReservas[i][0]);
				System.out.println("cantidadDias()" + INICIO.datosReservas[i][1]);
				System.out.println("cedulaCliente()" + INICIO.datosReservas[i][2]);
				System.out.println("numeroHabitacion()" + INICIO.datosReservas[i][3]);
				INICIO.datosReservas[i][0] = fechaInicio;
				INICIO.datosReservas[i][1] = cantidadDias;
				INICIO.datosReservas[i][2] = cedulaCliente;
				INICIO.datosReservas[i][3] = numeroHabitacion;
				break;
			}

		}
	}

	public void EliminarReserva(String numeroReserva, String cedulaCliente) {
		System.out.println("Eliminar()");
		System.out.println("numeroReserva " + numeroReserva);
		System.out.println("cedulaCliente " + cedulaCliente);
		// Hacemos la reservacion
		for (int i = 0; i < INICIO.datosReservas.length; i++) {
			if (INICIO.datosReservas[i][4].equals(numeroReserva) && INICIO.datosReservas[i][2].equals(cedulaCliente)) {
				System.out.println("fechaInicio()" + INICIO.datosReservas[i][0]);
				System.out.println("cantidadDias()" + INICIO.datosReservas[i][1]);
				System.out.println("cedulaCliente()" + INICIO.datosReservas[i][2]);
				System.out.println("numeroHabitacion()" + INICIO.datosReservas[i][3]);
				INICIO.datosReservas[i][0] = null;
				INICIO.datosReservas[i][1] = null;
				INICIO.datosReservas[i][2] = null;
				INICIO.datosReservas[i][3] = null;
				INICIO.datosReservas[i][4] = null;
				break;
			}

		}
	}

	public void ImprimirReserva(String numeroReserva, String cedulaCliente) {
		System.out.println("Imprimir()");
		System.out.println("numeroReserva " + numeroReserva);
		System.out.println("cedulaCliente " + cedulaCliente);
		// Hacemos la reservacion

		for (int i = 0; i < INICIO.datosReservas.length; i++) {
			if (INICIO.datosReservas[i][4].equals(numeroReserva) && INICIO.datosReservas[i][2].equals(cedulaCliente)) {
				System.out.println("fechaInicio()" + INICIO.datosReservas[i][0]);
				System.out.println("cantidadDias()" + INICIO.datosReservas[i][1]);
				System.out.println("cedulaCliente()" + INICIO.datosReservas[i][2]);
				System.out.println("numeroHabitacion()" + INICIO.datosReservas[i][3]);
				break;
			}

		}
	}

	public String EstimarReservacion(String tipoHabitacion, String cedulaCliente, String cantidadNoches) {
		System.out.println("EstimarReservacion()");
		System.out.println("tipoHabitacion " + tipoHabitacion);
		System.out.println("cedulaCliente " + cedulaCliente);
		System.out.println("cantidadNoches " + cantidadNoches);
		return "500.000" + "$";
	}

}
