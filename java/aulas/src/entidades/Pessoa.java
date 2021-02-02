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
			mensagem = "ATENÇÃO - VOCÊ NÃO PODE COMPRAR REVISTA PORNOGRAFICA";
			
		}
		else
		{
			mensagem = "Todo nosso conteúdo está disponivel para você";
		}
		return mensagem;
		
				
	}
		public String pronome()
		{
			char sexo = 'M' ;
			String mensagem;
			if (sexo =='M')
			{
				mensagem = "Olá Sr. ";
			}
			else
			{
				mensagem = "Olá Sra. ";
			}
			return mensagem;
			
		}
		
}
