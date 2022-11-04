package Clases;

public class DOBLE extends HABITACION {
	
	String Foto;
	public static String Precio = "200000";

	public DOBLE() {
		// TODO Auto-generated constructor stub
		this.Foto = "";
	}
	
	public void MostrarFoto() {
		System.out.println("MostrarFoto()");
	}
	
	public String MostrarPrecioDoble() {
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
