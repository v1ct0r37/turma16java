package controle;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		String conceito = "";

		System.out.println("Digite a nota: ");
		int nota = ler.nextInt();

		switch (nota) {
		case 10: case 9:
			conceito = "A";
			break;
		case 8: case 7:
			conceito = "B";
			break;
		case 6: case 5:
			conceito = "C";
			break;
		case 4: case 3:
			conceito = "D";
			break;
		case 2: case 1: case 0:
			conceito = "E";
			break;
			default:
				conceito = "Nota errada";

		}

		System.out.println("Conceito é " + conceito);
		ler.close();
	}
}
