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
			String numeroHabitacion, String tipoHabitacion) {
		System.out.println("Reservar()");
		System.out.println("fechaInicio " + fechaInicio);
		System.out.println("cantidadDias " + cantidadDias);
		System.out.println("cedulaCliente " + cedulaCliente);
		System.out.println("numeroHabitacion " + numeroHabitacion);
		
		HABITUAL descuentoCliente = new HABITUAL();
		String descuento = descuentoCliente.DescuentoCliente(cedulaCliente);
		
		//System.out.println("Descuento: " + descuento.split("%")[0]);

		// Hacemos la reservacion
		
		for (int i = 0; i < INICIO.datosClientes.length; i++) {
			
			if (INICIO.datosClientes[i][0].equals(cedulaCliente)) {
				
				for (int j = 0; j < INICIO.datosReservas.length; i++) {
					
					if (INICIO.datosReservas[j][3] == "") {
						
						INICIO.datosReservas[j][0] = fechaInicio;
						INICIO.datosReservas[j][1] = cantidadDias;
						INICIO.datosReservas[j][2] = cedulaCliente;
						INICIO.datosReservas[j][3] = numeroHabitacion;
						INICIO.datosReservas[j][4] = String.valueOf(i);
						
						for(int k = 0; k < HABITACION.habitaciones.length; k++) {
							
							System.out.println("ID_HABITACION: " + HABITACION.habitaciones[k][0]);
							
							if(HABITACION.habitaciones[k][0].equals(numeroHabitacion)) {
								
								if(HABITACION.habitaciones[k][1].equals("Sencilla")) {
									
									float cantidadDescuentoTotal = (Integer.parseInt(DOBLE.Precio) * Integer.parseInt(cantidadDias) * Integer.parseInt(descuento.split("%")[0])) / 100;
									
									System.out.println("cantidadDescuentoTotal: " + cantidadDescuentoTotal);
									
									INICIO.datosReservas[j][4] = String.valueOf((Integer.parseInt(SIMPLE.Precio) * Integer.parseInt(cantidadDias)) - cantidadDescuentoTotal);
									
									// Cambiamos el estado de disponibilidad de la habitacion
									HABITACION reservarHabitacion = new HABITACION();
									reservarHabitacion.ReservarHabitacion(numeroHabitacion, "Sencilla", false);
											
									// INICIO.datosReservas[j][4] = String.valueOf(Integer.parseInt(SIMPLE.Precio) * Integer.parseInt(cantidadDias));
									
								} else if (HABITACION.habitaciones[k][1].equals("Doble")) {
									
									float cantidadDescuentoTotal = (Integer.parseInt(DOBLE.Precio) * Integer.parseInt(cantidadDias) * Integer.parseInt(descuento.split("%")[0])) / 100;
									
									System.out.println("cantidadDescuentoTotal: " + cantidadDescuentoTotal);
									
									INICIO.datosReservas[j][4] = String.valueOf((Integer.parseInt(DOBLE.Precio) * Integer.parseInt(cantidadDias)) - cantidadDescuentoTotal);
									
									// Cambiamos el estado de disponibilidad de la habitacion
									
									HABITACION reservarHabitacion = new HABITACION();
									
									reservarHabitacion.ReservarHabitacion(numeroHabitacion, "Doble", false);
									
									// INICIO.datosReservas[j][4] = String.valueOf(Integer.parseInt(DOBLE.Precio) * Integer.parseInt(cantidadDias));
									
								} else {
									
									float cantidadDescuentoTotal = (Integer.parseInt(MATRIMONIAL.Precio) * Integer.parseInt(cantidadDias) * Integer.parseInt(descuento.split("%")[0])) / 100;
									
									System.out.println("cantidadDescuentoTotal: " + cantidadDescuentoTotal);
									
									INICIO.datosReservas[j][4] = String.valueOf((Integer.parseInt(MATRIMONIAL.Precio) * Integer.parseInt(cantidadDias)) - cantidadDescuentoTotal);
									
									// Cambiamos el estado de disponibilidad de la habitacion
									
									HABITACION reservarHabitacion = new HABITACION();
									
									reservarHabitacion.ReservarHabitacion(numeroHabitacion, "Matrimonial", false);
								}
								break;
							}
							
						}
						break;
					}

				}
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
			if (INICIO.datosReservas[i][3].equals(numeroReserva) && INICIO.datosReservas[i][2].equals(cedulaCliente)) {
				System.out.println("INICIO.datosReservas[i][0](): " + INICIO.datosReservas[i][0]);
				System.out.println("INICIO.datosReservas[i][1](): " + INICIO.datosReservas[i][1]);
				System.out.println("INICIO.datosReservas[i][2](): " + INICIO.datosReservas[i][2]);
				System.out.println("INICIO.datosReservas[i][3](): " + INICIO.datosReservas[i][3]);
				
				INICIO.datosReservas[i][0] = "";
				INICIO.datosReservas[i][1] = "";
				INICIO.datosReservas[i][2] = "";
				INICIO.datosReservas[i][3] = "";
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
			if (INICIO.datosReservas[i][3].equals(numeroReserva) && INICIO.datosReservas[i][2].equals(cedulaCliente)) {
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
		System.out.println(Integer.parseInt("500000") * 2);
		String precioTotal = "0";
		
		HABITUAL descuentoCliente = new HABITUAL();
		String descuento = descuentoCliente.DescuentoCliente(cedulaCliente);
		System.out.println("Descuento: " + descuento.split("%")[0]);
		
		if(tipoHabitacion == "Habitaciones sencilla") {
			
			float cantidadDescuentoTotal = (Integer.parseInt(SIMPLE.Precio) * Integer.parseInt(cantidadNoches) * Integer.parseInt(descuento.split("%")[0])) / 100;
			
			System.out.println("cantidadDescuentoTotal: " + cantidadDescuentoTotal);
			
			precioTotal = String.valueOf((Integer.parseInt(SIMPLE.Precio) * Integer.parseInt(cantidadNoches)) - cantidadDescuentoTotal);
			
		} else if (tipoHabitacion == "Habitaciones doble") {
			
			float cantidadDescuentoTotal = (Integer.parseInt(DOBLE.Precio) * Integer.parseInt(cantidadNoches) * Integer.parseInt(descuento.split("%")[0])) / 100;
			
			System.out.println("cantidadDescuentoTotal: " + cantidadDescuentoTotal);
			
			precioTotal = String.valueOf((Integer.parseInt(DOBLE.Precio) * Integer.parseInt(cantidadNoches)) - cantidadDescuentoTotal);
			
		} else {
			
			float cantidadDescuentoTotal = (Integer.parseInt(MATRIMONIAL.Precio) * Integer.parseInt(cantidadNoches) * Integer.parseInt(descuento.split("%")[0])) / 100;
			
			System.out.println("cantidadDescuentoTotal: " + cantidadDescuentoTotal);
			
			precioTotal = String.valueOf((Integer.parseInt(MATRIMONIAL.Precio) * Integer.parseInt(cantidadNoches)) - cantidadDescuentoTotal);
			
		}
		return precioTotal + "$";
	}

}
