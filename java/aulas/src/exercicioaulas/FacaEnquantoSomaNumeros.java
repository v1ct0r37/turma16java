package exercicioaulas;

import java.util.Scanner;

public class FacaEnquantoSomaNumeros 
{

	public static void main(String[] args) 

	{
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um numero: ");
		int numero = ler.nextInt();
		int soma = 0;
		do
		{
			soma += numero;
			numero -= 1;
			
			System.out.println("soma: " + soma);
			System.out.println("numero: " + numero);
			
		}while(numero >= 0);
		
		System.out.println(soma);
		
	}	
}