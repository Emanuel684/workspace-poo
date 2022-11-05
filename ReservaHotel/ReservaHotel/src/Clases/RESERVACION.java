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

		// Hacemos la reservacion
		
		for (int i = 0; i < INICIO.datosClientes.length; i++) {
			
			if (INICIO.datosClientes[i][0].equals(cedulaCliente)) {
				
				for (int j = 0; j < INICIO.datosReservas.length; j++) {
					
					if (INICIO.datosReservas[j][4].equals("")) {
						
						INICIO.datosReservas[j][0] = fechaInicio;
						INICIO.datosReservas[j][1] = cantidadDias;
						INICIO.datosReservas[j][2] = cedulaCliente;
						INICIO.datosReservas[j][3] = numeroHabitacion;
						INICIO.datosReservas[j][5] = String.valueOf(j);
						
						HABITACION precioHabitacion = new HABITACION();
						
						INICIO.datosReservas[i][4] = precioHabitacion.ReservarHabitacionPrecio(numeroHabitacion, cantidadDias, cedulaCliente, INICIO.datosReservas[j][5]);
						
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

		// Hacemos la reservacion
		
		for (int i = 0; i < INICIO.datosClientes.length; i++) {
			
			if (INICIO.datosClientes[i][0].equals(cedulaCliente)) {
				
				for (int j = 0; j < INICIO.datosReservas.length; j++) {
					
					if (INICIO.datosReservas[j][4].equals("")) {
						
						INICIO.datosReservas[j][0] = fechaInicio;
						INICIO.datosReservas[j][1] = cantidadDias;
						INICIO.datosReservas[j][2] = cedulaCliente;
						INICIO.datosReservas[j][3] = numeroHabitacion;
						INICIO.datosReservas[j][5] = String.valueOf(j);
						
						HABITACION precioHabitacion = new HABITACION();
						
						INICIO.datosReservas[i][4] = precioHabitacion.ReservarHabitacionPrecio(numeroHabitacion, cantidadDias, cedulaCliente, INICIO.datosReservas[j][5]);
						
						break;
					}

				}
				break;
			}

		}
	}

	public void EliminarReserva(String numeroReserva, String cedulaCliente) {
		System.out.println("Eliminar()");

		// Hacemos la reservacion
		
		for (int i = 0; i < INICIO.datosClientes.length; i++) {
			
			if (INICIO.datosClientes[i][0].equals(cedulaCliente)) {
				
				for (int j = 0; j < INICIO.datosReservas.length; i++) {
					
					if (INICIO.datosReservas[j][5].equals(numeroReserva)) {
						
						INICIO.datosReservas[j][0] = "";
						INICIO.datosReservas[j][1] = "";
						INICIO.datosReservas[j][2] = "";
						INICIO.datosReservas[j][4] = "";
						
						for(int k = 0; k < HABITACION.habitaciones.length; k++) {
							
							if(HABITACION.habitaciones[k][0].equals(INICIO.datosReservas[j][3])) {
								
								if(HABITACION.habitaciones[k][1].equals("Sencilla")) {
									
									HABITACION reservarHabitacion = new HABITACION();
									
									reservarHabitacion.ReservarHabitacion(INICIO.datosReservas[j][3], true, "");
									
									INICIO.datosReservas[j][5] = "";
									INICIO.datosReservas[j][3] = "";
									
								} else if (HABITACION.habitaciones[k][1].equals("Doble")) {
									
									HABITACION reservarHabitacion = new HABITACION();
									
									reservarHabitacion.ReservarHabitacion(INICIO.datosReservas[j][3], true, "");
									
									INICIO.datosReservas[j][5] = "";
									INICIO.datosReservas[j][3] = "";
									
								} else {
									
									HABITACION reservarHabitacion = new HABITACION();
									
									reservarHabitacion.ReservarHabitacion(INICIO.datosReservas[j][3], true, "");
									
									INICIO.datosReservas[j][5] = "";
									INICIO.datosReservas[j][3] = "";
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

	public void ImprimirReserva(String numeroReserva, String cedulaCliente) {
		System.out.println("Imprimir()");
		System.out.println("numeroReserva " + numeroReserva);
		System.out.println("cedulaCliente " + cedulaCliente);
		// Hacemos la reservacion

		for (int i = 0; i < INICIO.datosReservas.length; i++) {
			
				System.out.println("fechaInicio()" + INICIO.datosReservas[i][0]);
				System.out.println("cantidadDias()" + INICIO.datosReservas[i][1]);
				System.out.println("cedulaCliente()" + INICIO.datosReservas[i][2]);
				System.out.println("numeroHabitacion()" + INICIO.datosReservas[i][3]);
				System.out.println("numeroReserva()" + INICIO.datosReservas[i][5]);
				System.out.println("precioReserva()" + INICIO.datosReservas[i][4]);
				
			

		}
	}

	public String EstimarReservacion(String tipoHabitacion, String cedulaCliente, String cantidadNoches) {
		System.out.println("EstimarReservacion()");
		String precioTotal = "0";
		
		HABITUAL descuentoCliente = new HABITUAL();
		
		String descuento = descuentoCliente.DescuentoCliente(cedulaCliente);
		
		if(tipoHabitacion == "Habitaciones sencilla") {
			
			float cantidadDescuentoTotal = (Integer.parseInt(SIMPLE.Precio) * Integer.parseInt(cantidadNoches) * Integer.parseInt(descuento.split("%")[0])) / 100;
			
			precioTotal = String.valueOf((Integer.parseInt(SIMPLE.Precio) * Integer.parseInt(cantidadNoches)) - cantidadDescuentoTotal);
			
		} else if (tipoHabitacion == "Habitaciones doble") {
			
			float cantidadDescuentoTotal = (Integer.parseInt(DOBLE.Precio) * Integer.parseInt(cantidadNoches) * Integer.parseInt(descuento.split("%")[0])) / 100;
			
			precioTotal = String.valueOf((Integer.parseInt(DOBLE.Precio) * Integer.parseInt(cantidadNoches)) - cantidadDescuentoTotal);
			
		} else {
			
			float cantidadDescuentoTotal = (Integer.parseInt(MATRIMONIAL.Precio) * Integer.parseInt(cantidadNoches) * Integer.parseInt(descuento.split("%")[0])) / 100;
			
			precioTotal = String.valueOf((Integer.parseInt(MATRIMONIAL.Precio) * Integer.parseInt(cantidadNoches)) - cantidadDescuentoTotal);
			
		}
		return precioTotal + "$";
	}

}
