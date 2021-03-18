package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		//LinkedList � um metodo de fila
		Queue<String> fila = new LinkedList<>();
		
		// offer e add -> adicionam elementos na fila
		// a diferenca � o comportamento ocorre quando a fila esta cheia
		fila.add("Ana"); // retorna false
		fila.offer("Bia"); // lan�a uma excecao
		fila.add("Carlos");
		fila.add("Rafaela");
		
		
		// a diferenca � o comportamento ocorre quando a fila esta vazia
		// pegar um elemento da fila
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.element()); // lan�a uma excecao
		
		// fila.size()
		// fila.clear()
		// fila.isEmpty()
		// fila.poll()
	}
}
