package estudos.exercicio.loop;

import java.util.Scanner;

public class MaiorMedia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int numero;
		int soma = 0;
		int maior = 0;
		
		int contador = 0;

		do {
			
			System.out.println("Informe um número: ");
			numero = sc.nextInt();
			
			if (maior < numero)
				maior = numero;
			
			soma = soma + numero;				
			
			contador++;
			
		} while (contador < 5);		
		
		System.out.println("Maior número informado: " + maior);
		System.out.println("Media entre os números informados " + soma/5);

		sc.close();

	}

}
