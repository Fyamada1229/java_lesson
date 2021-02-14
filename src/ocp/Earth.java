package ocp;

public class Earth {

	public static void main(String[] agrs) {
		Human h = new Human();
		h.setName("人間");
		doSpeak(h);

		Student s = new Student();
		s.setName("学生");
		doSpeak(s);
	}

	// このメソッドはHumanクラスのオブジェクトを引数に取る代わりに
	// 自己紹介機能を実行することを保証します
	public static void doSpeak(Human h) {
		h.speak();
	}

}
