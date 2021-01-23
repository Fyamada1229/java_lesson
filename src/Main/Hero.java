package Main;

public class Hero {
	private String name;
	private int hp;
	// ゲッターメソッドで呼び出しをするしている
	public String getName() {
		return this.name;
	}
	//　セッターメソッドで呼び出しをしている
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException
			("名前がnullである。処理を中断。");
		}
		if (name.length() <= 1) {
			throw new IllegalArgumentException
			("名前が短すぎる処理を中断をする");
		}
		if (name.length() >= 8) {
			throw new IllegalArgumentException
			("名前が長過ぎる処理を中断する");
		}
		this.name = name;
	}
	
	Sword sword;
	static int money;
	
	void bye() {
		System.out.println("勇者は別れを告げた");
	}
	private void die() {
		System.out.println(this.name + "は死んでしまった!");
		System.out.println("GAME OVERです");
	}
	void sleep() {
		this.hp = -100;
		System.out.println(this.name + "は眠って回復した！");
	}
	public void attack(Matango m) {
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
