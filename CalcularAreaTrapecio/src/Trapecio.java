// Emanuel Acevedo Muñoz
import java.util.Scanner;

public class Trapecio {
	
	static Scanner sc = new Scanner(System.in);
	
	public Trapecio() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int seleccion = 0;
		do {
			System.out.println("1. Triangulo");
			System.out.println("2. Cuadrado");
			System.out.println("3. Rectangulo");
			System.out.println("4. Rombo");
			System.out.println("5. Romboide");
			System.out.println("6. Trapecio");
			System.out.println("7. Pentagono");
			System.out.println("8. Circulo");
			System.out.println("0. Salir del programa");
			System.out.println("Ingrese el número de la opcion que quiere ejecutar: ");
			seleccion = sc.nextInt();
			
			switch (seleccion) {
			case 1:
				System.out.println("Ingrese la base del triangulo: ");
				int trianguloBase = sc.nextInt();
				
				System.out.println("Ingrese la altura del triangulo: ");
				int trianguloAltura = sc.nextInt();
				
				float trianguloArea = (trianguloBase * trianguloAltura) / 2;
				
				System.out.println("El area del triangulo es:" + trianguloArea);
				
				break;
				
			case 2:
				System.out.println("Ingrese el lado del cuadrado: ");
				int cuadradoLado = sc.nextInt();
				
				double cuadradoArea = Math.pow(cuadradoLado, 2);
				
				System.out.println("El area del cuadrado es:" + cuadradoArea);
				
				break;
				
			case 3:
				System.out.println("Ingrese la base del rectangulo: ");
				int rectanguloBase = sc.nextInt();
				
				System.out.println("Ingrese la altura del rectangulo: ");
				int rectanguloAltura = sc.nextInt();
				
				double rectanguloArea = rectanguloBase * rectanguloAltura;
				
				System.out.println("El area del cuadrado es:" + rectanguloArea	);
				
				break;
				
			case 4:
				System.out.println("Ingrese la diagonal mayor del rombo: ");
				int romboDiagonalMayor = sc.nextInt();
				
				System.out.println("Ingrese la diagonal menor del rombo: ");
				int romboDiagonalMenor = sc.nextInt();
				
				float romboArea = (romboDiagonalMenor * romboDiagonalMayor) / 2;
				
				System.out.println("El area del rombo es: " + romboArea);
				
				break;
			case 5:
				System.out.println("Ingrese la base del romboide: ");
				int romboirdeBase = sc.nextInt();
				
				System.out.println("Ingrese la altura del romboide: ");
				int romboideAltura = sc.nextInt();
				
				double romboideArea = romboideAltura * romboirdeBase;
				
				System.out.println("El area del romboide es:" + romboideArea	);
				
				break;
			case 6:
				System.out.println("Ingrese la base menor del trapecio: ");
				int baseMenor = sc.nextInt();
				
				System.out.println("Ingrese la base mayor del trapecio: ");
				int baseMayor = sc.nextInt();
				
				System.out.println("Ingrese la altura del trapecio: ");
				int alturaTrapecio = sc.nextInt();
				
				int areaTrapecio = ((baseMayor + baseMenor) / 2 ) * alturaTrapecio ;
				System.out.println("El area del trapecio es: " + areaTrapecio);
				
				break;
				
			case 7:
				System.out.println("Ingrese el lado del pentagono: ");
				int pentagonoLado = sc.nextInt();
				
				System.out.println("Ingrese el apotema del pentagono: ");
				int pentagonoApotema = sc.nextInt();
				
				int pentagonoArea = (5 / 4) * pentagonoLado * pentagonoApotema;
				System.out.println("El area del pentagono es: " + pentagonoArea);
				
				break;
			case 8:
				System.out.println("Ingrese el radio del circulo: ");
				int circuloRadio = sc.nextInt();
				
				double circuloArea = Math.PI * Math.pow(circuloRadio, 2);
				System.out.println("El area del circulo es: " + circuloArea);
				
				break;
			case 0:
				break;
			}
			
		} while (seleccion != 0);
		

	}

}
