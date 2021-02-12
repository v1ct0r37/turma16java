package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecoes {
	

	public static void main(String[] args)
	{
		Collection<String> nomes = new ArrayList();
		nomes.add("Mario");
		nomes.add("Maria");
		nomes.add("Juliana");
		nomes.add("Rafaela");
		
		//Percorrer toda a lista
		for(String name : nomes)
		{
			System.out.println("Lista: "+name);
		}
		//Adc de um arrayList para outro = add.all
		//Collection<String> nomes2 = Arrays.asList("victor","JOana");
		//nomes.addAll(nomes2);
		//Dado especifico dentro da colecao
		//System.out.println("Contém o nome Maria?"+nomes.contains("Maria"));
		//System.out.println("Lista: "+nomes);
		//System.out.println("Lista: "+nomes);

		
		/*System.out.println("Lista de Nomes: "+nomes);
		//Limpa todos os campos
		nomes.clear();
		System.out.println("Lista de Nomes: "+nomes);*/
		
		/*System.out.println("Lista de Nomes: "+nomes);
		//remove um item da lista
		nomes.remove("Mario");
		System.out.println("Lista de Nomes: "+nomes);*/


		//nomes.isEmpty() = se algum item da lista estiver vazia
		/*if(nomes.isEmpty())
		{
			System.out.print("Lista Incompleta");
		}
		else
		{
			System.out.println("Lista de Nomes: "+nomes);

		}*/
	}

}
