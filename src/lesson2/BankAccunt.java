package lesson2;

public class BankAccunt {

	private String bankNumber;
	private String password;
	private String bankCode;

	//コンストラクタ
	public BankAccunt(String bankNumber, String password, String bankCode) {
		this.bankNumber = bankNumber;
		this.bankCode = bankCode;
		this.password = password;
	}

	public void changePassword(String oldPassword, String newPassword) {
		if (this.password.equals(oldPassword)) {
			this.password = newPassword;
			System.out.println("パスワードを変更をしました");
		} else {
			System.out.println("パスワードが違い変更が出来ませんでした");
		}
	}

	public void printInfomation(String password) {
		if (this.password.equals(password)) {
			System.out.println("支店番号は" + bankCode);
			System.out.println("口座番号は" + bankNumber);
		} else if (this.password.equals(null) == this.password.equals(null)) {
			System.out.println("なにも入力されてませんnullです");
		} else {
			System.out.println("パスワードが違います");
		}
	}

}
