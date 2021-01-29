package Main;

public class Hero extends Character {
	
	String name;
	int hp;
	
	//攻撃
	public void attack(Matango m){
		System.out.println(this.name + "は，攻撃した！");
		System.out.println(this.name + "は，敵に10ポイントのダメージを与えた！");
		m.hp -= 10;
	}
	public void attack(Slime s) {
		System.out.println(this.name + "の攻撃！");
		System.out.println(this.name + "敵に10ポイントのダメージを与えた!");
	}
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	public String toString() {
		return "名前" + this.name + "/HP" + this.name;
	}
	
	public boolean equals(Object o) {
		if (this == o ) {return true;}
		if (o instanceof Hero) {
			Hero h = (Hero) o;
			if (this.name.equals(h.name)) {
				return true;
			}
		}
		return false;
	}
				
}
