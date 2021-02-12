package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(0)); // (charAt)qual é o indice na posicao(0) = O
	
		String s = "Booa tarde";
		String nome = "Victor";
		String sobrenome = "ARAUJO";
		System.out.println(s.concat("!!!"));
		System.out.println(s.startsWith("Boa")); // inicie com
		System.out.println(s.length());// trazer a quantidade caracter
		System.out.println(s.endsWith("tarde"));// finaliza com
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));// ira ignorar se a letra é maiuscula ou minuscula
		
		System.out.printf("Nome: %s %s", nome, sobrenome); // concatenacao
	}
}
