package workcar;

public class Derver {

	public static void main(String[] args) {
		Truck t = new Truck();
		SportCar s = new SportCar();
		Bus b = new Bus();

		Derver d = new Derver();
		d.drive(t);
		d.drive(s);
		d.drive(b);

	}

	//Carインタフェースを実装しているクラスはなんでも受け入れなれる
	public void drive(Car car) {
		car.accele();
		car.brake();
		car.automaticOperation();
	}

}
