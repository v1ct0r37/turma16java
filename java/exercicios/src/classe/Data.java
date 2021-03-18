package classe;

public class Data {

	// atributos
	// dia
	// mes
	// ano

	int dia;
	int mes;
	int ano;

	// criar 2 construtores
	// o padrao
	// que vai receber dia, mes e ano
	// quando chamado o construtor padrao o dia seja 01/01/1970

	// contrutor padrao
	Data() {
		// dia = 01;
		// mes = 01;
		// ano = 1970;
		this(1, 1, 1970); // usar um construtor dentro de outro
	}

	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;

	}
	// sem o This
	// Data(int diaInicial, int mesInicial, int anoInicial ){
	// dia = diaInicial;
	// mes = mesInicial;
	// ano = anoInicial;

//}

	// metodo

	String obterDataFormatada() {
		final String formato = "%d/%d/%d";
		return String.format(formato, dia, mes, ano);
	}
}
