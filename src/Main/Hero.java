package Main;

public class Hero {
	
	int hp;
	String name;
	Sword sword;
	static int money;
	
	void bye() {
		System.out.println("勇者は別れを告げた");
	}
	void die() {
		System.out.println(this.name + "は死んでしまった!");
		System.out.println("GAME OVERです");
	}
	void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は眠って回復した！");
	}
	void attack(Matango m) {
		System.out.println(this.name +"攻撃をした!");	
		System.out.println("敵に５ポイントのダメージを与えて!");
		System.out.println("お化けキノコ" + m + "から２ポイントの反撃を受けた");
		
		this.hp -=2;
		if (this.hp <=0) {
			this.die();
		}
	}
	
	
	static void setRandomMoney() {
		Hero.money = (int) (Math.random() * 1000);
	}
	
}
