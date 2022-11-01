package Clases;

public class HABITACION {
	
	private int NumeroHabitacion;
	private Object[][] habitaciones = new Object[][] {
			{"1234123", "Doble", "Sí"},
			{"1234123", "Sencilla", "Sí"},
			{"123151", "Matrimonial", "Sí"},
			{"23123", "Sencilla", "No"},
			{"341161234", "Matrimonial", "Sí"},
			{"1234123", "Doble", "Sí"},
			{"5126", "Sencilla", "Sí"},
			{"12351", "Matrimonial", "Sí"},
			{"23613", "Sencilla", "Sí"},
			{"2136", "Doble", "Sí"},
			{"12", "Sencilla", "Sí"},
			{"521", "Matrimonial", "Sí"},
			{"323", "Sencilla", "Sí"},
			{"123", "Doble", "Sí"},
			{"3222", "Sencilla", "Sí"},
			{"32", "Matrimonial", "Sí"},
			{"512", "Sencilla", "Sí"}
	};

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
		return habitaciones;
	}

}
