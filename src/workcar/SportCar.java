package workcar;

public class SportCar implements Car {

	public void accele() {
		System.out.println("70キロで走行します");
	}

	public void brake() {
		System.out.println("停止します");
	}
	
	public void automaticOperation() {
		System.out.println("自動運転します");
	}

}
