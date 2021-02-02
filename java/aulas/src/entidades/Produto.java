package entidades;

public class Produto
{
	public String descricao;
	public String codigo;
	public double valorUnitario;
	public Produto(String descricao, String codigo, double valorUnitario) 
	{
		super();
		this.descricao = descricao;
		this.codigo = codigo;
		this.valorUnitario = valorUnitario;
	}
	public Produto(String codigo) {
		super();
		this.codigo = codigo;
	}
	
	
	
	
	
	
}
