package Main;

public class King {
	void talk(Hero h) {
		System.out.println("王様:ようこそ我がお王国へ、勇者" + h.name + "よ。");
		System.out.println("王様:長旅疲れたであろう。");
		System.out.println("まずは、城下町をみてくると良い。ではまた会おう");
		h.die();
	}

}