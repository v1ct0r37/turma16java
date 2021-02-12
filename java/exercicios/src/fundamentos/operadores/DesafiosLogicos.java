package fundamentos.operadores;


public class DesafiosLogicos {

	public static void main(String[] args) {
		//trabalho na terca  (V ou F)
		//trabalho na quinta (V ou F)
		// os dois = tv 50 e tomar sorvete
		// nenhum dos dois = ficar em casa
		
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		
		System.out.println("Comprou TV 50\"? " + comprouTV50);
		System.out.println("Comprou TV 32\"? " + comprouTV32);
		
	}
}
