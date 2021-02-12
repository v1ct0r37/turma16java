package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// (°F - 32) x 5/9 = °C
		final int ajuste = 32;
		final double FATOR = (5.00/9.00);
		double f = 86;
		double celsius;
		celsius = ((f - ajuste) * FATOR);
		System.out.println("A temperatura em Firenigth: "+f+" em celsius é: "+celsius);
		
	}
}
