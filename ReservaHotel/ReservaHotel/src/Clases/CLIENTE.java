package Clases;

public class CLIENTE {
	
	String Cedula;
	String Nombre;
	String Email;
	String FechaNacimiento;
	

	public CLIENTE() {
		// TODO Auto-generated constructor stub
		this.Cedula = "";
		this.Nombre = "";
		this.Email = "";
		this.FechaNacimiento = "";
	}
	
	public void CrearCliente(String cedulaCliente, String nombreCliente, String emailCliente, String fechaNacimientoCliente) {
		System.out.println("CrearCliente()");
		this.Cedula = cedulaCliente;
		this.Nombre = nombreCliente;
		this.Email = emailCliente;
		this.FechaNacimiento = fechaNacimientoCliente;
		System.out.println("Cedula()" + this.Cedula);
		System.out.println("Nombre()" + this.Nombre);
		System.out.println("Email()" + this.Email);
		System.out.println("FechaNacimiento()" + this.FechaNacimiento);
	}
	
	public void ActualizarCliente(String cedulaCliente, String nombreCliente, String emailCliente, String fechaNacimientoCliente) {
		System.out.println("ActualizarCliente()");
		this.Cedula = cedulaCliente;
		this.Nombre = nombreCliente;
		this.Email = emailCliente;
		this.FechaNacimiento = fechaNacimientoCliente;
		System.out.println("Cedula()" + this.Cedula);
		System.out.println("Nombre()" + this.Nombre);
		System.out.println("Email()" + this.Email);
		System.out.println("FechaNacimiento()" + this.FechaNacimiento);
	}
	
	public void EliminarCliente(String cedulaCliente) {
		System.out.println("EliminarCliente()");
		this.Cedula = cedulaCliente;
		System.out.println("Cedula()" + this.Cedula);
	}

}
