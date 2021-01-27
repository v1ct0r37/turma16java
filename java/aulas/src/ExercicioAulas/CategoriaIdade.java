package ExercicioAulas;

import java.util.Scanner;

public class CategoriaIdade 
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
				
		int idade;
		
		System.out.print("Digite a sua idade: ");
		idade = ler.nextInt();
		
		if(idade >=18 && idade <=25)
		{
			System.out.print("Você está na categoria 'ADULTO' ");
		}
		else if(idade >=15 && idade <=17)
		{
			System.out.print("Você está na categoria 'JUVENIL' ");
		}
		else if(idade >= 10 && idade <=14)
		{
			System.out.print("Você está na categoria 'INFANTIL' ");
		}
		else
		{
			System.out.print("Você não pertence a nenhuma categoria ");
		}
			
	}
}
