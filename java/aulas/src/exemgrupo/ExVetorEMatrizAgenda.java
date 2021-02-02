package exemgrupo;

import java.util.Scanner;

public class ExVetorEMatrizAgenda 
{

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		String[][] eventoDia = new String[24][31];
		String nomeUsuario;
		double horaEvento;
		int hora =0, dia=0;
		char teste, S, N;
		boolean continuar;
		
		do 
		{
			System.out.print("BEM VINDO, DIGITE SEU NOME: ");
			nomeUsuario = ler.next();
			
			do 
			{
				System.out.print("ESCOLHA UM DIA PARA O CADADASTRO [1/31]: ");
				dia = ler.nextInt();
				dia = dia-1;
				
				while (dia <=0 || dia >31)
				{
					System.out.println("Data informada incorreta, escolha uma data entre 1 e 31: ");
				}
				System.out.printf("ESCOLHA UMA HORA PARA O CADASTRO [0/24]: ");
				hora = ler.nextInt();
				while (hora <0 || hora >23)
				{
					System.out.println("Hora informada incorreta, escolha entre 0 e 23 h: ");
					hora = ler.nextInt();
				}	
					
					System.out.printf("INFORME A TAREFA NESTA DATA E HORA: ");
					eventoDia[hora][dia] = ler.next();
					
					System.out.println("Continua sim ou nao [S/N]");
					teste = ler.next().charAt(0);
					
			}
				while (teste != 'N');
					for (String[] i : eventoDia)
				{
					for (String j : i)
					{
						System.out.println(j);
					}
				}
	
			}				
		}	
			
	}	
		
}
