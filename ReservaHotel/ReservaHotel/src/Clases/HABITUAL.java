package Clases;

public class HABITUAL extends CLIENTE {

	String Descuento;

	public HABITUAL() {
		// TODO Auto-generated constructor stub
		this.Descuento = "0";
	}

	public String DescuentoCliente(String cedulaCliente) {
		System.out.println("DescuentoCliente() " + cedulaCliente);

		INICIO Inicio = new INICIO();

		System.out.println("Cedula()" + Inicio.datosClientesHabituales[0][0]);
		System.out.println("Nombre()" + Inicio.datosClientesHabituales[0][1]);
		System.out.println("Email()" + Inicio.datosClientesHabituales[0][2]);
		System.out.println("FechaNacimiento()" + Inicio.datosClientesHabituales[0][3]);
		System.out.println("Descuento()" + Inicio.datosClientesHabituales[0][4]);

		for (int i = 0; i < Inicio.datosClientesHabituales.length; i++) {
			if (INICIO.datosClientesHabituales[i][0].equals(cedulaCliente)) {
				System.out.println("Cedula()" + Inicio.datosClientesHabituales[i][0]);
				System.out.println("Nombre()" + Inicio.datosClientesHabituales[i][1]);
				System.out.println("Email()" + Inicio.datosClientesHabituales[i][2]);
				System.out.println("FechaNacimiento()" + Inicio.datosClientesHabituales[i][3]);
				System.out.println("Descuento()" + Inicio.datosClientesHabituales[i][4]);
				this.Descuento = Inicio.datosClientesHabituales[i][4];
				break;
			}

		}

		return this.Descuento;
	}

	public void DescuentoCliente(String cedulaCliente, String descuentoCliente) {
		System.out.println("cedulaCliente: " + cedulaCliente);
		System.out.println("descuentoCliente: " + descuentoCliente);

		INICIO Inicio = new INICIO();

		for (int i = 0; i < INICIO.datosClientes.length; i++) {
			if(INICIO.datosClientes[i][0].equals(cedulaCliente)) {
				String cosa = INICIO.datosClientes[i][0];
				System.out.println(INICIO.datosClientes[i][0].equals(cedulaCliente));
				System.out.println("--"+cedulaCliente+"--");
				System.out.println("--"+INICIO.datosClientes[i][0]+"--123123");

				System.out.println("Cedula()" + INICIO.datosClientes[i][0]);
				System.out.println("Nombre()" + INICIO.datosClientes[i][1]);
				System.out.println("Email()" + INICIO.datosClientes[i][2]);
				System.out.println("FechaNacimiento()" + INICIO.datosClientes[i][3]);
				
				for(int j = 0; j < Inicio.datosClientesHabituales.length; j++) {
					if(Inicio.datosClientesHabituales[j][0] == null) {
						System.out.println("Cedula()" + Inicio.datosClientes[i][0]);
						System.out.println("Nombre()" + Inicio.datosClientes[i][1]);
						System.out.println("Email()" + Inicio.datosClientes[i][2]);
						System.out.println("FechaNacimiento()" + Inicio.datosClientes[i][3]);
						
						Inicio.datosClientesHabituales[j][0] = Inicio.datosClientes[i][0];
						Inicio.datosClientesHabituales[j][1] = Inicio.datosClientes[i][1];
						Inicio.datosClientesHabituales[j][2] = Inicio.datosClientes[i][2];
						Inicio.datosClientesHabituales[j][3] = Inicio.datosClientes[i][3];
						Inicio.datosClientesHabituales[j][4] = descuentoCliente;
						
						
						break;
					}
					
				}
			}
			

			break;

		}

		this.Descuento = descuentoCliente;
	}

}
