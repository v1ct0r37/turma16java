package exemgrupo;

import java.util.Locale;
import java.util.Scanner;

public class ExTriangulo 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US); //define o tipo de padronização
		//area = base * altura / 2
		Scanner leia = new Scanner(System.in);//instaciar = criar
		double base1, base2, base3=0.0, altura1=0.0, altura2=0.0, altura3=0.0, area=0.0, maiorArea = 0.0;
		
		for (int x=0; x<3; x++)
			{	
			System.out.printf("\nDigite a base de 3 triangulos: ");
			base1 = leia.nextDouble();
			base2 = leia.nextDouble();
			base3 = leia.nextDouble();
			System.out.println("Digite a altura de 3 triangulos: ");
			altura1 = leia.nextDouble();
			altura2 = leia.nextDouble();
			altura3 = leia.nextDouble();
		
			area = ((base1 * altura1) / 2 );
			area = ((base2 * altura2) / 2 );
			area = ((base3 * altura3) / 2 );
			}
		if (area > maiorArea)
		{
			maiorArea = area;
		}
		System.out.printf("A area do triangulo informado é %.2f", area);

	}

}
