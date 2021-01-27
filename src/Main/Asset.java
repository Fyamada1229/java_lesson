package Main;


public abstract class Asset {
	private String name;
	private int price;


	//コンストラクター メソッドの初期値
	public Asset(String name, int price) {
		this.name = name;
		this.price = price;
	}
	//ゲッター
	public String getName() {return this.name;}
	public int getPrice() {return this.price;}
	
}
