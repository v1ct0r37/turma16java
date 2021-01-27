programa //somador
{
	
	funcao inicio()
	{
		inteiro cont=0, N=0, S=0, maior=0
		cont = 1
		enquanto (cont <=5)
		{
			escreva("Digite o ", cont, "o. valor: ")
			leia(N)
			se (N > maior)
			maior = N
			S = S + N
			cont = cont + 1
			
		}
			escreva("A soma de todos os valores foi: ", S)
			escreva("\nO maior nnumero digitado foi: ", maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 292; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */