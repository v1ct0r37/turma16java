package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {

		String faixa = "vermelha";

		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bssai - dai...");
		case "marrom":
			System.out.println("Sei o takki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei oo Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
	//	default:
	//		System.out.println("Nãoo sei nada");
		}
	}
}
