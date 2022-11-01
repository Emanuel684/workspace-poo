package datosPersonales;
import java.util.Scanner;

public class datosPersonales {
	
	static Scanner sc = new Scanner(System.in);

	public datosPersonales() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese el nombre: ");
		String nombre = sc.nextLine();
		
		System.out.println("Ingrese el genero: ");
		char genero = sc.next().charAt(0);
		
		System.out.println("Ingrese su edad: ");
		int edad = sc.nextInt();
		
		System.out.println("Ingrese numero de celular: ");
		long numeroCelular = sc.nextLong();
		
		System.out.println("Ingrese el promedio: ");
		double promedio = sc.nextDouble();
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Genero: " + genero);
		System.out.println("Edad: " + edad);
		System.out.println("Número de celular: " + numeroCelular);
		System.out.println("Promedio: " + promedio);
		
	}

}
