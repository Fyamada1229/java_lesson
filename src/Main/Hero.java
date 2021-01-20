package Main;

public class Hero {
	
	int hp;
	String name;
	Sword sword;
	
	void attack() {
		System.out.println(this.name +"攻撃をした!");	
		System.out.println("敵に５ポイントのダメージを与えて!");
	}
	Hero(String name) {
		this.hp = 100;
		this.name = name;
	}
	Hero (){
		this("ダミー");
	}
	
	
	
	
}
