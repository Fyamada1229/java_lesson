package human;

public class Student extends Human {
	
	
	public void speak(){
		System.out.println("私の名前は" + super.getName() + "です");
	}

}
