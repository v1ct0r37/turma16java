package exercicioaulas;

import java.util.Scanner;

public class ExSegundosEmHoras 
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		
		int h,m,s;
		
		System.out.println("Qual tempo de duracao do evento em segundos: ");
		s = ler.nextInt();
		
		h = s / 3600;
		m = (s % 3600) / 60;
		s = (s % 3600) % 60;
		
		System.out.printf("O evento vai dura %d horas, %d minutos e, %d segundos  ", h, m, s);
		
		
	}
}
