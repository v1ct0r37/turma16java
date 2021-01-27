programa
{
	
	funcao inicio()
	{
		//solicite o nome de 4 alunos e suas notas
		//mostre na tela o nome e do lado a nota e mostre
		//qual a maior nota

		cadeia nomeAlunos[4]			// assim
		inteiro notaAlunos[4]  //ou assim

		/*nomeAlunos[0]= "Candido"
		nomeAlunos[1]= "Athos"
		nomeAlunos[2]= "Andressa"
		nomeAlunos[3]= "Gisele"
		*\
				 */
				 

		para(inteiro x=0; x<4; x++)
		{
			escreva("O nome do Alune é: ")
			leia(nomeAlunos[x])
			escreva("Digite a nota: ")
			leia(notaAlunos[x])
		}

		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 432; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */