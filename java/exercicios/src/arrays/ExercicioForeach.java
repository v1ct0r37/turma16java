package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioForeach {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Quantas notas voce quer digitar ?");
		int qtdNota = ler.nextInt();

		double[] notas = new double[qtdNota];

		for (int i = 0; i < notas.length; i++) {

			System.out.print("Digite a nota " + (i + 1) + ": ");
			notas[i] = ler.nextInt();
		
		}
		System.out.println(Arrays.toString(notas));
		
		double total = 0;
		for(double nota: notas) {
			total += nota;
		}
		double media = (total / notas.length);
		System.out.print("A média é " + media );
		ler.close();

	}
}