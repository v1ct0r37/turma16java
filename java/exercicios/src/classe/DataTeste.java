package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data data1 = new Data();
		data1.dia = 07;
		data1.mes = 11;
		data1.ano = 1995;
		
		Data data2 = new Data();
		data2.dia = 10;
		data2.mes = 03;
		data2.ano = 1971;
		
		Data data3 = new Data();
		
		Data data4 = new Data(07, 11 , 1995);
		
			
		System.out.println(data1.obterDataFormatada());
		System.out.println(data2.obterDataFormatada());
		System.out.println(data3.obterDataFormatada());
		System.out.println(data4.obterDataFormatada());
		
		
		
	}
}
