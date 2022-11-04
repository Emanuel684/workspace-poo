package Clases;

public class HABITACION {

	private int NumeroHabitacion;

	private Object[][] habitaciones = new Object[][] { { "1", "Doble", "Sí" }, { "2", "Sencilla", "Sí" },
			{ "3", "Matrimonial", "Sí" }, { "4", "Sencilla", "No" }, { "5", "Matrimonial", "Sí" },
			{ "6", "Doble", "Sí" }, { "7", "Sencilla", "Sí" }, { "8", "Matrimonial", "Sí" }, { "9", "Sencilla", "Sí" },
			{ "10", "Doble", "Sí" }, { "11", "Sencilla", "Sí" }, { "12", "Matrimonial", "Sí" },
			{ "13", "Sencilla", "Sí" }, { "14", "Doble", "Sí" }, { "15", "Sencilla", "Sí" },
			{ "16", "Matrimonial", "Sí" }, { "17", "Sencilla", "Sí" } };

	public HABITACION() {
		// TODO Auto-generated constructor stub
		this.NumeroHabitacion = 0;
	}

	public void MostrarFoto() {
		System.out.println("MostrarFoto()");
	}

	public void MostrarPrecio() {
		System.out.println("MostrarPrecio()");
	}

	public void Clonar() {
		System.out.println("Clonar()");
	}

	public Object[][] HabitacionesDisponibles() {
		System.out.println("HabitacionesDisponibles()");
		for (int i = 0; i < habitaciones.length; i++) {
			System.out.println("habitaciones: " + habitaciones[i][0]);
		}

		System.out.println("habitaciones: " + habitaciones.length);

		return habitaciones;
	}

}
