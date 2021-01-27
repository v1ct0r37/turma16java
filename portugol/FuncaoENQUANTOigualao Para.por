programa
{
	inclua biblioteca Matematica
 --> Mat
	
	funcao inicio()
	{
		real R=0, D=0.00 
		inteiro contador=0, Q=0

			escreva("Quantas vezes voce quer converter? :")
			leia(Q)
			enquanto (contador<=Q)
			{
				escreva("\nQual o valor em R$: ")
				leia(R)
				contador = contador + Q
						
			
			D = R/2.20
			escreva("\nO valor convertido é US$ ", Mat.arredondar(D, 2))
			}
		
	}
}


		/*OU ASSIM
		 * 
		 */para (inteiro contador=0;contador<2;contador++)
		//	{
		//		escreva("\nQual o valor em R$: ")
		//		leia(R)
		//	}

			

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 112; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */