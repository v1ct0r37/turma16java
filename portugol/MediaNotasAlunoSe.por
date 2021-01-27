programa
{
	
	funcao inicio()
	{
		real N1, N2, M
		
		
		escreva("Digite a primeira nota: ")
		leia(N1)
		escreva("Digite a segunda nota: ")
		leia(N2)
		M = (N1+N2)/2
		limpa()
		escreva("A média do aluno foi ", M)

		se (M >= 7)
		{
			escreva(" Aprovado ")
		}
		senao se (M >= 5 e M < 7)
		{
			escreva("\naluno em recuperação \n")
		}
		senao
	{
			escreva("\nAluno Reprovado ")
	}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 372; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */