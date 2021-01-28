package ExercicioAulas;

import java.util.Scanner;

public class LacoDoWhile {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int idade;
		
		
		do
		{
			System.out.printf("Entre com a sua idade: ");
			idade = ler.nextInt();
			System.out.printf("Sua idade:  " +idade);
			if(idade >=18)
			{
				System.out.printf("\nVocê é maior de idade... ");
				
			}
			else
			{
				System.out.printf("\nVocê é menor de idade... ");
			}
			
				
		}	while(idade >= 1);
		
	}

}
