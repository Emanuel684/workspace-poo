package Clases;

public class HABITACION {

	private int NumeroHabitacion;

	public static Object[][] habitaciones = new Object[][] {
		{"1", "Doble", "S\u00ED", "", "", ""},
		{"2", "Sencilla", "S\u00ED", "", "", ""},
		{"3", "Matrimonial", "S\u00ED", "", "", ""},
		{"4", "Sencilla", "S\u00ED", "", "", ""},
		{"5", "Matrimonial", "S\u00ED", "", "", ""},
		{"6", "Doble", "S\u00ED", "", "", ""},
		{"7", "Sencilla", "S\u00ED", "", "", ""},
		{"8", "Matrimonial", "S\u00ED", "", "", ""},
		{"9", "Sencilla", "S\u00ED", "", "", ""},
		{"10", "Doble", "S\u00ED", "", "", ""},
		{"11", "Sencilla", "S\u00ED", "", "", ""},
		{"12", "Matrimonial", "S\u00ED", "", "", ""},
		{"13", "Sencilla", "S\u00ED", "", "", ""},
		{"14", "Doble", "S\u00ED", "", "", ""},
		{"15", "Sencilla", "S\u00ED", "", "", ""},
		{"16", "Matrimonial", "S\u00ED", "", "", ""},
		{"17", "Sencilla", "S\u00ED", "", "", ""},
	};

	public HABITACION() {
		this.NumeroHabitacion = 0;
	}

	public String ReservarHabitacionPrecio(String numeroHabitacion, String cantidadDias, String cedulaCliente, String numeroReserva) {
		HABITUAL descuentoCliente = new HABITUAL();
		String descuento = descuentoCliente.DescuentoCliente(cedulaCliente);

		String precioReserva = "0";

		for (int k = 0; k < habitaciones.length; k++) {

			if (habitaciones[k][0].equals(numeroHabitacion)) {

				if (HABITACION.habitaciones[k][1].equals("Sencilla")) {

					float cantidadDescuentoTotal = (Integer.parseInt(DOBLE.Precio) * Integer.parseInt(cantidadDias)
							* Integer.parseInt(descuento.split("%")[0])) / 100;

					precioReserva = String.valueOf((Integer.parseInt(SIMPLE.Precio) * Integer.parseInt(cantidadDias))
							- cantidadDescuentoTotal);

					// Cambiamos el estado de disponibilidad de la habitacion

					ReservarHabitacion(numeroHabitacion, false, numeroReserva, cedulaCliente, precioReserva);

				} else if (HABITACION.habitaciones[k][1].equals("Doble")) {

					float cantidadDescuentoTotal = (Integer.parseInt(DOBLE.Precio) * Integer.parseInt(cantidadDias)
							* Integer.parseInt(descuento.split("%")[0])) / 100;

					precioReserva = String.valueOf(
							(Integer.parseInt(DOBLE.Precio) * Integer.parseInt(cantidadDias)) - cantidadDescuentoTotal);

					// Cambiamos el estado de disponibilidad de la habitacion

					ReservarHabitacion(numeroHabitacion, false, numeroReserva, cedulaCliente, precioReserva);

				} else {

					float cantidadDescuentoTotal = (Integer.parseInt(MATRIMONIAL.Precio)
							* Integer.parseInt(cantidadDias) * Integer.parseInt(descuento.split("%")[0])) / 100;

					precioReserva = String
							.valueOf((Integer.parseInt(MATRIMONIAL.Precio) * Integer.parseInt(cantidadDias))
									- cantidadDescuentoTotal);

					// Cambiamos el estado de disponibilidad de la habitacion

					ReservarHabitacion(numeroHabitacion, false, numeroReserva, cedulaCliente, precioReserva);
				}
				break;
			}

		}
		return precioReserva;
	}

	public void ReservarHabitacion(String id_habitacion, boolean disponible, String numeroReserva, String cedulaCliente, String precioReserva) {
		
		for (int i = 0; i < habitaciones.length; i++) {
			if (habitaciones[i][0].equals(id_habitacion)) {
				if (disponible) {
					habitaciones[i][2] = "Sí";
					habitaciones[i][3] = numeroReserva;
					habitaciones[i][4] = cedulaCliente;
					habitaciones[i][5] = precioReserva;
				} else {
					habitaciones[i][2] = "No";
					habitaciones[i][3] = numeroReserva;
					habitaciones[i][4] = cedulaCliente;
					habitaciones[i][5] = precioReserva;
				}
				break;
			}

		}
	}

	public Object[][] HabitacionesDisponibles() {
		return habitaciones;
	}

}
