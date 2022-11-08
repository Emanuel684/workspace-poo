package Clases;

public class HABITACION {

	private int NumeroHabitacion;

	public static Object[][] habitaciones = new Object[][] { { "1", "Doble", "Sí", "" }, { "2", "Sencilla", "Sí", "" },
			{ "3", "Matrimonial", "Sí", "" }, { "4", "Sencilla", "Sí", "" }, { "5", "Matrimonial", "Sí", "" },
			{ "6", "Doble", "Sí", "" }, { "7", "Sencilla", "Sí", "" }, { "8", "Matrimonial", "Sí", "" },
			{ "9", "Sencilla", "Sí", "" }, { "10", "Doble", "Sí", "" }, { "11", "Sencilla", "Sí", "" },
			{ "12", "Matrimonial", "Sí", "" }, { "13", "Sencilla", "Sí", "" }, { "14", "Doble", "Sí", "" },
			{ "15", "Sencilla", "Sí", "" }, { "16", "Matrimonial", "Sí", "" }, { "17", "Sencilla", "Sí", "" } };

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

					ReservarHabitacion(numeroHabitacion, false, numeroReserva);

				} else if (HABITACION.habitaciones[k][1].equals("Doble")) {

					float cantidadDescuentoTotal = (Integer.parseInt(DOBLE.Precio) * Integer.parseInt(cantidadDias)
							* Integer.parseInt(descuento.split("%")[0])) / 100;

					precioReserva = String.valueOf(
							(Integer.parseInt(DOBLE.Precio) * Integer.parseInt(cantidadDias)) - cantidadDescuentoTotal);

					// Cambiamos el estado de disponibilidad de la habitacion

					ReservarHabitacion(numeroHabitacion, false, numeroReserva);

				} else {

					float cantidadDescuentoTotal = (Integer.parseInt(MATRIMONIAL.Precio)
							* Integer.parseInt(cantidadDias) * Integer.parseInt(descuento.split("%")[0])) / 100;

					precioReserva = String
							.valueOf((Integer.parseInt(MATRIMONIAL.Precio) * Integer.parseInt(cantidadDias))
									- cantidadDescuentoTotal);

					// Cambiamos el estado de disponibilidad de la habitacion

					ReservarHabitacion(numeroHabitacion, false, numeroReserva);
				}
				break;
			}

		}
		return precioReserva;
	}

	public void ReservarHabitacion(String id_habitacion, boolean disponible, String numeroReserva) {
		
		for (int i = 0; i < habitaciones.length; i++) {
			if (habitaciones[i][0].equals(id_habitacion)) {
				if (disponible) {
					habitaciones[i][2] = "Sí";
					habitaciones[i][3] = numeroReserva;
				} else {
					habitaciones[i][2] = "No";
					habitaciones[i][3] = numeroReserva;
				}
				break;
			}

		}
	}

	public Object[][] HabitacionesDisponibles() {
		return habitaciones;
	}

}
