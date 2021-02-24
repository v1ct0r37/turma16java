
public class AreaCirc {

	// o valor de Pi esta associado diretamente a classe
	double raio;
	final static double PI = 3.14;

	AreaCirc(double raioInicial) {
		raio = raioInicial;

	}

	double area() {
		return PI * Math.pow(raio, 2);
	}
	// metodo como static
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
		
	}
}
