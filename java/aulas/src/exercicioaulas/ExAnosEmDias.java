package exercicioaulas;

import java.util.Scanner;

public class ExAnosEmDias
{
	public static void main(String args[])
	{
		Scanner ler = new Scanner (System.in);
		int anos,meses,dias,total;
		
		System.out.printf("Quantos anos voce tem ?: ");
		anos = ler.nextInt();
		System.out.printf("E quantos meses: ");
		meses = ler.nextInt();
		System.out.printf("E quantos dias: ");
		dias = ler.nextInt();
		total= (anos*365)+(meses*30)+(dias);
		
		System.out.printf("Notal são: %d", total, "Dias ");
		
		
	}

}
