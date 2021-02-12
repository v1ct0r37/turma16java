package fundamentos;

import java.util.Scanner;

public class DesafioConversaoStringParaDouble {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		// receber 3 Strings usando next.line
		// recebendo os ultimos 3 salarios do funcionario
		// calcular a media dos salarios
		
		System.out.print("Digite o primeiro salario: ");
		String salario1 = ler.nextLine().replace(",", "."); 
		
		System.out.print("Digite o segundo salario: ");
		String salario2 = ler.nextLine().replace(",", "."); 
		
		System.out.print("Digite o terceiro salario: ");
		String salario3 = ler.nextLine().replace(",", ".");
		
		
		double s1 = Double.parseDouble(salario1);
		double s2 = Double.parseDouble(salario2);
		double s3 = Double.parseDouble(salario3);
		double soma = (s1 + s2 + s3);
		
		
		System.out.printf("\nA soma dos salarios é: %.2f ", soma);
		System.out.printf("\nA media dos salarios é: %.2f ", (soma/3));
		
		ler.close();
		
		

	}

}
