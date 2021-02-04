package animal;

public class Car implements UniversalSeriaBus, Audio {
	@Override
	public void energizing() {
		System.out.println("充電します");
	}
	
	@Override
	public void play() {
		System.out.println("音楽を再生します");
	}
	@Override
	public  void stop() {
		System.out.println("音楽を停止させる");
	}
}
