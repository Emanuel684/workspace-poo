//Emanuel Acevedo Muñoz - ID 000478429

public class CalculadoraOb {
	float resultado;

	public CalculadoraOb() {
		// TODO Auto-generated constructor stub
		this.resultado = 0;
	}
	
	void Suma(float numero1, float numero2) {
		System.out.println("Suma CalculadoraOb");
		resultado = numero1 + numero2;
	}
	
	void Resta(float numero1, float numero2) {
		System.out.println("Resta CalculadoraOb");
		resultado = numero1 - numero2;
	}
	
	void Multiplicacion(float numero1, float numero2) {
		System.out.println("Multiplicacion CalculadoraOb");
		resultado = numero1 * numero2;
	}
	
	void Division(float numerador, float denominador) {
		System.out.println("Division CalculadoraOb");
		resultado = numerador / denominador;
	}

}
