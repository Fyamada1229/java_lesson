package Main;

public class Wizard extends Character{
	int mp;
	
	public void attack (Matango m) {
		System.out.println(this.name + "攻撃をする");
		System.out.println("敵に３ポイントのダメージ");
		m.hp -= 3;
	}
	public void fireball(Matango m) {
		System.out.println(this.name + "火の玉を放った");
		System.out.println("相手に30ポイントのダメージを与えました");
		m.hp -= 20;
		this.mp -= 5; 
	}
}