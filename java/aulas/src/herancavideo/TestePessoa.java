package herancavideo;

import entidades.Funcionario;

public class TestePessoa {

	public static void main(String[] args) 
	{
		Pessoa victor = new Pessoa("Jessica", 555);
		Funcionario1 pedro = new Funcionario1 ("pedro", 222,"TI");
		Pessoa maria = new Funcionario1("Maria", 444,"Informatica");
		Pessoa jose = new Coordenador("Jose", 469, "CC");
		
		System.out.println(victor.getMatricula());
		System.out.println(pedro.getDepartamento());
		System.out.println(maria.getMatricula());
		System.out.println(jose.getNome());
	
	}

}
