package Clases;

public class HABITUAL extends CLIENTE {
	
	String Descuento;

	public HABITUAL() {
		// TODO Auto-generated constructor stub
		this.Descuento = "0";
	}
	
	public String DescuentoCliente(String cedulaCliente) {
		System.out.println("DescuentoCliente() " + cedulaCliente);
		return this.Descuento + "%";
	}
	
	public void DescuentoCliente(String cedulaCliente, String descuentoCliente) {
		System.out.println("cedulaCliente: " + cedulaCliente);
		System.out.println("descuentoCliente: " + descuentoCliente);
		this.Descuento = descuentoCliente;
	}

}
