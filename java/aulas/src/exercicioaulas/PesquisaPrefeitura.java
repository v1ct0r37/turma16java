package exercicioaulas;

import java.util.Scanner;

public class PesquisaPrefeitura {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		final int habitantes = 2;
		double salario=0.00, mediaSalarios=0.00, mediaFilhos=0.00, maiorSalario=0.00, percentualSalario100=0.00;
		double totalSalarios=0.00, contadorValor100=0.00;
		int numeroFilhos=0, totalFilhos=0;
		
		for (int giro=1; giro<=habitantes; giro++)
		{
			System.out.printf("Digite o salario do habitante " +giro+ ":");
			salario = ler.nextFloat();
			System.out.printf("Digite o numero de filhos deste habitante: ");
			numeroFilhos = ler.nextInt();
			
			//Processamentos
			
			totalSalarios = totalSalarios + salario;
			totalFilhos = totalFilhos + numeroFilhos;
			
			if(salario > maiorSalario)
			{
				maiorSalario = salario;
			}
			if(salario <= 100.00)
			{
				///contadorValor100 = contadorValor100 + 1
				//contadorValor100 += 1
				contadorValor100++;
			}
						
		}
		mediaSalarios = totalSalarios / habitantes;
		mediaFilhos = totalFilhos / habitantes;
		percentualSalario100 = ((contadorValor100 / habitantes)*100);
		
		System.out.println("Media Salarial: R$"+mediaSalarios);
		System.out.println("Media de filhos baseado no total de " +totalFilhos+ " é igual a "+mediaFilhos);		
		System.out.println("O maior salario informado foi: "+maiorSalario);
		System.out.println("Numero de pessoas que ganham ate 100R$ = " +contadorValor100+ " Sendo um percentual de: "+percentualSalario100);



	}

}
