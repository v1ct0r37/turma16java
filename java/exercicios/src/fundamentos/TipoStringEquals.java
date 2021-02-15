package fundamentos;

public class TipoStringEquals {

	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s = new String("2");
		System.out.println("2" == s); // nao da certo
		System.out.println("2".equals(s)); // equals irá comparar o conteudo
		// next - tira o espaco em branco
		// nextLine nao tira
	}
}
