package ExercicioAulas;

import java.util.Scanner;

public class RepeticaoWhile {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int idade;
		System.out.printf("Entre com a sua idade: ");
		idade = ler.nextInt();
		
		while(idade >= 1)
		{
			System.out.printf("Sua idade:  " +idade);
			if(idade >=18)
			{
				System.out.printf("\nVocê é maior de idade... ");
				
			}
			else
			{
				System.out.printf("\nVocê é menor de idade... ");
			}
			System.out.printf("\nEntre com a sua idade: ");
			idade = ler.nextInt();
				
		}
		
	}

}
