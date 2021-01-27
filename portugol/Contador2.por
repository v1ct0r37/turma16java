programa
{
	
	funcao inicio()
	{
		inteiro contador=0, valor=0, salto=1
		escreva("Ate qual numero você quer contar?: ")
		leia(valor)
		escreva("Qual sera o valor do salto: ")
		leia(salto)
		enquanto (contador <=valor) 
		{
			escreva(contador, "\n")
			contador = contador + salto
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 283; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */