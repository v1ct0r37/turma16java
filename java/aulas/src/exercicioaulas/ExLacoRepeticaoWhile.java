package exercicioaulas;

import java.util.Scanner;

public class ExLacoRepeticaoWhile {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		/*Solicitar a idade de várias pessoas e imprimir: 
		 * Total de pessoas com menos de 21 anos. 
		 * Total de pessoas com mais de 50 anos. 
		 * O programa termina quando idade for =-99.
		 */
		int idade, contador21=0, contador50=0;
		
		System.out.printf("Digite a idade da pessoa: ");
		idade = ler.nextInt();
		
		while(idade != -99)
		{
			if(idade < 21)
				contador21++;
			if(idade > 50)
				contador50++;
			System.out.print("\nDigite a idade da pessoa (Para sair digite -99): ");
			idade = ler.nextInt();
		}
		System.out.println(" O total de pessoas com menos de 21 anos é: " +contador21);
		System.out.println(" O total de pessoas com mais de 50 anos é: " +contador50);

		
		
	}

}
