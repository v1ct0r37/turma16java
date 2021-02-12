package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {

		double a = 1; // conversao implicita
		System.out.println(a);

		float b = 1.0F; // tornar um literal par float assim
		float b1 = (float) 1.54654646; // conversão explicita (CAST)
		System.out.println(b1);

		int c = 4;
		byte d = (byte) c; // conversão explicita (CAST)
		System.out.println(d);

		double e = 1;
		int f = (int) e;
		System.out.println(f);

	}

}
