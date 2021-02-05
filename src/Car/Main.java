package Car;

public class Main {

	public static void main(String[] args) {
		SportsCar sc = new SportsCar();
		
		int speed = sc.getSpeed();
		System.out.println("現在の速度は" + speed + "です");
		
		sc.accele(100);
		speed = sc.getSpeed();
		System.out.println("現在の速度は" + speed + "です");
		
		sc.speedUp(20);
		speed = sc.getSpeed();
		System.out.println("現在の速度は" + speed + "です");
		
		sc.play();
		
		sc.brake();
		speed = sc.getSpeed();
		System.out.println("現在の速度は" + speed + "です");
		
		sc.accele(100);
		speed = sc.getSpeed();
		System.out.println("現在の速度は" + speed +"です");
	}
}
