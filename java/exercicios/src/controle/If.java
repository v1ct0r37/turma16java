package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Informe a m�dia: ");
		double media = ler.nextDouble();

		if (media >= 7.0) {
			System.out.println("Aprovado!");
		}

		if(media >= 4.5 && media < 7.0 ) {
			System.out.println("Est� em recuperacao");
		}
		
		if(media >= 0 && media < 4.5) {
			System.out.println("Est� reprovado");
		}
		
		ler.close();
	}
}
