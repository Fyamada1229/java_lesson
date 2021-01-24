package Main;

public class Hero {
	private String name = "ミナト";
	private int hp = 100;
	Sword sword;
	static int money;
	
	// ゲッターメソッドHPを呼び出している。privateの為
	public int getHp() {return this.hp;}
	// セッターメソッドHPを呼び出している。praivateの為
	public void setHp(int hp) {this.hp = this.hp;}
	// ゲッターメソッドで呼び出しをするしている。praivateの為
	public String getName() {return this.name;}
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
	
	public Hero() {
		System.out.println("Heroのコンストラクターが動作しています");
	}
	
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
	
	//攻撃
	public void attack(Matango m){
		System.out.println(this.name + "は，攻撃した！");
		m.hp -= 5;
		System.out.println(this.name + "は，敵に5ポイントのダメージを与えた！");
	}
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	static void setRandomMoney() {
		Hero.money = (int) (Math.random() * 1000);
	}
	
}
