package classe;

public class Data {

	// atributos
	// dia
	// mes
	//ano
	
	int dia;
	int mes;
	int ano;
	
	// criar 2 construtores
	// o padrao
	// que vai receber dia, mes e ano
	// quando chamado o construtor padrao o dia seja 01/01/1970
	
	// contrutor padrao
	Data(){
		dia = 01;
		mes = 01;
		ano = 1970;
	}
	
	Data(int diaInicial, int mesInicial, int anoInicial ){
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
		
	}
	
	// metodo
	
	String obterDataFormatada(){
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
