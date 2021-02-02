package exercicioaulas;

import java.util.Scanner;

public class ExDiasEmAnos 
{
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		
		int ano, mes, dia;
		
		System.out.printf("Escreva sua idade em dias: ");
		dia = ler.nextInt();
		
		ano = dia / 365;
		mes = (dia % 365) / 30;
		dia = (dia % 365) % 30;
				
		System.out.printf("Voce tem: %d ano(s) , %d meses e %d dias(s)", ano, mes, dia);
	}

}
