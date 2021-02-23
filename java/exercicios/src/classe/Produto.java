package classe;

public class Produto {

	// essas variaveis pertencem ao objeto
	String nome;
	double preco;
	double desconto;

	 // contrutor padrao explicito - vai me deixar criar um objeto sem a obrigatoriedade de nada
		Produto() {
			
		}
	
	// construtor -  a variavel nome irá receber o nomeInicial do construtor para salvar no atributo nome
	// criacao do construtor serve para obrigar na criacao do objeto a inserer o "nomeInicial"
	Produto(String nomeInicial, double precoInicial, double descontoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}
	
	// metodo de desconto
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
}
