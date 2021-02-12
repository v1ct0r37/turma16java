package encapsulamento;

public class Cachorro extends Animal
{
	String raca;
	
	public Cachorro(String nome, String raca, double peso) {
		super(nome, peso);
		
		this.raca = raca;
	}
	
	public void latir()
	{
		System.out.println("Cachorro está latindo");
	}

}
