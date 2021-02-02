package exemgrupo;

import java.util.*;

public class ExTimes 
{

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		String times[] = {"PALMEIRAS","CORINTHIANS","SANTOS", "SPFC"};
		int pontos[] = new int[4];
		char resposta;
		//int matriz[][] = new int[3][3];
		
		for (int x=0; x<4; x++)
		{
			System.out.printf("Rodada "+(x+1)+ "\n");
			for (int y=0; y<4; y++)
			{
				System.out.printf(" %s(G - Ganhou P - Perdeu ou E - Empatou [G/P/E]): ", times[y] );
				resposta = ler.next().charAt(0);
				
				if (resposta == 'G')
				{
					pontos[y] = pontos[y]+3;
				}
				else if (resposta == 'E')
				{
					pontos[y] = pontos[y]+1;
				}
				else if (resposta == 'P')
				{
					pontos[y] = pontos[y]+0;
					
				}
			}
			System.out.print("\n");
			
		
		
		}
		for (int z=0; z<4; z++)
		{
			System.out.print(times[z]+" Finalizou com " +pontos[z]+ "Pontos. \n");
		}
			

}
}