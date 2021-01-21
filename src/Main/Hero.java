package Main;

public class Hero {
	
	int hp;
	String name;
	static int money;
	Sword sword;
	
	void attack() {
		System.out.println(this.name +"攻撃をした!");	
		System.out.println("敵に５ポイントのダメージを与えて!");
	}
	static void setRandomMoney() {
		Hero.money = (int) (Math.random() * 1000);
	}
	
}
