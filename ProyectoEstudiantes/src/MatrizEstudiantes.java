import java.util.Scanner;
//Emanuel Acevedo Muñoz - ID 000478429

public class MatrizEstudiantes {
	
	static Scanner sc = new Scanner(System.in);

	public MatrizEstudiantes() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int seleccion = 0;
		// Defino el vector y la matriz
		String mEstudiantes[][] = new String[5][2];
		double mNotas[][] = new double[5][2];
		
		do {
			System.out.println("");
			System.out.println("INGRESAR ESTUDIANTES DE POO");
			System.out.println("1. Ingresar id, nombre, direccion, nota de 5 estudiantes");
			System.out.println("2. Ingresar nota de 5 estudiantes");
			System.out.println("3. Buscar nota de estudiante por id");
			System.out.println("4. Cambiar direccion de estudiante por id");
			System.out.println("0. Salir del programa");
			System.out.println("Ingrese el número de la opcion que quiere ejecutar: ");
			seleccion = sc.nextInt();
			
			switch (seleccion) {
			case 1:
				
				for(int fila = 0; fila < 5; fila++) {
					for(int columna = 0; columna < 2; columna++) {
						if(columna == 0) {
							System.out.println("Ingrese el id en [" + fila +"][" + columna +"]: " + mEstudiantes[fila][columna]);
							mNotas[fila][columna] = sc.nextDouble();
							mNotas[fila][columna + 1] = 0.0;
							System.out.println("Ingrese el nombre en [" + fila +"][" + columna +"]: " + mEstudiantes[fila][columna]);
							mEstudiantes[fila][columna] = sc.next();
						} 
						if(columna == 1) {
							String cosa = sc.nextLine();
							System.out.println("Ingrese la direccion en [" + fila +"][" + columna +"]: " + mEstudiantes[fila][columna]);
							mEstudiantes[fila][columna] = sc.nextLine();
						}
					}
				}
				
				System.out.println("Recorriendo: ");
				
				for(int fila = 0; fila < 5; fila++) {
					for(int columna = 0; columna < 2; columna++) {
						if(columna == 0) {
							System.out.println("Ingrese el id en [" + fila +"][" + columna +"]: " + mNotas[fila][columna]);
							System.out.println("Ingrese el nota en [" + fila +"][" + columna +"]: " + mNotas[fila][columna + 1]);
							System.out.println("Ingrese el nombre en [" + fila +"][" + columna +"]: " + mEstudiantes[fila][columna]);
						} 
						if(columna == 1) {
							System.out.println("Ingrese la direccion en [" + fila +"][" + columna +"]: " + mEstudiantes[fila][columna]);
						}
					}
				}
				
				break;
				
			case 2:
				for(int fila = 0; fila < 5; fila++) {
					for(int columna = 0; columna < 2; columna++) {
						if(columna == 0) {
							System.out.println("Ingrese la nota del estudiante en la posicion [" + fila +"][" + columna +"]: " + mNotas[fila][columna]);
							mNotas[fila][columna + 1] = sc.nextDouble();
						}
					}
				}
				
				System.out.println("Recorriendo: ");
				
				for(int fila = 0; fila < 5; fila++) {
					for(int columna = 0; columna < 2; columna++) {
						if(columna == 0) {
							System.out.println("Ingrese el id en [" + fila +"][" + columna +"]: " + mNotas[fila][columna]);
							System.out.println("Ingrese el nota en [" + fila +"][" + columna +"]: " + mNotas[fila][columna + 1]);
							System.out.println("Ingrese el nombre en [" + fila +"][" + columna +"]: " + mEstudiantes[fila][columna]);
						} 
						if(columna == 1) {
							System.out.println("Ingrese la direccion en [" + fila +"][" + columna +"]: " + mEstudiantes[fila][columna]);
						}
					}
				}
				
				break;
				
			case 3:
				System.out.println("Ingrese el id del estudiante registrado: ");
				double id_estudiante_nota = sc.nextDouble();
				for(int fila = 0; fila < 5; fila++) {
					for(int columna = 0; columna < 2; columna++) {
						if(columna == 0 && mNotas[fila][columna] == id_estudiante_nota) {
							System.out.println("La nota del estudiante es: " + mNotas[fila][columna + 1]);
						}
					}
				}
				
				System.out.println("Recorriendo: ");
				
				for(int fila = 0; fila < 5; fila++) {
					for(int columna = 0; columna < 2; columna++) {
						if(columna == 0) {
							System.out.println("Ingrese el id en [" + fila +"][" + columna +"]: " + mNotas[fila][columna]);
							System.out.println("Ingrese el nota en [" + fila +"][" + columna +"]: " + mNotas[fila][columna + 1]);
							System.out.println("Ingrese el nombre en [" + fila +"][" + columna +"]: " + mEstudiantes[fila][columna]);
						} 
						if(columna == 1) {
							System.out.println("Ingrese la direccion en [" + fila +"][" + columna +"]: " + mEstudiantes[fila][columna]);
						}
					}
				}
				
				break;
				
			case 4:
				System.out.println("Ingrese el id del estudiante registrado: ");
				double id_estudiante_direccion = sc.nextDouble();
				for(int fila = 0; fila < 5; fila++) {
					for(int columna = 0; columna < 2; columna++) {
						if(columna == 0 && mNotas[fila][columna] == id_estudiante_direccion) {
							String cosa = sc.nextLine();
							System.out.println("La direccion del estudiante es: " + mEstudiantes[fila][columna + 1]);
							System.out.println("Ingrese la nueva direccion del estudiante en la posicion [" + fila +"][" + columna +"]: " + mEstudiantes[fila][columna]);
							mEstudiantes[fila][columna + 1] = sc.nextLine();
						}
					}
				}
				
				System.out.println("Recorriendo: ");
				
				for(int fila = 0; fila < 5; fila++) {
					for(int columna = 0; columna < 2; columna++) {
						if(columna == 0) {
							System.out.println("Ingrese el id en [" + fila +"][" + columna +"]: " + mNotas[fila][columna]);
							System.out.println("Ingrese el nota en [" + fila +"][" + columna +"]: " + mNotas[fila][columna + 1]);
							System.out.println("Ingrese el nombre en [" + fila +"][" + columna +"]: " + mEstudiantes[fila][columna]);
						} 
						if(columna == 1) {
							System.out.println("Ingrese la direccion en [" + fila +"][" + columna +"]: " + mEstudiantes[fila][columna]);
						}
					}
				}
				
				break;
			case 0:
				System.out.println("Gracias por preferirnos! Adios");
				break;
			}
			
		} while (seleccion != 0);

	}

}
