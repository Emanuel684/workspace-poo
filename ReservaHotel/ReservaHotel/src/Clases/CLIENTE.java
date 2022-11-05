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

		for (int i = 0; i < INICIO.datosClientes.length; i++) {
			if (INICIO.datosClientes[i][0] == "") {
				INICIO.datosClientes[i][0] = cedulaCliente;
				INICIO.datosClientes[i][1] = nombreCliente;
				INICIO.datosClientes[i][2] = emailCliente;
				INICIO.datosClientes[i][3] = fechaNacimientoCliente;
				break;
			}

		}

	}

	public void ActualizarCliente(String cedulaCliente, String nombreCliente, String emailCliente,
			String fechaNacimientoCliente) {

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

		for (int i = 0; i < INICIO.datosClientes.length; i++) {
			if (INICIO.datosClientes[i][0].equals(cedulaCliente)) {
				INICIO.datosClientes[i][0] = "";
				INICIO.datosClientes[i][1] = "";
				INICIO.datosClientes[i][2] = "";
				INICIO.datosClientes[i][3] = "";
				break;
			}

		}

	}

}
