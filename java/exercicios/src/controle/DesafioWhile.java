package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		// calcular a media de notas de uma turma
		// usuario digitar uma nota valida de 0a 10
		// armazenar essa nota em uma variavel chamada total
		// total armazena a soma das notas
		// outra variavel para saber quantas notas validas foram digitadas
		// para sair digitar -1

		Scanner ler = new Scanner(System.in);
		
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.print("Informe a nota:  (ou -1 p/ sair)");
			nota = ler.nextDouble();
			
			if (nota >= 0 && nota <= 10) {
				total = nota + total; // ou total += nota;
				quantidadeDeNotas++;
			} else if (nota != -1) {
				System.out.println("Nota invalida");
			}
			
		}
			ler.close();
		// calcular a media
		
		double media = total / quantidadeDeNotas;
		System.out.println("Média = " + media);
		
	}
}