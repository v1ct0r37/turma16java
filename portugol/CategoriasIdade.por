programa
{
	//Infantil A = 5 a 7 anos
	//Infantil B = 8 a 11 anos
	//Juvenil A = 12 a 13 anos
	//Juvenil B = 14 a 17 anos


	
	funcao inicio()
	{
		inteiro idade
		
		escreva ("Olá nadador, digite sua idade para conferir a sua categoria:  ")
		leia (idade)

		

		se (idade <5)
		{
			escreva ("Você ainda é muito novo(a)")
		}

		senao se (idade >= 5 e idade <=7)
		{
			escreva ("A sua categoria será a Infantil A " )
					
		}
		senao se (idade >=8 e idade <=11)
		{
			escreva ("A sua categoria será a Infantil B " )
		}
		senao se (idade >=12 e idade <=13)
		{
			escreva ("A sua categoria será a Juvenil A " )
		}
		senao se (idade >=14 e idade <=17)
		{
			escreva ("A sua categoria será a Juvenil B " )
		}
		senao
		{
			escreva ("Você pertence a categoria de Adultos" )
		}

	

		
}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */