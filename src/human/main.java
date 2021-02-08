package human;

public class main {

	public static void main(String[] args) {
		Human h = new Human();
		h.setName("山田大");
		h.setAge(31);
		System.out.println("Humanクラスになります");
		h.speak();
		
		System.out.println("Studentクラスになります");
		Student s = new Student();
		s.setName("本田隼人");
		s.setAge(52);
		s.speak();
		
		Human h1 = h;
		Human h2 = s;
		
		System.out.println("親クラスのspeakメソッドを実行する");
		h1.speak();
		System.out.println("子クラスのspeakメソッドを実行する");
		h2.speak();
	}

}
