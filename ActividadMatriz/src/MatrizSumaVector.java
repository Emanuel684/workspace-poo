// Emanuel Acevedo Muñoz - ID 000478429
import java.util.Scanner;

public class MatrizSumaVector {
	
	static Scanner sc = new Scanner(System.in);

	public MatrizSumaVector() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Defino el vector y la matriz
		int mNumeros[][] = new int[4][3];
		int vSumas[] = new int[4];
		
		for(int fila = 0; fila < mNumeros.length; fila++) {
			for(int columna = 0; columna < mNumeros[fila].length; columna++) {
				System.out.println("Ingrese el número en [" + fila +"][" + columna +"]: " + mNumeros[fila][columna]);
				mNumeros[fila][columna] = sc.nextInt();
			}
		}
		
		System.out.println("Recorriendo: ");
		
		for(int fila = 0; fila < mNumeros.length; fila++) {
			System.out.println("Fila mNumeros[" + fila + "]: " + mNumeros[fila]);
			for(int columna = 0; columna < mNumeros[fila].length; columna++) {
				System.out.println("Columna mNumeros[" + fila + "][" + columna + "]: " + mNumeros[fila][columna]);
				vSumas[fila] = vSumas[fila] + mNumeros[fila][columna];
			}
		}
		
		System.out.println("Imprimiendo vSumas: ");
		
		for(int suma = 0; suma < vSumas.length; suma++) {
			System.out.println("La suma es: " + vSumas[suma] + " en la posicion: " + suma);
		}
		
		System.out.println("Ya termine!");
		

	}

}
