package lesson10;

public class Human {
	private String name;
	private int age;
	
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void introduction() {
		System.out.println("私の名前は" + name + "です");
		System.out.println("私の年齢は" + age + "です");
	}
	
	void boxer() {
		int panti = 80 * 20;
		System.out.println("私のパンチは80キロの人の30倍です" + panti+ "kg");
	}
	

}
