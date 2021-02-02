package main;

public class Hellojava {

	public static void main(String[] args) {
		
		
		int [] ary = {10,20,30,44,55,101};
		
		for (int i: ary) {
			if(( i % 2 )==0) {
				System.out.println("配列の値は" + i);
			} else {
				System.out.println("奇数です" + i);
			}
		}
		
		
		
		
		}		
		
}
