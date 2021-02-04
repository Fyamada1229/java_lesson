package Car;

public class SportsCar implements Car {
	
	@Override
	public void stop() {
		System.out.println("停止する");
	}
	@Override
	public void run() {
		System.out.println("走る");
	}
	@Override
	public void type() {
		System.out.println("スポーツカー");
	}

}
