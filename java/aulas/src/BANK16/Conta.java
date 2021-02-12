package BANK16;

public class Conta1 
{
	private String numeroConta;
	private String cpf;
	private double saldo;
	
	public Conta1(String numeroConta, String cpf, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.cpf = cpf;
		this.saldo = saldo;
	}

	public Conta1(String numeroConta, String cpf) {
		super();
		this.numeroConta = numeroConta;
		this.cpf = cpf;
	}
	
	
	
	
	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void debitar(double valor)
	{
		double res;
		res = valor - saldo;
		if (res >= 0)
		{
			saldo = res;
			System.out.printf("Saldo atual = R$ %2.f", saldo);
		}
		else
		{
			System.out.printf("Nãoo é possivel debitar pois seu saldo atual é = R$ %2.f");
		}
	}
	public void creditar(double valor)
	{
		saldo = valor + saldo;
	}
	

	
	
	
}
