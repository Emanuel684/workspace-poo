package Clases;

public class MATRIMONIAL extends HABITACION {

	String Foto;
	public static String Precio = "500000";

	public MATRIMONIAL() {
		// TODO Auto-generated constructor stub
		this.Foto = "";
	}

	public void MostrarFoto() {
		System.out.println("MostrarFoto()");
	}

	public String MostrarPrecioMatrimonial() {
		System.out.println("MostrarPrecio()");
		return this.Precio + "$";
	}

	public void CambiarPrecio(String nuevoPrecio) {
		this.Precio = nuevoPrecio;
		System.out.println("CambiarPrecio() " + nuevoPrecio);
	}

	public void Clonar() {
		System.out.println("Clonar()");
	}

}
