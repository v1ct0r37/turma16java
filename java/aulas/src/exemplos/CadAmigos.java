package exemplos;

import java.util.Scanner;

import entidades.Pessoa;

public class CadAmigos 
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		
		Pessoa brother1 = new Pessoa();
		
		System.out.println("Digite o nome: ");
		brother1.nome = ler.next();
		System.out.println("Digite M - Masculino ou F - Feminino");
		brother1.genero = ler.next().toUpperCase().charAt(0);
		System.out.println("Digite o ano de nascimento [aaaa]: ");
		brother1.anoNascimento = ler.nextInt();
		
		System.out.printf("Oi %s sua idade aproximada é: %d", brother1.nome, brother1.idade());
		
		
	}
}
