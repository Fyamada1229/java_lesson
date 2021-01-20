package Main;

public class Wizard {
	
	String name;
	String kougke;
	int hp;
	
	void heal(Hero h) {
		h.hp += 10;
		System.out.println(h.name + "のHP１０回復した!");
	}

}
