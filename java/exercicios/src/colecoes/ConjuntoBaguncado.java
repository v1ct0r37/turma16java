package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {

	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet ();
		
		conjunto.add(1.2); // double -> Double (converteu um tipo primitivo para uma Classe)
		conjunto.add(true); // boolean -> Booelan
		conjunto.add("Teste"); // String
		conjunto.add(1); // int -> Integer
		conjunto.add('x'); // char -> caracter
		
		System.out.println("Tamanho é: " + conjunto.size());
		
		System.out.println(conjunto.remove("Teste"));
	}
}
