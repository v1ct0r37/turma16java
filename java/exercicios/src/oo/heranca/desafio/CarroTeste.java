package oo.heranca.desafio;

public class CarroTeste {

	public static void main(String[] args) {

		Carro civic = new Civic();

		System.out.println(civic);

		civic.acelerar();

		System.out.println(civic);

		civic.frear();
		civic.frear();
		civic.frear();
		civic.frear();
		civic.frear();
		civic.frear();
		civic.frear();
		civic.frear();

		System.out.println(civic);

		System.out.println();
		Carro ferrari = new Ferrari();

		ferrari.acelerar();

		System.out.println(ferrari);

	}

}
