package Car;

//クラスの継承が先に書き、インターフェースがあとに書く
public class SportsCar extends Car implements Audio {

	void speedUp(int speed) {
		super.speed = super.speed + speed;
		System.out.println(speed + "加速しました");
	} 
	
	@Override
	public void play() {
		System.out.println("音楽再生する");
	}

}
