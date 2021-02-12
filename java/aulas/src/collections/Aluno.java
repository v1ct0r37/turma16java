package collections;

public class Aluno {
	private String nome;
	private String Curso;
	double Nota;
	public Aluno(String nome, String curso, double nota)
	{
		super();
		this.nome = nome;
		Curso = curso;
		Nota = nota;
	}
	public String toString()
	{
		return this.nome;
	
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return Curso;
	}
	public void setCurso(String curso) {
		Curso = curso;
	}
	public double getNota() {
		return Nota;
	}
	public void setNota(double nota) {
		Nota = nota;
	}

}
