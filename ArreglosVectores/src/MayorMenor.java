
public class MayorMenor {

	public MayorMenor() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vectorArray = new int[]{ 23, 56, 7, 78, 45, 1, 35, 17, 69, 83 };
		
		int[] numeroMayor = new int[]{vectorArray[0], 0};
		int[] numeroMenor = new int[]{vectorArray[0], 0};
		
		for(int i = 0; i < vectorArray.length; i++) {
			System.out.println(vectorArray[i]);
			if(vectorArray[i] < numeroMenor[0] ) {
				numeroMenor[0] = vectorArray[i];
				numeroMenor[1] = i;
			}
			
			if(vectorArray[i] > numeroMayor[0]) {
				numeroMayor[0] = vectorArray[i];
				numeroMayor[1] = i;
			}
			
		}
		
		System.out.println("Este es el número menor: " + numeroMenor[0] + " posicion: " + numeroMenor[1]);
		System.out.println("Este es el número mayor: " + numeroMayor[0] + " posicion: " + numeroMayor[1]);

	}

}
