//Emanuel Acevedo Muñoz - ID 000478429
public class Masajista extends SeleccionFutbol {
	
	String titulacion;
	int aniosExperiencia;

	public Masajista() {
		// TODO Auto-generated constructor stub
		this.titulacion = "";
		this.aniosExperiencia = 0;
	}
	
	void darMasaje() {
		System.out.println("-------------------------------------");
		System.out.println("darMasaje en Masajista");
		System.out.println("-------------------------------------");
		
	}
	
	void ingresar_masajista() {
		System.out.println("-------------------------------------");
		System.out.println("Ingresar Masajista");
		System.out.println("-------------------------------------");
		this.ingresar();
		System.out.println("Ingrese la titulacion del masajista: ");
		sc.nextLine();
		this.titulacion = sc.nextLine();
		System.out.println("Ingrese los años de experiencia: ");
		this.aniosExperiencia = sc.nextInt();
	}

}
