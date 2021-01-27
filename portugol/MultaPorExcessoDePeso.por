programa
{
		
	funcao inicio()
	{
		real peso 
		real multa = 4.00
		real excesso

		escreva ("Informe o PESO(kg) dos produtos: ")
		leia(peso)

		se (peso <= 50.00)
		{
			escreva ("Peso total: ", peso, " Kg" , "\nExcesso: 0", "\nMulta: 0 ")
		}
		senao
		{
			escreva ("Atenção peso Excedido em: ", peso - 50, " kg", "\nMulta: ", multa * (peso - 50))
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */