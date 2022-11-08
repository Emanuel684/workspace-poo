package Clases;

public class SIMPLE extends HABITACION {
	
	public static String Precio = "100000";
	
	
	public String MostrarPrecioSimple() {
		return this.Precio + "$";
	}
	
	public void CambiarPrecio(String nuevoPrecio) {
		this.Precio = nuevoPrecio;
	}

}
