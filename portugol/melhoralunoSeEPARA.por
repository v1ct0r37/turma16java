programa
{
	
	funcao inicio()
	{
		real nota=0.00, maior=0.00
		inteiro alunos
		cadeia nome
		
		escreva("Quantos alunos a turma tem: ")
		leia(alunos)
		
		para (inteiro cont=1;cont<=alunos;cont++)
		
		{
			escreva("ALUNO ", cont)
			escreva("\nDigite o nome do Aluno: ")
			leia(nome)
			
			escreva("Digite a nota do aluno: ")
			leia(nota)
			se (nota > maior)
				maior = nota
			
							

		
		
	
	
		}
		escreva("O melhor aproveitamento foi ",  "com a nota ", maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 458; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */