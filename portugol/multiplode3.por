programa
{
	
	funcao inicio()
	{
		//variaveis
		inteiro total = 0
		//Processamento
		para (inteiro i = 1; i<=500;i++)
		{
			se((i%2)==1 e (i%3)==0)
			{
				total = total + i
			}
		}
		escreva("O somatorio de impares multiplos de 3 é: ", total)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 253; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */