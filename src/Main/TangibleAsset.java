package Main;

//抽象クラス
public abstract class TangibleAsset extends Asset implements Thing{
	private String color;
	private double weight;
	
	
	//コンストラクター
	public TangibleAsset(String name, int price, String color) {
		super(name, price);
		this.color = this.color;
	}
	//ゲッター
	public String Color() {return this.color;}
	public double getWeight() {return this.getWeight();}
	public void etWeight(double weight) {this.weight = weight;}
}
