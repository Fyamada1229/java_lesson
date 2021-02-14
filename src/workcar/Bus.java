package workcar;

public class Bus implements Car{
	
	public void accele() {
		System.out.println("60キロで走行します");
	}

	public void brake() {
		System.out.println("停止します");
	}
	
	public void automaticOperation() {
		System.out.println("自動運転します");
	}
}
