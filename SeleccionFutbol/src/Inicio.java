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
		System.out.println("SELECCION DE FUTBOL");
		System.out.println("-------------------------------------------");
		int seleccion = 0;
		int key1 = 0;
		int key2 = 0;
		int key3 = 0;
		
		do {
			System.out.println("");
			System.out.println("1. Ingresar nuevo integrante de la seleccion.");
			System.out.println("0. Salir del programa");
			System.out.println("Ingrese el número de la opcion que quiere ejecutar: ");
			System.out.println("-------------------------------------------");
			seleccion = sc.nextInt();
			
			switch (seleccion) {
			case 1:
				System.out.println("-------------------------------------------");
				System.out.println("Que tipo de integrante ingresaras: ");
				
				System.out.println("1. Futbolista.");
				System.out.println("2. Entrenador.");
				System.out.println("3. Masajista.");
				System.out.println("Ingrese el número del tipo de integrante a ingresar: ");
				System.out.println("-------------------------------------------");
				int tipo_integrante = sc.nextInt();
				
				if(tipo_integrante == 1) {
					Futbolista nuevo_futbolista = new Futbolista();
					nuevo_futbolista.ingresar_futbolista();
					
					// Submenu para futbolista
					do {
						System.out.println("-------------------------------------------");
						System.out.println("FUTBOLISTA");
						System.out.println("1. Jugar partido.");
						System.out.println("2. Entrenar.");
						System.out.println("0. Salir del programa");
						System.out.println("Ingrese el número de la opcion que quiere ejecutar: ");
						System.out.println("-------------------------------------------");
						key1 = sc.nextInt();
						
						switch (key1) {
						case 1:
							nuevo_futbolista.jugarPartido();
							break;
							
						case 2:
							nuevo_futbolista.entrenar();
							break;
							
						case 0:
							System.out.println("Gracias por preferirnos! Adios");
							break;

						default:
							break;
						};
					} while (key1 != 0);
					
				} else if (tipo_integrante == 2) {
					Entrenador nuevo_entrenador = new Entrenador();
					nuevo_entrenador.ingresar_entrenador();
					
					// Submenu para entrenadores
					do {
						System.out.println("-------------------------------------------");
						System.out.println("ENTRENADOR");
						System.out.println("1. Dirigir partido.");
						System.out.println("2. Dirigir entrenamiento.");
						System.out.println("0. Salir del programa");
						System.out.println("Ingrese el número de la opcion que quiere ejecutar: ");
						System.out.println("-------------------------------------------");
						key2 = sc.nextInt();
						
						switch (key2) {
						case 1:
							nuevo_entrenador.dirigirPartido();
							break;
							
						case 2:
							nuevo_entrenador.dirigirEntrenamiento();
							break;
							
						case 0:
							System.out.println("Gracias por preferirnos! Adios");
							break;

						default:
							break;
						};
					} while (key2 != 0);
					
				} else if (tipo_integrante == 3) {
					Masajista nuevo_masajista = new Masajista();
					nuevo_masajista.ingresar_masajista();
					
					// Submenu para masajistas
					do {
						System.out.println("-------------------------------------------");
						System.out.println("MASAJISTA");
						System.out.println("1. Dar masaje.");
						System.out.println("0. Salir del programa");
						System.out.println("Ingrese el número de la opcion que quiere ejecutar: ");
						System.out.println("-------------------------------------------");
						key3 = sc.nextInt();
						
						switch (key3) {
						case 1:
							nuevo_masajista.darMasaje();
							break;
							
						case 0:
							System.out.println("Gracias por preferirnos! Adios");
							break;

						default:
							break;
						};
					} while (key3 != 0);
					
				}
				
				
				break;
				
			case 0:
				System.out.println("Gracias por preferirnos! Adios");
				break;
			}
			
		} while (seleccion != 0);
	}

}
