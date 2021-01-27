package Main;

public class Book extends TangibleAsset{
	// このクラスから追加されたクラス
	private String isbn;
	
	//コンストラクター
	public Book (String name, int price ,String color, String isbn){
		super(name, price, color);
		this.isbn = isbn;
	}
	//getterメソッド
	public String getIsbn() {return this.isbn;}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
