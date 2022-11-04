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

	public void CrearCliente(String cedulaCliente, String nombreCliente, String emailCliente,
			String fechaNacimientoCliente) {
		System.out.println("CrearCliente()");

		for (int i = 0; i < INICIO.datosClientes.length; i++) {
			if (INICIO.datosClientes[i][0] == null) {
				INICIO.datosClientes[i][0] = cedulaCliente;
				INICIO.datosClientes[i][1] = nombreCliente;
				INICIO.datosClientes[i][2] = emailCliente;
				INICIO.datosClientes[i][3] = fechaNacimientoCliente;
				System.out.println("Inicio.datosHotel[0][0]" + INICIO.datosClientes[i][0]);
				System.out.println("Inicio.datosHotel[0][1]" + INICIO.datosClientes[i][1]);
				System.out.println("Inicio.datosHotel[0][2]" + INICIO.datosClientes[i][2]);
				System.out.println("Inicio.datosHotel[0][3]" + INICIO.datosClientes[i][3]);
				break;
			}

		}

	}

	public void ActualizarCliente(String cedulaCliente, String nombreCliente, String emailCliente,
			String fechaNacimientoCliente) {
		System.out.println("ActualizarCliente()");

		for (int i = 0; i < INICIO.datosClientes.length; i++) {
			if (INICIO.datosClientes[i][0].equals(cedulaCliente)) {
				INICIO.datosClientes[i][0] = cedulaCliente;
				INICIO.datosClientes[i][1] = nombreCliente;
				INICIO.datosClientes[i][2] = emailCliente;
				INICIO.datosClientes[i][3] = fechaNacimientoCliente;
				break;
			}

		}

	}

	public void EliminarCliente(String cedulaCliente) {
		System.out.println("EliminarCliente()");

		for (int i = 0; i < INICIO.datosClientes.length; i++) {
			if (INICIO.datosClientes[i][0].equals(cedulaCliente)) {
				System.out.println("Cedula()" + INICIO.datosClientes[i][0]);
				System.out.println("Nombre()" + INICIO.datosClientes[i][1]);
				System.out.println("Email()" + INICIO.datosClientes[i][2]);
				System.out.println("FechaNacimiento()" + INICIO.datosClientes[i][3]);
				INICIO.datosClientes[i][0] = null;
				INICIO.datosClientes[i][1] = null;
				INICIO.datosClientes[i][2] = null;
				INICIO.datosClientes[i][3] = null;
				break;
			}

		}

	}

}
