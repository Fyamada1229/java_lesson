package lesson10;

import java.util.HashMap;

public class School {
	
	public static void main(String[] arge) {
		
		Human h1 = new Human("山田", 31);
		Human h2 = new Human("本田", 52);
		Human h3 = new Human("山本", 24);
		
		
		HashMap<Integer,Human> map = new HashMap<Integer,Human >();
		map.put(1, h1);
		map.put(2, h2);
		map.put(3, h3);
		map.get(1).introduction();
		map.get(1).boxer();
		
		for(int i = 1; i <= map.size(); i++) {
			map.get(i).introduction();
		}
		
	}

}
