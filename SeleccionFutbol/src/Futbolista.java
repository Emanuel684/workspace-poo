//Emanuel Acevedo Muñoz - ID 000478429
public class Futbolista extends SeleccionFutbol {
	
	int dorsal;
	String demarcacion;

	public Futbolista() {
		// TODO Auto-generated constructor stub
		this.dorsal = 0;
		this.demarcacion = "";
	}
	
	void jugarPartido() {
		System.out.println("-------------------------------------");
		System.out.println("jugarPartido");
		System.out.println("-------------------------------------");
		
	}
	
	void entrenar() {
		System.out.println("-------------------------------------");
		System.out.println("entrenar");
		System.out.println("-------------------------------------");
	}
	
	void ingresar_futbolista() {
		System.out.println("-------------------------------------");
		System.out.println("Ingresar Futbolista");
		System.out.println("-------------------------------------");
		this.ingresar();
		System.out.println("Ingrese el dorsal del futbolista: ");
		this.dorsal = sc.nextInt();
		System.out.println("Ingrese la demarcacion del futbolista: ");
		sc.nextLine();
		this.demarcacion = sc.nextLine();
	}

}
