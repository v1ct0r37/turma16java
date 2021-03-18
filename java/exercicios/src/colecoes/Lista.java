package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		// ou
		lista.add(new Usuario("Victor"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		// pegar um valor do indice 3
		System.out.println(lista.get(3).nome);
		
		// remover algum item da lista
		lista.remove(2);
		lista.remove(new Usuario("Manu"));
		
		// percorrer o array para mostrar os nomes dos usuarios
		for(Usuario u: lista) {
			System.out.println(u.toString());
		}
		
	}
}
