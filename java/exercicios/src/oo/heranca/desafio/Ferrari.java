package oo.heranca.desafio;

public class Ferrari extends Carro {

	Ferrari() {
		super(315);
	}
	
	@Override
	void acelerar() {
		velocidadeAtual += 15;
	}
	
	
	
}
