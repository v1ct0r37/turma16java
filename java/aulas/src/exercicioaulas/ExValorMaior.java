package exercicioaulas;

import java.util.Scanner;

public class ExValorMaior 
{
	
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		
		//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.//
		
		int numero, maior = 0;
		
		for(int x=0; x<3; x++)
		{
			System.out.println("Digite um numero inteiro: ");
			numero = ler.nextInt();
			
			if(numero > maior)
				
				maior = numero;
		
		}
		System.out.println("O maior numero digitado foi: " + maior);
}

}