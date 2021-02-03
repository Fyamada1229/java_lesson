package main;

public class Student {
	
	String name = "山田";
	int age = 20;
	int grade = 2;
	int rank = 1;
	
	//自己紹介
	void introduction() {
		System.out.println("私の名前は" + name + "です");
		System.out.println("私の年齢は" + age + "です");
	}
	//年齢計算メソッド
	void ageCalculation() {
		age = age + 1;
		System.out.println("私は" + age + "歳になりました");
	}

}
