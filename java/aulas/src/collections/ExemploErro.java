package collections;

	import java.util.Scanner;

	public class ExemploErro {

		public static void main(String[] args) 
		{
			Scanner leia = new Scanner(System.in);
			
			try
			{
			
				System.out.println("Digite uma sequencia de nomes:");
				String[] vetor = leia.nextLine().split(" ");//{"ed","rafao","milton"}
				System.out.println("Digite uma posição da lista: ");
				int posicao = leia.nextInt();
				System.out.println("O nome na posição escolhida é "+vetor[posicao]);
			}
			catch (java.lang.ArrayIndexOutOfBoundsException erro)
			{
				System.out.println("Amigão, tu digitou um tamanho de indice errado!!!");
			}
			catch (java.util.InputMismatchException erro)
			{
				System.out.println("Amigão, você digitou um texto, tem que ser numeroo!!!");
			}
			finally {
				System.out.println("Você precisa tratar bem as suas informações");
			}
			System.out.println("Fim de programa!!!!");
			
		}
		
	}
