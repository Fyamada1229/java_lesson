package lesson2;

public class Main {

	public static void main(String[] args) {

		BankAccunt ba = new BankAccunt("川崎", "8745", "1111");

		ba.changePassword("8745", "5155");
		ba.printInfomation("5155");
		ba.printInfomation(null);
		
		
	}

}
