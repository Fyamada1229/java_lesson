package main;

public class Student3 {
	
	//カプセル化する privateをつける
	private String name;
	private int age;
	private int grade;
	private int rank;
	
	//コンストラクター 
	public Student3(String name, int age, int grade, int rank) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.rank = rank;
	}
	//アクセスメソッド （カプセル化した内容にアクセスする為)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAeg() {
		return age;
	}
	public void setAeg(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			System.out.println("マイナスになっています");
		}
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	void introduction() {
		System.out.println("私の名前は" + name + "です");
		System.out.println("私の年齢は" + age + "です");
		System.out.println("私の学年は" + grade + "です");
		System.out.println("私のランクは" + rank + "です");
	}
	void ageCalculation() {
		age = age + 1;
		System.out.println("私は" + age + "歳になりました");
	}

}
