package exercicioaulas;

import java.util.Scanner;

public class ExVetorEMatrizPontuacao2 {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		/*2.	Um dado é lançado 10 vezes e o valor correspondente é anotado. 
		 * Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
		 * A seguir determine e imprima a média aritmética dos lançamentos, 
		 * contabilize e apresente também quantas foram as ocorrências da maior pontuação.
		 */
		
		int[] valor = new int[10];
		int maior =0, contador =0;
		double media =0.0, soma =0.0;
		
		for(int x=0; x<10; x++)
		{
			System.out.println("Digite o "+(x+1)+"° valor");
			valor[x] = ler.nextInt();
			soma = soma + valor[x];
			media = (soma/10);

			if(valor[x] > maior)
			{
				maior = valor[x];
				contador++;
			}
		}
			System.out.printf("Os valores digitados foram: ");
			for(int x=0; x<10; x++)
			System.out.printf(valor[x]+", ");
			System.out.println("Total: "+soma);
			System.out.printf("\nMédia: "+media);
			System.out.print("\nO maior valor digitado foi: "+maior+ " e ele apareceu: " +contador+" vez(es)");
	}

}
