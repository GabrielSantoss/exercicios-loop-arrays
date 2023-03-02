package estudos.exercicio.arrays;

public class OrdemInversa {

	public static void main(String[] args) {
		
		int [] vetor = {5, 8, 0, -5, 6, 2};
		int count = 0;
		
		System.out.println("Posições do vetor original ");
		while (count < (vetor.length)) {
			
			System.out.print(vetor[count] + " " );

			count++;
		}
		
		
		System.out.println("\nPosições do vetor alterado ");
		for(int i = (vetor.length -1); i >= 0; i-- ) {
			System.out.print(vetor[i] + " " );
		}

	}

}
