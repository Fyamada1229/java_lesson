package main;

public class Student4 {
		
		//カプセル化する privateをつける
		private String name;
		private int age;
		private int grade;
		private int rank;
		
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
