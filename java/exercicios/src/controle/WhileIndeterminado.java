package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		String valor = "";

		while (!valor.equalsIgnoreCase("sair")) {
			System.out.print("Voc� diz: ");
			valor = ler.nextLine();
		}

		ler.close();
	}
}
