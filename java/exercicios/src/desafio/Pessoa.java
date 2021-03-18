package desafio;

public class Pessoa {

	String nome;
	double peso;

	public Pessoa(String nome, double peso) {
		super();
		this.nome = nome;
		this.peso = peso;

	}

	void comer(Comida comida) {
		if(comida != null) {
			this.peso += comida.pesoComida;
		}
	}
	
	String apresentar() {
		return "Olá sou o " + nome + " e tenho " + peso + "Kg";
	}
}
