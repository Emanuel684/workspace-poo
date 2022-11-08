package Clases;

public class MATRIMONIAL extends HABITACION {

	public static String Precio = "500000";

	public String MostrarPrecioMatrimonial() {
		return this.Precio + "$";
	}

	public void CambiarPrecio(String nuevoPrecio) {
		this.Precio = nuevoPrecio;
	}

}
