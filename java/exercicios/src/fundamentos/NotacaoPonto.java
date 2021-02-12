package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		double a = 2.3;
		String s = "Bom dia X";
		s.toUpperCase(); // ira converter para MAIUSCULO
		s = s.toUpperCase(); // irá mostrar em Maiusculo
		s.replace("X", "Senhora"); // Substituiu o "X" por "Senhora "
		s = s.replace("X", "Senhora");
		s.concat("!!!");
		s = s.concat("!!!");
		
		System.out.println(s);
	}
}
