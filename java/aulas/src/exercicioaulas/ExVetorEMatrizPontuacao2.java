package exercicioaulas;

import java.util.Scanner;

public class ExVetorEMatrizPontuacao2 {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		/*2.	Um dado � lan�ado 10 vezes e o valor correspondente � anotado. 
		 * Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor. 
		 * A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, 
		 * contabilize e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.
		 */
		
		int[] valor = new int[10];
		int maior =0, contador =0;
		double media =0.0, soma =0.0;
		
		for(int x=0; x<10; x++)
		{
			System.out.println("Digite o "+(x+1)+"� valor");
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
			System.out.printf("\nM�dia: "+media);
			System.out.print("\nO maior valor digitado foi: "+maior+ " e ele apareceu: " +contador+" vez(es)");
	}

}
