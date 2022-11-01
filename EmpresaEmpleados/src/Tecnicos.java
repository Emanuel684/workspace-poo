//Emanuel Acevedo Muñoz - ID 000478429
public class Tecnicos extends Operativos {

	public Tecnicos(String cursos_realizados_tecnicos, String zona_trabajo_planta_tecnicos, String oficio_planta_tecnicos, String descripcion_labores_tecnicos, int cedula_tecnicos, String nombre_tecnicos, String direccion_tecnicos, String celular_tecnicos, String email_tecnicos, double salario_tecnicos, String fecha_ingreso_tecnicos, String fecha_cumpleanos_tecnicos) {
		// TODO Auto-generated constructor stub
		super(cursos_realizados_tecnicos, zona_trabajo_planta_tecnicos, oficio_planta_tecnicos, descripcion_labores_tecnicos ,cedula_tecnicos, nombre_tecnicos, direccion_tecnicos, celular_tecnicos, email_tecnicos, salario_tecnicos, fecha_ingreso_tecnicos, fecha_cumpleanos_tecnicos);
	}
	
	void consultar_datos() {
		System.out.println("Consultar datos");
		
	}
	
	void modificar_datos() {
		System.out.println("Modificar datos");
	}

}
