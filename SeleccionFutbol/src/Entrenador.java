//Emanuel Acevedo Muñoz - ID 000478429
public class Entrenador extends SeleccionFutbol {
	
	int idFederacion;

	public Entrenador() {
		// TODO Auto-generated constructor stub
		
		this.idFederacion = 0;
		
	}
	
	void dirigirPartido() {
		System.out.println("-------------------------------------");
		System.out.println("dirigirPartido");
		System.out.println("-------------------------------------");
		
	}
	
	void dirigirEntrenamiento() {
		System.out.println("-------------------------------------");
		System.out.println("dirigirEntrenamiento");
		System.out.println("-------------------------------------");
	}
	
	void ingresar_entrenador() {
		System.out.println("-------------------------------------");
		System.out.println("Ingresar Entrenador");
		System.out.println("-------------------------------------");
		this.ingresar();
		System.out.println("Ingrese el id de federacion: ");
		this.idFederacion = sc.nextInt();
	}

}
