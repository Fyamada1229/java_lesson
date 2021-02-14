package workcar;

public class Truck implements Car {

	public void accele() {
		System.out.println("50キロで走ります");
	}

	public void brake(){
		System.out.println("停止します");
	}
	
	public void automaticOperation() {
		System.out.println("自動運転します");
	}

}
