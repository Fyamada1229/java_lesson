package Main;


public class Main {
	
	public static void main(String[] arge) {
		Hero h1 = new Hero();
		System.out.println(h1.money);
		
		
		Hero.setRandomMoney();
		System.out.println(Hero.money);
		
	}
}
