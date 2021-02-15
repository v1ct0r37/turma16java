package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 5.0;
		String resultado = media >= 7.0 ? "Aprovado" : "Recuperacao";
		// ? = questiona -> (verdadeiro) = aprovado : recuperacao (falso)
		String resultadoRecuperacao = media >= 5.0 ? "Em recuperacao" : "Reprovado";
		System.out.println("O aluno esta " + resultado);
		
	}
}
