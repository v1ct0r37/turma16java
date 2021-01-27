programa
{
	//pedir ao usuario nome(nomecompleto), 
	//sexo(M ou F) ,ano nascimento(AAAA)
	//escreva na tela a idade aproximada da pessoa
	
//inteiro numero1//numero inteiros
		//real numero2//numero com virgula
		//cadeia nome // frases letras 
		//caracter sexo// caracter qualquer
		//logico vacinado
	
	funcao inicio()
	{
		cadeia nomeCompleto
		caracter sexo
		inteiro anoN
		inteiro resultado
		escreva("Digite seu nome completo: ")
		leia(nomeCompleto)
		escreva("\n Digite seu sexo(M/F): ")
		leia(sexo)
		escreva("\nDigite seu ano de nascimento(AAAA): ")
		leia(anoN)

		resultado = 2021 - anoN
		escreva("Os anos de vida aproximadamente são " + resultado+ " anos")
	
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 451; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */