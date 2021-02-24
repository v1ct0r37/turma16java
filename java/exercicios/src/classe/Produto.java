package classe;

public class Produto {

	// essas variaveis pertencem ao objeto
	String nome;
	double preco;
	static double desconto = 0.25;

	 // contrutor padrao explicito - vai me deixar criar um objeto sem a obrigatoriedade de nada
		Produto() {
			
		}
	
	// construtor -  a variavel nome irá receber o nomeInicial do construtor para salvar no atributo nome
	// criacao do construtor serve para obrigar na criacao do objeto a inserer o "nomeInicial"
	Produto(String nomeInicial, double precoInicial ) {
		nome = nomeInicial;
		preco = precoInicial;
		
	}
	
	// metodo de desconto
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
}
