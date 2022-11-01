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
		System.out.println("CALCULADORA");
		System.out.println("-------------------------------------------");
		int seleccion = 0;
		float numero1 = 0;
		float numero2 = 0;
		
		do {
			System.out.println("");
			System.out.println("1. Sumar.");
			System.out.println("2. Resta.");
			System.out.println("3. Multiplicar.");
			System.out.println("4. Dividir.");
			System.out.println("0. Salir del programa");
			System.out.println("Ingrese el número de la opcion que quiere ejecutar: ");
			System.out.println("-------------------------------------------");
			seleccion = sc.nextInt();
			
			CalculadoraOb mi_calculadora = new CalculadoraOb();
			
			switch (seleccion) {
			case 1:
				System.out.println("-------------------------------------------");
				System.out.println("Suma");
				
				System.out.println("Ingrese el número #1 a sumar:");
				numero1 = sc.nextFloat();
				
				System.out.println("Ingrese el número #2 a sumar: ");
				numero2 = sc.nextFloat();
				
				mi_calculadora.Suma(numero1, numero2);
				
				System.out.println("El resultado de la suma es: " + mi_calculadora.resultado);
				
				break;
				
			case 2:
				System.out.println("-------------------------------------------");
				System.out.println("Resta");
				
				System.out.println("-------------------------------------------");
				System.out.println("Tenga en cuenta NUMERO1 - NUMERO2");
				System.out.println("-------------------------------------------");
				
				System.out.println("Ingrese el número #1 a restar:");
				numero1 = sc.nextFloat();
				
				System.out.println("Ingrese el número #2 a sumar: ");
				numero2 = sc.nextFloat();
				
				mi_calculadora.Resta(numero1, numero2);
				
				System.out.println("El resultado de la resta es: " + mi_calculadora.resultado);
				
				break;
				
			case 3:
				System.out.println("-------------------------------------------");
				System.out.println("Multiplicacion");
				
				System.out.println("Ingrese el número #1 a multiplicar:");
				numero1 = sc.nextFloat();
				
				System.out.println("Ingrese el número #2 a multiplicar: ");
				numero2 = sc.nextFloat();
				
				mi_calculadora.Multiplicacion(numero1, numero2);
				
				System.out.println("El resultado de la multiplicacion es: " + mi_calculadora.resultado);
				
				break;
				
			case 4:
				System.out.println("-------------------------------------------");
				System.out.println("Division CalculadoraOb");
				
				System.out.println("-------------------------------------------");
				System.out.println("Tenga en cuenta NUMERADOR / DENOMINADOR");
				System.out.println("-------------------------------------------");
				
				System.out.println("Ingrese el numerador a dividir:");
				float numerador = sc.nextFloat();
				
				System.out.println("Ingrese el denominador a dividir: ");
				float denominador = sc.nextFloat();
				
				mi_calculadora.Division(numerador, denominador);
				
				System.out.println("El resultado de la division es: " + mi_calculadora.resultado);
				
				break;
				
			case 0:
				System.out.println("Gracias por preferirnos! Adios");
				break;
			}
			
		} while (seleccion != 0);
	}

}
