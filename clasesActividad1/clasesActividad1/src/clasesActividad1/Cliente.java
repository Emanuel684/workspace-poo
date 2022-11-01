package clasesActividad1;

public class Cliente {
	
	int cedula;
	String nombre;
	String direccion;
	String email;
	double saldo_inicial;

	public Cliente() {
		// TODO Auto-generated constructor stub
		int cedula = 0;
		String nombre = "";
		String direccion = "";
		String email = "";
		double saldo_inicial = 0;
	}
	
	void Registrar_cliente(int cedula_registro, String nombre_registro, String direccion_registro, String email_registro) {
		try {
			this.cedula = cedula_registro;
			this.direccion = direccion_registro;
			this.nombre = nombre_registro;
			this.email = email_registro;
			System.out.println("Usuario registrado exitosamente!!");
			
		} catch (Exception e) {
		    System.out.println("Ingresa correctamente los datos!"); 
		}
		
	}
	
	void Consultar_saldo() {
		System.out.println("Su saldo es de: " + this.saldo_inicial);
	}
	
	void Retirar_dinero(double saldo_retirar) {
		try {
			if(this.saldo_inicial - saldo_retirar < 0) {
				System.out.println("No puedes retirar esa cantidad en este momento, Saldo Insuficiente!");
			} else {
				this.saldo_inicial = this.saldo_inicial - saldo_retirar;
				System.out.println("Tu nuevo saldo es de: " + this.saldo_inicial);
			}
		} catch (Exception e) {
			System.out.println("Algo salio mal, asegurate de ingresar correctamente los datos");
		}
		
	}
	
	void Ingresar_dinero(double saldo_ingresar) {
		try {
			this.saldo_inicial = this.saldo_inicial + saldo_ingresar;
			System.out.println("Tu nuevo saldo es de: " + this.saldo_inicial);
		} catch (Exception e) {
			System.out.println("Algo salio mal, asegurate de ingresar correctamente los datos");
		}
		
	}
	
	

}
