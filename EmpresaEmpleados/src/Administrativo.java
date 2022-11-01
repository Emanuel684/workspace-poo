//Emanuel Acevedo Muñoz - ID 000478429
public class Administrativo extends Empleados {

	String titulos_profesionales;
	String anos_experiencia;
	String numero_personas_cargo;
	String numero_extencion;

	public Administrativo(int cedula_administrativo, String nombre_administrativo, String direccion_administrativo, String celular_administrativo, String email_administrativo, double salario_administrativo, String fecha_ingreso_administrativo, String fecha_cumpleanos_administrativo) {
		// TODO Auto-generated constructor stub
		super(cedula_administrativo, nombre_administrativo, direccion_administrativo, celular_administrativo, email_administrativo, salario_administrativo, fecha_ingreso_administrativo, fecha_cumpleanos_administrativo);
		String titulos_profesionales = "";
		String anos_experiencia = "";
		String numero_personas_cargo = "";
		String numero_extencion = "";
	}
	
	void generar_informe_planta() {
		System.out.println("Generar informe planta");
	}
	
	void consultar_titulos() {
		System.out.println("Consultar titulos");
	}
	
	void actualizar_titulos() {
		System.out.println("Actualizar titulos");
	}
	
	void actualizar_datos() {
		System.out.println("Actualizar datos");
	}
	
	void consultar_datos() {
		System.out.println("Consultar datos");
	}

}
