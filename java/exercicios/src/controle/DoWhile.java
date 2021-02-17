package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Você precisa falar as palavras magicas...");
			System.out.println("Quer sair?");
			texto = ler.nextLine();
		} while(!texto.equalsIgnoreCase("Por favor"));
		
		System.out.println("Obrigado");
		ler.close();
		
	}
}
