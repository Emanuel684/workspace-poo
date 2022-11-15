package Clases;

public class CLIENTE {

	String Cedula;
	String Nombre;
	String Email;
	String FechaNacimiento;

	public CLIENTE() {
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
			
			if(INICIO.datosClientes[i][0].equals(cedulaCliente)) {
				
				for(int j = 0; j < INICIO.datosClientesHabituales.length; j++) {
					
					if(INICIO.datosClientesHabituales[j][0].equals(cedulaCliente)) {
						
						INICIO.datosClientesHabituales[j][0] = "";
						INICIO.datosClientesHabituales[j][1] = "";
						INICIO.datosClientesHabituales[j][2] = "";
						INICIO.datosClientesHabituales[j][3] = "";
						INICIO.datosClientesHabituales[j][4] = "";
						
						
						break;
					}
					
				}
				break;
			}
			

		}

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
