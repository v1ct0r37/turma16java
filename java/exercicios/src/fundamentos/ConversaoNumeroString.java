package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {

		Integer num1 = 10000;
		// usei o length para contar os caracteres, 
		//já que converti int para String
		System.out.println(num1.toString().length()); 
		 				// ou
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
		
	}

}
