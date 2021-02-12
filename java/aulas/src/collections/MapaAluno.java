package collections;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapaAluno {
	public static void main(String[] args)
	{
		Map<String, Aluno> mapa = new TreeMap<String, Aluno>();
		
		Aluno a = new Aluno("Joao da Silva","Java", 6.8);
		Aluno b = new Aluno("jessica da Silva","Java", 9.8);
		Aluno c = new Aluno("Carlos Almeida","Html", 2.9);
		Aluno d = new Aluno("Marcela Santos","Java", 10);
		
		mapa.put("Joao da Silva", a);
		mapa.put("jessica da Silva",b);
		mapa.put("Carlos Almeida",c);
		mapa.put("Marcela Santos",d);
		
		System.out.println(mapa);
		System.out.println(mapa.get("Carlos Almeida"));
		
		Collection<Aluno> alunos = mapa.values();
		
		for(Aluno e : alunos)
		{
			System.out.println(e);
		}
		
	}
}
