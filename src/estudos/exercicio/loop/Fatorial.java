package estudos.exercicio.loop;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int fatorial;
		int multiplicacao = 1;
		
		System.out.println("Informe o número fatorial: ");
		fatorial = sc.nextInt();
		
		for (int i = fatorial; i >= 1; i--) {
			multiplicacao = multiplicacao * i;
		}
		
		System.out.println(fatorial + "! = " + multiplicacao);
		
		sc.close();

	}

}
