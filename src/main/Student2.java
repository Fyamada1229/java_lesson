package main;

public class Student2 {

	//カプセル化する privateをつける
	private String name = "山田";
	private int age = 31;
	private int grade =2;
	private int rank = 1;
	
	//コンストラクター 初期値
	public Student2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//アクセットメソッド ゲッター 引数なし
	public String getName() {
		return name;
	}
	//セッターは引数あり、引数に型を書く
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;
		} else {
			System.out.println("ーです");
		}
	}
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
