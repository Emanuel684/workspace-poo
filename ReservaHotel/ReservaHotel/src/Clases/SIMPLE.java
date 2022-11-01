package Clases;

public class SIMPLE extends HABITACION {
	
	String Foto;
	String Precio;

	public SIMPLE() {
		// TODO Auto-generated constructor stub
		this.Foto = "";
		this.Precio = "100.000";
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
