package estudos.exercicio.loop;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int numero = 0;

		System.out.println("Informe o numero da tabuada: ");
		numero = sc.nextInt();
		
		System.out.println("Tabuada do " + numero + ":");
		
		for (int i = 1; i < 11; i++ ) {
			
			System.out.println(numero + " X " + i + " = " + numero*i);
			
		}

		sc.close();


	}

}
