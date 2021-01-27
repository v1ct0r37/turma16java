programa
{
	
	funcao inicio()
	{
		real N1=0.00, N2=0.00, M=0.00
		escreva("Digite a primeira nota: ")
		leia(N1)
		escreva("Digite a segunda nota: ")
		leia(N2)
		M = (N1+N2)/2

		se (M < 5)
		{
			escreva("Média: ", M)
			escreva("Classificacao: F ")
		}
			
		senao se (M <= 5.9)
		{
			escreva("Média: ", M)
			escreva("\nClassificacao: E ")
		}
		senao se ( M <= 6.9)
		{
			escreva("Média: ", M)
			escreva("\nClassificacao: D ")
		}
		senao se ( M <= 7.9)
		{
			escreva("Média: ", M)
			escreva("\nClassificacao: C ")
		}
		senao se (M <= 8.9)
		{
			escreva("Média: ", M)
			escreva("\nClassificacao: B ")
		}
		senao
		{
			escreva("Média: ", M)
			escreva("\nClassificacao: A")
		}

		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 550; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */