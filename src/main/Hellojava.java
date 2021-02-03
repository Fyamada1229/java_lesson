package main;

public class Hellojava {

	public static void main(String[] args) {
		
		Student2 s = new Student2("山田大", 31);
		s.introduction();
		
		s.setName("本田");
		s.setAge(10);
		
		s.introduction();
		}
}
