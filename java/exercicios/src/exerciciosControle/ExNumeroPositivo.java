package exerciciosControle;

import java.util.Scanner;

public class ExNumeroPositivo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero = 0;
		int somadorDeNumeros = 0;

		while (numero >= 0) {
			System.out.println("O numero � positivo, continue digitando: ");
			numero = ler.nextInt();
			if (numero > 0) {
				somadorDeNumeros += numero; // Isso � igual a somadorDeNumeros = somadorDeNumeros + numero;
				System.out.printf("\nSoma at� o momento: %d\n", somadorDeNumeros);

			}
			ler.close();
		}
	}
}