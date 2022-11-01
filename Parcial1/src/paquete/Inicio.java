package paquete;
import java.util.Scanner;
//Emanuel Acevedo Muñoz - ID 000478429

public class Inicio {
	static Scanner sc = new Scanner(System.in);

	public Inicio() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" ");
		System.out.println("REGISTRAR TRABAJADORES");
		System.out.println("-------------------------------------------");
		int seleccion = 0;
		
		do {
			System.out.println("");
			System.out.println("1. Ingresar nuevo trabajador.");
			System.out.println("0. Salir del programa");
			System.out.println("Ingrese el número de la opcion que quiere ejecutar: ");
			seleccion = sc.nextInt();
			
			switch (seleccion) {
			case 1:
				System.out.println("Vas ha crear un empleado");
				System.out.println("1. Operativo");
				System.out.println("2. Administrativo");
				int tipo_trabajador = sc.nextInt();
				if(tipo_trabajador == 1) {
					System.out.println("El nuevo empleado es:");
					System.out.println("1. Tecnico");
					System.out.println("2. No tecnico");
					int tipo_trabajador_operativo = sc.nextInt();
					if(tipo_trabajador_operativo == 1) {
						
					} else {
						
					}
				} else {
					System.out.println("Se crea un nuevo trabajador");
					
				}
				
				break;
				
			case 0:
				System.out.println("Gracias por preferirnos! Adios");
				break;
			}
			
		} while (seleccion != 0);
	}

}

