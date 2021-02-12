package fundamentos;

import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		// byte
		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt("10000"); // int
		Long l = 100000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i);
		
		Float f = 123.10f;
		System.out.println(f);
		
		Double d = 123.5678;
		System.out.println(d);

		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		
		Character c = '#'; // char
		
		System.out.println(c + "...");

	}

}
