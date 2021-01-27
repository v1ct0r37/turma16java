programa
{
	
	funcao inicio()
	{
		//Objetivo: A prefeitura de uma cidade fez uma pesquisa entre 20 
		//de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
			//a) média do salário da população; 
			//b) média do número de filhos; 
			//c) maior salário; 
			//d) percentual de pessoas com salário até R$100,00.
		//inicio
		//variaveis
		real salario = 0.00
		inteiro numeroFilhos = 0
		real mediaSalarios = 0.00
		real mediaFilhos = 0.00
		real maiorSalario = 0.00
		real percentualSalario100 = 0.00
		const inteiro habitantes = 5
		real totalSalarios = 0.00
		real totalFilhos = 0.00
		real contadorValor100 = 0.00
		//Entradas
		para (inteiro giro=1; giro<=habitantes; giro++)
		{
			//entradas
			escreva("Digite o salario do habitante: ")
			leia(salario)
			escreva("Digite o numero de filhos deste habitante: ")
			leia(numeroFilhos)
			//processamentos
			totalSalarios = totalSalarios + salario //totalizar o salario
			mediaSalarios = totalSalarios / habitantes
			totalFilhos = totalFilhos + numeroFilhos
			mediaFilhos = totalFilhos / habitantes
			percentualSalario100 = (contadorValor100 / 20)* 100.00

			se (salario > maiorSalario)
			{
				maiorSalario = salario
			}
			se (salario <= 100)
			{
				contadorValor100 = contadorValor100 +1
				// contadorValor100++
			}
		}
		//saidas
		escreva("Média salario: ", mediaSalarios,"\n")
		escreva("Media de filhos: ", mediaFilhos,"\n")
		escreva("O maior salario foi: ", maiorSalario,"\n")
		escreva("Numero de Pessoas que ganham até 100 R$ = ", contadorValor100, "com percentual de: ", percentualSalario100, "\n")
		escreva("Obrigado pela Ajuda ")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1672; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */