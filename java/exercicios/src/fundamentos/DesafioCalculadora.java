package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// ler o num1
		// ler o num2
		// + - * / %
		Scanner ler = new Scanner(System.in);
		
		double num1, num2;
		String operacao;
		Double resultado;
		System.out.println("Digite o 1° numero: ");
		num1 = ler.nextDouble();
		System.out.println("Qual operação voce que fazer?(*,-,*,/,% ");
		operacao = ler.next();
		System.out.println("Digite o 2° numero: ");
		num2 = ler.nextDouble();
		
		resultado = "+".equals(operacao) ? num1 + num2 : 0;
		resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		resultado = "%".equals(operacao) ? num1 % num2 : resultado;
		
				
		System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
		
		
		ler.close();
		
		
	}
}
