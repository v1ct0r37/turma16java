package ExercicioAulas;

import java.util.Scanner;

public class ParOuImparRaizQuadrada {


	public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);
	
	int numero;
	
	System.out.print("Digite um numero: ");
	numero = ler.nextInt();
	
	if(numero <=0 ) {
		System.out.print("Numero invalido, menor ou igual a 0");
	}
	else if(numero % 2 == 1)
	{
		System.out.printf("O numero � impar � elevado ao quadrado � %.2f", Math.pow(numero, 2));
	}
	else
	{
		System.out.printf("O numero � par e sua raiz quadrada � %.2f", Math.sqrt(numero));
	}
}
}