//Emanuel Acevedo Muñoz - ID 000478429
public class Operativos extends Empleados {
	
	String cursos_realizados;
	String zona_trabajo_planta;
	String oficio_planta;
	String descripcion_labores;

	public Operativos(String cursos_realizados_operativos, String zona_trabajo_planta_operativos, String oficio_planta_operativos, String descripcion_labores_operativos , int cedula_operativo, String nombre_operativo, String direccion_operativo, String celular_operativo, String email_operativo, double salario_operativo, String fecha_ingreso_operativo, String fecha_cumpleanos_operativo) {
		// TODO Auto-generated constructor stub
		super(cedula_operativo, nombre_operativo, direccion_operativo, celular_operativo, email_operativo, salario_operativo, fecha_ingreso_operativo, fecha_cumpleanos_operativo);
		this.cursos_realizados = cursos_realizados_operativos;
		this.zona_trabajo_planta = zona_trabajo_planta_operativos;
		this.oficio_planta = oficio_planta_operativos;
		this.descripcion_labores = descripcion_labores_operativos;
	}
	
	void consultar_cursos() {
		System.out.println("Consultar cursos");
		System.out.println("Estos son los cursos realizados: " + this.cursos_realizados);
	}
	
	void actualizar_cursos() {
		System.out.println("Actualizar cursos");
	}
	
	void consultar_descripcion() {
		System.out.println("Consultar descripcion");
		System.out.println("La descripcion es: " + this.descripcion_labores);
	}
	
	void actualizar_descripcion() {
		System.out.println("Consultar descripcion");
	}

}
