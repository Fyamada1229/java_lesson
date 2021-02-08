package lesson10;

import java.util.ArrayList;

public class main {
	
	public static void main(String[] args) {
		
		Human h1 = new Human("山田", 31);
		Human h2 = new Human("本田", 52);
		Human h3 = new Human("山本", 24);
		
		ArrayList<Human> list = new ArrayList<Human>();
		list.add(h1);
		list.add(h2);
		list.add(h3);
		
		for (int i = 0; i < list.size(); i++) {
			list.get(i).introduction();
		}
		
	}

}
