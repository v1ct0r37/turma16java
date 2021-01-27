programa
{
	
	funcao inicio()
	{
		//Faça um programa que crie um vetor 
		//por leitura com 5 valores de pontuação 
		//de uma atividade e o escreva em seguida. 
		//Encontre após a maior pontuação e 
		//a apresente. 

		inteiro vetor[5]
		real maiorVetor = 0.00

		para (inteiro i=0;i<5;i++)
		{
			escreva("Digite a ", (i+1) ,"°", " pontuação : ")
			leia(vetor[i])
			se ( vetor[i] > maiorVetor)
			maiorVetor = vetor[i]
			
			
		}
		limpa()
		escreva( "\nA maior pontuação foi: ", maiorVetor)
			
		
				
		

			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 531; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */