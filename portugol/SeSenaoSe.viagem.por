programa
{
	
	funcao inicio()
	{
		real grana=0.00
	
		escreva("Quanto eu tenho de grana? ")
		leia(grana)

		se (grana >= 10000)
		{
			escreva("Partiu Disney ")
		}
		senao se (grana >= 5000 e grana < 10000)
		{
			escreva("Visitar Familia ")
		}
		senao
			escreva("Chateado ")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 285; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */