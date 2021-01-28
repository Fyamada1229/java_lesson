package Main;

public class Hero extends Character {
	
	//攻撃
	public void attack(Matango m){
		System.out.println(this.name + "は，攻撃した！");
		System.out.println(this.name + "は，敵に10ポイントのダメージを与えた！");
		m.hp -= 10;
	}
	public void attack(Slime s) {
		System.out.println(this.name + "の攻撃！");
		System.out.println(this.name + "敵に10ポイントのダメージを与えた!");
		s.hp -= 10;
	}
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
				
}
