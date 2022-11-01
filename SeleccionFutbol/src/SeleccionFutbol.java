import java.util.Scanner;
//Emanuel Acevedo Muñoz - ID 000478429

public class SeleccionFutbol {
	static Scanner sc = new Scanner(System.in);
	
	int id;
	String nombre;
	String apellidos;
	int edad;

	public SeleccionFutbol() {
		// TODO Auto-generated constructor stub
		this.id = 0;
		this.nombre = "";
		this.apellidos = "";
		this.edad = 0;
	}
	
	void concentrarse() {
		System.out.println("Concentrarse");
	}
	
	void viajar() {
		System.out.println("Viajar");
		
	}
	
	void ingresar() {
		System.out.println("Funcion ingresar SeleccionFutbol");
		System.out.println("Ingrese el id del nuevo integrante: ");
		this.id = sc.nextInt();
		System.out.println("Ingrese el nombre del nuevo integrante: ");
		sc.nextLine();
		this.nombre = sc.nextLine();
		System.out.println("Ingresar el apellido del nuevo integrante: ");
		this.apellidos = sc.nextLine();
		System.out.println("Ingrese la edad del nuevo integrante: ");
		this.edad = sc.nextInt();
	}
	

}
