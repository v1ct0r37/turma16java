package exercicioaulas;

import java.util.Scanner;

public class ExDoWhile5 
	{

	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		//Crie um programa que leia um n�mero do teclado at� 
		//que encontre um n�mero igual a zero. 
		//No final, mostre a soma dos n�meros digitados.(DO...WHILE)
		
		int x, soma=0;
				
		do 
		{
			System.out.printf("Digite um numero (Para encerrar digite 0): ");
			x = ler.nextInt();
			soma = (soma+x);
			
						
		}
		while(x != 0);
					
		System.out.printf("A soma dos valor(es) digitado(os) � igual a: " +soma);
		
		}
	
			

}
