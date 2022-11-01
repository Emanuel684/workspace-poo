import java.util.Scanner;
//Emanuel Acevedo Muñoz - ID 000478429

public class Empleados {
	static Scanner sc = new Scanner(System.in);
	
	int cedula;
	String nombre;
	String direccion;
	String celular;
	String email;
	double salario;
	String fecha_ingreso;
	String fecha_cumpleanos;

	public Empleados(int cedula_empleado, String nombre_empleado, String direccion_empleado, String celular_empleado, String email_empleado, double salario_empleado, String fecha_ingreso_empleado, String fecha_cumpleanos_empleado) {
		// TODO Auto-generated constructor stub
		this.cedula = cedula_empleado;
		this.nombre = nombre_empleado;
		this.direccion = direccion_empleado;
		this.celular = celular_empleado;
		this.email = email_empleado;
		this.salario = salario_empleado;
		this.fecha_ingreso = fecha_ingreso_empleado;
		this.fecha_cumpleanos = fecha_cumpleanos_empleado;
	}
	
	void liquidacion_nomina() {
		System.out.println("Liquidacion nomina");
		System.out.println("Esta es la cedula de la persona: " + this.cedula);
	}
	
	void liqudacion_vacaciones() {
		System.out.println("Liquidacion vacaciones");
		
	}
	
	void consultar_datos_personales() {
		System.out.println("Consultar datos personales");
		System.out.println("Sus tados personales son:");
		System.out.println("Cedula: " + this.cedula);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Direccion: " + this.direccion);
		System.out.println("Celular: " + this.celular);
		System.out.println("Email: " + this.email);
		System.out.println("Salario: " + this.salario);
		System.out.println("Fecha de ingreso: " + this.fecha_ingreso);
		System.out.println("Fecha de cumpleaños: " + this.fecha_cumpleanos);
	}
	
	void actualizar_datos_personales() {
		System.out.println("Actualizar datos personales");
		System.out.println("1. Cedula");
		System.out.println("2. Nombre completo");
		System.out.println("3. Direccion");
		System.out.println("4. Celular");
		System.out.println("5. Email");
		System.out.println("6. Salario");
		System.out.println("7. Fecha de ingreso");
		System.out.println("8. Fecha de cumpleaños");
		int tipo_trabajador = sc.nextInt();
		
	}
	
	

}
