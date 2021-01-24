package Main;

public class Wand {
	private String name;
	private double power;
	
	public String getName() {return this.name;}
	public void setName(String name) {
		if (name == null || name.length() <= 3) {
			throw new IllegalArgumentException
			("杖に設定しようとしている名前が異常です。");
		}
		this.name = name;
	}
	public double getPower() {return this.power;}
	public void setPower(double power) {
		if (power < 0.5 || power > 100) {
			throw new IllegalAccessError
			("杖に設定されようとしている魔力は異常になっています");
		}
		this.power = power;
	}	
}