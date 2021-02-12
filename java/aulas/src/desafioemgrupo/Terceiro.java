package desafioemgrupo;

public class Terceiro extends Empregado {
	
	private double acrescimo = 0.1;

	public Terceiro(String nome, int matricula, int horas, double valorHora, double acrescimo2) {
		super(nome, matricula, horas, valorHora);
	
	}
	
	@Override
	public double salario() {
		
		return (getHoras() * ((1 + acrescimo)*getValorHora()));
	}

	public double getAcrescimo() {
		return acrescimo;
	}

	public void setAcrescimo(double acrescimo) {
		this.acrescimo = acrescimo;
	}
	
}