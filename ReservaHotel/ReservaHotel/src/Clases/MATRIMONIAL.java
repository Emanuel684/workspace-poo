package Clases;

public class MATRIMONIAL extends HABITACION {

	String Foto;
	public static String Precio = "500000";

	public MATRIMONIAL() {
		// TODO Auto-generated constructor stub
		this.Foto = "";
	}

	public String MostrarPrecioMatrimonial() {
		return this.Precio + "$";
	}

	public void CambiarPrecio(String nuevoPrecio) {
		this.Precio = nuevoPrecio;
	}

}
