programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		/*
		 * Crie um programa que receba valore
		 * s do usuário para preencher uma m
		 * atriz 3X3, e em seguida, exiba a 
		 * soma dos valores dela e a soma do
		 * s valores da primeira diagonal
		 * , ou seja, diagonal principal.
		 */

		 
		 const inteiro TAMANHO =3
		 inteiro cubo[TAMANHO][TAMANHO]
		 inteiro somatorio=0
		 
		 para (inteiro linha=0; linha<TAMANHO; linha++) //giro da linha
		 {
		 	para (inteiro coluna=0; coluna<TAMANHO; coluna++)
		 	{
		 		cubo[linha][coluna] = Util.sorteia(1, 9)
		 		se (linha == coluna)
		 		{
		 			somatorio += cubo[linha][coluna]
		 		}
		 		escreva(cubo[linha][coluna], " ")
		 	}
		 	escreva("\n")
		 }
		 escreva("somatorio da diagonal principal é: ", somatorio)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 775; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */