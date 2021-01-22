package Main;


public class Main {
	
	public static void main(String[] arge) {
		Hero h1 = new Hero();
		Hero.setRandomMoney();
		System.out.println(Hero.money);
		King yamada = new King();
		yamada.talk(h1);
	}
}
