package entidades;

public class Pessoa 
{
	//atributos
	public String nome;
	public int anoNascimento;
	public char genero;
	
	public int idade()
	{
		return 2021 - anoNascimento;
	}
	
	public String statusIdade()
	{
		int idade;
		String mensagem;
		idade = 2021 - anoNascimento;
		if (idade < 18)
		{
			mensagem = "ATEN��O - VOC� N�O PODE COMPRAR REVISTA PORNOGRAFICA";
			
		}
		else
		{
			mensagem = "Todo nosso conte�do est� disponivel para voc�";
		}
		return mensagem;
		
				
	}
		public String pronome()
		{
			char sexo = 'M' ;
			String mensagem;
			if (sexo =='M')
			{
				mensagem = "Ol� Sr. ";
			}
			else
			{
				mensagem = "Ol� Sra. ";
			}
			return mensagem;
			
		}
		
}
