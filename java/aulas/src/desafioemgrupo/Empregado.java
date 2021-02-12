package desafioemgrupo;

public class Empregado {
	//Atributos
	
	private String nome;
	private int matricula;
	private int horas;
	private double valorHora;
	
	//Construtores
	public Empregado(String nome, int matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}
	//Sobrecarga do construtor
	public Empregado(String nome, int matricula, int horas, double valorHora) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.horas = horas;
		this.valorHora = valorHora;
	}
	
	//Seguran�a - Encapsulamento / Getters and Setters
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	//Metodo
	public double salario()
	{
		
		return (this.horas*this.valorHora);
		
	}
	
}
