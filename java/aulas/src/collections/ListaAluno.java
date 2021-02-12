package collections;

import java.util.HashSet;
import java.util.Set;

public class ListaAluno 
{
	public static void main(String[] args)
	{
		Set<Aluno> conjunto = new HashSet<Aluno>();
		Aluno a = new Aluno("Joao da Silva","Java", 6.8);
		Aluno b = new Aluno("jessica da Silva","Java", 9.8);
		Aluno c = new Aluno("Carlos Almeida","Html", 2.9);
		Aluno d = new Aluno("Marcela Santos","Java", 10);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		
		System.out.println(conjunto);

	}
}
