package Clases;

public class SIMPLE extends HABITACION {
	
	String Foto;
	public static String Precio = "100000";

	public SIMPLE() {
		// TODO Auto-generated constructor stub
		this.Foto = "";
	}
	
	public void MostrarFoto() {
		System.out.println("MostrarFoto()");
	}
	
	public String MostrarPrecioSimple() {
		System.out.println("MostrarPrecio()");
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
