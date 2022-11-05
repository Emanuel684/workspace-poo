package Clases;

public class HABITUAL extends CLIENTE {

	String Descuento;

	public HABITUAL() {
		// TODO Auto-generated constructor stub
		this.Descuento = "0";
	}

	public String DescuentoCliente(String cedulaCliente) {

		for (int i = 0; i < INICIO.datosClientesHabituales.length; i++) {
			
			if (INICIO.datosClientesHabituales[i][0].equals(cedulaCliente)) {
				
				this.Descuento = INICIO.datosClientesHabituales[i][4];
				break;
			}

		}

		return this.Descuento;
	}

	public void DescuentoCliente(String cedulaCliente, String descuentoCliente) {

		for (int i = 0; i < INICIO.datosClientes.length; i++) {
			
			if(INICIO.datosClientes[i][0].equals(cedulaCliente)) {
				
				for(int j = 0; j < INICIO.datosClientesHabituales.length; j++) {
					
					if(INICIO.datosClientesHabituales[j][0] == "") {
						System.out.println("Cedula()" + INICIO.datosClientes[i][0]);
						System.out.println("Nombre()" + INICIO.datosClientes[i][1]);
						System.out.println("Email()" + INICIO.datosClientes[i][2]);
						System.out.println("FechaNacimiento()" + INICIO.datosClientes[i][3]);
						
						INICIO.datosClientesHabituales[j][0] = INICIO.datosClientes[i][0];
						INICIO.datosClientesHabituales[j][1] = INICIO.datosClientes[i][1];
						INICIO.datosClientesHabituales[j][2] = INICIO.datosClientes[i][2];
						INICIO.datosClientesHabituales[j][3] = INICIO.datosClientes[i][3];
						INICIO.datosClientesHabituales[j][4] = descuentoCliente;
						
						
						break;
					}
					
				}
				break;
			}
			

		}

		this.Descuento = descuentoCliente;
	}

}
