package main;

public class Main {

	public static void main(String[] args) {
		
		Car car = new Car();
		int speed = car.getSpeed();
		System.out.println("現在の速度は" + speed + "kmです");
		
		car.yabai();
		
		speed = car.getSpeed();
		System.out.println("現在の速度は" + speed + "kmです");
		
		//スピードメイター メソッド
		car.getKeisan();
		
		car.brake();
		
		speed = car.getSpeed();
		System.out.println("現在の速度は" + speed + "kmです");
		car.getKeisan();
	}

}
