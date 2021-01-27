programa
{
	funcao inicio()
	{
		inteiro mes, ano, dias

		escreva("Escreva sua idade em dias: ")
		leia(dias)

		ano = (dias / 365)
		mes = (dias % 365) /30
		dias = (dias % 365) %30

		escreva("Sua idade é "+ano+ " anos " +mes+ "mês e" +dias+ "dias")
		
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 210; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */