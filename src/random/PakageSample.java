package random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


public class PakageSample {
	
	public static void main(String[] args) {
			
		//乱数
		Random random = new Random();
		System.out.println("乱数の数字");
		System.out.println(random.nextInt());
		
		//乱数の格納
		//10個の乱数を格納する配列(リスト)
		//ArrayListライブラリです
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i< 10; i++) {
			list.add(random.nextInt());
		}
		
		System.out.println("配列に格納した乱数を表示");
		for (int i: list) {
			System.out.println(i);
		}
		
		System.out.println("================");
		
		ArrayList<String> stringlist = new ArrayList<String>();
		
		stringlist.add("ABC");
		stringlist.add("EDF");
		stringlist.add("GHI");
		
		System.out.println("文字列のリスト");
		for (int i =0; i < stringlist.size(); i++) {
			System.out.println(stringlist.get(i));
		}
		
		System.out.println("ここからIntegerになります");
		ArrayList<Integer> integerlist = new ArrayList<Integer>();
		
		integerlist.add(10);
		integerlist.add(13);
		integerlist.add(18);
		integerlist.add(111);
		
		for (int i = 0; i < integerlist.size(); i++ ) {
			System.out.println(integerlist.get(i));
		}
		
		ArrayList<String> nameStrings = new ArrayList<String>();
		nameStrings.add("yamada");
		nameStrings.add("futoshi");
		
		
		String yamada = nameStrings.get(0);
		String futoshi = nameStrings.get(1);
		
		String full_name = yamada+" "+futoshi;
		System.out.println(full_name);
		
		
		System.out.println("HashMapの使い方ここから");
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("Name1","Yamada");
		map.put("Name2", "http://schoo.jp/class/6660/room");
		
		for (int i =0; i <= map.size(); i++) {
			System.out.println(map.get("Name" + i));
		}
		
		System.out.println("HashMap Integrの使い方ここから");
		HashMap<String, Integer> intmap = new HashMap<String,Integer>();
		
		intmap.put("value1",100);
		intmap.put("value2", 10);
		intmap.put("value3", 30);
		
		System.out.println(intmap.isEmpty("value1"));
		for (int i = 0; i <= intmap.size(); i++) {
			System.out.println(intmap.get("value" + i));
			
		}
		
		
		
		
		
		
		
		
	}

}
