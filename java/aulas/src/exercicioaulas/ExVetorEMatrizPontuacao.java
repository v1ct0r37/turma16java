package exercicioaulas;

import java.util.Scanner;

public class ExVetorEMatrizPontuacao {

	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		
		//1.Faça um programa que crie um vetor por leitura com 
		//5 valores de pontuação de uma atividade e o escreva em seguida.
		//Encontre após a maior pontuação e a apresente. 
		
		double pontuacao[] = new double[5];
		int maiorPontuacao = 0;
		int contadorP=1;
		
		
		for (int x=0; x<5; x++)
		{
			System.out.println("Digite a pontuacao da "+ contadorP+ "° atividade: ");
			pontuacao[x] = ler.nextDouble();
			contadorP++;
			if(pontuacao[x] > maiorPontuacao)
				maiorPontuacao = (int) pontuacao[x];
		}
		for (int x=0; x<5; x++)
		System.out.println(" Nota "+(x+1)+" = "+pontuacao[x]);
		System.out.printf("A maior pontuacao foi: "+maiorPontuacao);
	}
		
}
