package human;

public class Human {
	
	private String name;
	private int age;
	
	//アクセス ゲットメソッド
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//アクセス セットメソッド
	public int getAeg() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void speak(){
		System.out.println("私の名前は" + name + "です");
		System.out.println("私の年齢は" + age + "歳です");
	}
	

}
