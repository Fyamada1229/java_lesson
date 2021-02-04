package main;

public class Car {
	
	private String type;
	private String color;
	private int enginePower;
	private int speed;
	
	
	String getType(){
		return type;
	}
	void setType(String type) {
		this.type = type;
	}
	String getColor() {
		return color;
	}
	void setColor(String color) {
		this.color = color;
	}
	int getEnginPower() {
		return enginePower;
	}
	void setEnginPower(int enginePower) {
		this.enginePower = enginePower;
	}
	
	
	void accelle(int speed) {
		this.speed = speed;
		System.out.println("時速" + speed + "kmで走行しています");
	}
	void yabai() {
		this.speed = 200;
		System.out.println("超加速装置" + speed + "kmです");
	}
	void brake() {
		this.speed = 0;
		System.out.println("停止する");
	}
	int getSpeed() {
		return speed;
	}

	
	
	public void cars() {
		System.out.println("車種は" + type + "です");
		System.out.println("車の色は" + color + "です");
		System.out.println("車のパワーは" + enginePower + "です");
	}
	public int getKeisan() {
		if (speed == 60) {
			System.out.println("60kmです。法定速度と同じ。");
		}
		else if(speed >=61) {
			System.out.println("法定速度を超えています。減速してください。");
		}
		else if (speed <= 30) {
			System.out.println("30kmです。原付のスピードと同じですね");
		}
		return speed;
	}

}
