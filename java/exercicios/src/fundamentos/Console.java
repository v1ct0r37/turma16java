package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print("Dia");
		
		System.out.println("Bom");
		System.out.println(" dia");
		
		System.out.printf("Megasena: %d %d %d %d %d %d" , 1, 2, 3, 4, 5, 6);
		
		System.out.printf("Sálario: %.1f", 1234.5678);
		
		//int a = 3;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("\nDigite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu Sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf(" %s %s tem %d anos", nome, sobrenome, idade);
		
		entrada.close(); //Quando finalizar um Scanner utilizar - para não consumir memoria da maquina.
	}
}
