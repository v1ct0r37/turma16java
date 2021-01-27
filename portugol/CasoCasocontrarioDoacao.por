programa
{
	
	funcao inicio()
	{
		inteiro D=0.00
		real	valor=0.00
		escreva("------------------------\n")
		escreva("  CRIANÇA ESPERANÇA ")
		escreva("------------------------\n")
		escreva("  [1] para doar 10 R$ \n")
		
		escreva("  [2] para doar 25 R$ \n")
		
		escreva("  [3] para doar 50 R$ \n")
		
		escreva("  [4] para doar outros valores\n ")
		
		escreva(" [5] para cancelar\n ")
		leia(D)
		escolha (D)
		{
			caso 1:
				valor = 10.00
				escreva("SUA DOAÇÃO FOI: ", valor)
				pare
			caso 2:
				valor = 20.00
				escreva("SUA DOAÇÃO FOI: ", valor)
				pare
				
			caso 3: 
				valor= 50.00
				escreva("SUA DOAÇÃO FOI: ", valor)
				pare
				
			caso 4:				
				escreva(" Qual o valor R$: ")
				leia(valor)
				escreva("SUA DOAÇÃO FOI: ", valor)
				pare
				
			caso 5:
				escreva("Operação cancelada ")
				pare
			caso contrario:
				escreva("Opção invalida ")
		
			
		
				
			
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 768; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */