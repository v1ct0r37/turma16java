package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		
		Monstro monstro = new Monstro();
		
		monstro.x = 10;
		monstro.y = 10;
		
		Heroi heroi = new Heroi(10, 11);
		
		
		
		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Heroi tem => " +heroi.vida);
		
		monstro.atacar(heroi);
		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Heroi tem => " +heroi.vida);
	}
	
}
