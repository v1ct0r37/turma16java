package exerciciosControle;

import java.util.Scanner;

public class ExNotas {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double n1, n2, media;

		System.out.println("Digite a primeira nota: ");
		n1 = ler.nextDouble();
		System.out.println("Digite a segunda nota: ");
		n2 = ler.nextDouble();

		media = n1 + n2 / 2;

		if (media >= 7.0) {
			System.out.printf("A sua média foi %.2f e você está Aprovado", media);
		} else if ( media >= 4.0) {
			{
				System.out.printf("A sua media foi %.2f e você esta de Recuperação", media);
			}
		}else {
			System.out.println("A sua media foi %.2f e você esta Reprovado");
		}
		ler.close();
	}
}
