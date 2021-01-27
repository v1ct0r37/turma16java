programa
{
	
	funcao inicio()
	{
		cadeia nome
		real nota1, nota2, nota3, nota4, mediaNotas, maiorNota = 0.00

		escreva("Olá, digite seu nome: ")
		leia(nome)
		escreva("Digite o valor da nota 1: ")
		leia(nota1)
		escreva("Digite o valor da nota 2: ")
		leia(nota2)
		escreva("Digite o valor da nota 3: ")
		leia(nota3)
		escreva("Digite o valor da nota 4: ")
		leia(nota4)

		
		se (nota1 > maiorNota)
		{
			maiorNota = nota1
		}
		se (nota2 > maiorNota)
		{
			maiorNota = nota2
		}
		se (nota3 > maiorNota)
		{
			maiorNota = nota3
		}
		se (nota4 >maiorNota)
		{
			maiorNota = nota4

			escreva("\nSua maior nota foi: ", maiorNota)
		}

		
			
		
		
	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 385; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */