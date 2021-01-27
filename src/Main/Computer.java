package Main;

public class Computer extends TangibleAsset {
	// このクラスから追加されたクラス
	private String makerNameString;
	
	//コンストラクター
	public Computer(String name, int price, String color, String makerString) {
		super(name, price, color);
		this.makerNameString = makerString;
	}
	//getterメソッド
	public String makeString() {return this.makerNameString;}
}
