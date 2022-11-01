package clasesActividad1;
import java.util.Scanner;
//Emanuel Acevedo Muñoz - ID 000478429

public class Inicio {
	static Scanner sc = new Scanner(System.in);

	public Inicio() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int seleccion = 0;
		Cliente cliente = new Cliente();
		
		do {
			System.out.println("");
			System.out.println("TU BANCO POO");
			System.out.println("1. Ingresar un cliente");
			System.out.println("2. Consultar saldo cliente");
			System.out.println("3. Retirar saldo");
			System.out.println("4. Ingresar saldo");
			System.out.println("0. Salir del programa");
			System.out.println("Ingrese el número de la opcion que quiere ejecutar: ");
			seleccion = sc.nextInt();
			
			switch (seleccion) {
			case 1:
				System.out.println("Ingrese la cedula: ");
				int cedula = sc.nextInt();
				System.out.println("Ingrese el nombre: ");
				sc.nextLine();
				String nombre = sc.nextLine();
				System.out.println("Ingrese la direccion: ");
				String direccion = sc.nextLine();
				System.out.println("Ingrese la email: ");
				String email = sc.nextLine();
				cliente.Registrar_cliente(cedula, nombre, direccion, email);
				
				break;
				
			case 2:
				cliente.Consultar_saldo();
				
				break;
				
			case 3:
				System.out.println("Ingrese el saldo que desea retirar: ");
				double saldo_retirar = sc.nextDouble();
				cliente.Retirar_dinero(saldo_retirar);

				break;
			case 4:
				System.out.println("Ingrese el saldo que desea agregar a su cuenta: ");
				double saldo_ingresar = sc.nextDouble();
				cliente.Ingresar_dinero(saldo_ingresar);
				
				break;
			case 0:
				System.out.println("Gracias por preferirnos! Adios");
				break;
			}
			
		} while (seleccion != 0);
	}

}
