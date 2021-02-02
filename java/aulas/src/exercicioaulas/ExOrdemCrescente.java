package exercicioaulas;

import java.util.Scanner;

	public class ExOrdemCrescente
{
		
			public static void main(String[] args) {
				
				Scanner ler = new Scanner(System.in);
						
				int A,B,C, maior = 0, menor = 0, meio = 0;

				System.out.print("Digite um valor inteiro: ");
				A = ler.nextInt();
				System.out.print("Digite outro valor inteiro: ");
				B = ler.nextInt();
				if(B > A) { //SE B FOR MAIOR QUE A ENTAO B SERA O MAIOR VALOR E A O MENOR
					maior = B;
					menor = A;
				}else {  // SE NÃO A SERÁ O MAIOR VALOR E B O MENOR
					maior = A;
					menor = B;
				}
				System.out.print("Digite o último valor inteiro: ");
				C = ler.nextInt();
				if(C > maior) { // SE C FOR MAIOR QUE O MAIOR VALOR, ELE PASSA A SER O MAIOR VALOR E O ANTIGO MAIOR VALOR FICA NO MEIO 
					meio = maior;
					maior = C;
				} else if(C <= menor){ // SE C FOR MENOR QUE O MENOR, O MENOR VIRA O MEIO E O C PASSA A SER O MENOR VALOR
					meio = menor;
					menor = C;
				} else { // SE C FOR MAIOR QUE O MENOR ELE FICA NO MEIO	
					C = meio;			
				}
				System.out.printf("Ordem crescente é %d, %d, %d.",menor, meio, maior);
			}
		}