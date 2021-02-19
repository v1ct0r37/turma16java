package exerciciosControle;

import java.util.Scanner;

public class ExReceberUmNumeroEntre0E10 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int valor;

		System.out.println("Digite um numero: ");
		valor = ler.nextInt();

		
		if (valor > 0 && valor <= 10) {
			if (valor % 2 == 0) {
				System.out.printf("Este numero %d é par", valor);
			} else {
				System.out.printf("Este numero %d é impar", valor);

			}

		}else {
			System.out.println("O numero nao esta entre 0-10");
		}

		ler.close();
	}
}
