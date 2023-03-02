package estudos.exercicio.loop;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int nota;

		while (true) {

			System.out.println("Informe uma nota de 0 a 10: ");
			nota = sc.nextInt();
			if ((nota < 0) | (nota > 10))
				break;
			
			System.out.println("Nota:" + nota);
		}

		System.out.println("Fim do programa");

		sc.close();

	}

}
