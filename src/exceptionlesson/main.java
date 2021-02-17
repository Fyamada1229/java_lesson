package exceptionlesson;

public class main {

	public static void main(String[] args) {

		try {
			//コマンドライン引数を読み込み
			System.out.println("コマンドライン引数を読み込み");
			String arg0 = args[0];
			//整数xに変換
			System.out.println("整数xに変換");
			int x = Integer.parseInt(arg0);
			//割り算を実行
			System.out.println("割り算を実行");
			int y = 1000 / x;
			System.out.println("1000/x = " + y);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsExceptionが発生");
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatExceptionが発生");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticExceptionが発生");
		} finally {
			System.out.println("finally節を実行");
		}
		System.out.println("実行終了！");
	}

}
