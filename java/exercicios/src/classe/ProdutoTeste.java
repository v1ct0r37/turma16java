package classe;

public class ProdutoTeste {

	// classe para testar o produto que foi criado
	public static void main(String[] args) {
				
		/*  com o constr criado, estou obrigando que meu objeto tenha o nome inicial, preco
		 * e tbm com ele nao preciso colocar os atributos aqui novamente.
		 */
		Produto p1 = new Produto("Notebok", 4200);
		//p1.nome = "Notebok";
		//p1.preco = 4356.89;
		//p1.desconto = 0.25;
		
		// exemplo de uso do construtor padrao, nao obrigando a inserir os itens
		Produto p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		//p2.desconto = 0.29;
		
		System.out.println(p1.nome + " = " + p1.precoComDesconto());
		System.out.println(p2.nome + " = " + p2.precoComDesconto());
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		System.out.printf("media do carrinho = R$%.2f.",mediaCarrinho);
		
		
		
	}
}
