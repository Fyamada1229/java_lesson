package main;

public class Studen {
	
	private String name;
	private int age;
	private int grade;
	private int rank;
	private String address;
	
	//コンストラクター 初期値の設定
	public Studen(String name, int age, int grade, int rank) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.rank = rank;
	}
	//アクセスメソッド
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
		this.age = age;
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
	//住所設定メソッド
	public String getAddress() {
		return address;
	}
	//住所取得メソッド
	public void setAddress(String address) {
		this.address = address;
	}
	
	void introduction() {
		System.out.println("私の名前は" + name + "です");
		System.out.println("私の年齢は" + age + "です");
		System.out.println("私の学年は" + grade + "です");
		System.out.println("私の成績は" + rank + "です");
	}
	
	void ageCalculation() {
		age = age + 1;
		System.out.println("私は" + age + "歳になりました");
	}
	
	void setNames(String lastName, String firstName) {
		name = lastName + firstName;
	}
	
	void setNameAndAge(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	//文字列の配列を返す
	String[] memorize(String one, String two, String three) {
		String [] memory = new String[3];
		memory[0] = one;
		memory[1] = two;
		memory[2] = three;
		return memory;
	}
	//オーバーロード
	String[] memorize(String one, String two, String three, String four) {
		String [] memory = new String[4];
		memory[0] = one;
		memory[1] = two;
		memory[2] = three;
		memory[3] = four;
		return memory;
	}
	//int型の引数を必要とし、戻り値をStringで返す
	static String createMessage(int number) {
		String message = "番号は" + number + "番です";
		return message;
	}

}
