package animal;

public class PersonalComputer implements UniversalSeriaBus {
	@Override
	
	public void energizing() {
		System.out.println("充電します");
		System.out.println("データを転送します");
	}
}
