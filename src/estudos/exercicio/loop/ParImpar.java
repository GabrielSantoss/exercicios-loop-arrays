package estudos.exercicio.loop;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int quantidadeNumeros, numero;
		int numerosImpares = 0, numerosPares = 0;
		int contador = 0;

		System.out.println("Informe a quantidade de números: ");
		quantidadeNumeros = sc.nextInt();

		do {

			System.out.println("Informe o número: ");
			numero = sc.nextInt();

			if (numero % 2 == 0)
				numerosPares++;
			else
				numerosImpares++;
			
			contador++;

		} while (contador < quantidadeNumeros);

		System.out.println("Quantidade de números pares: " + numerosPares);
		System.out.println("Quantidade de números pares: " + numerosImpares);

		sc.close();

	}

}
