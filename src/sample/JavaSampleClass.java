package sample;

public class JavaSampleClass {
	public static void main(String []args) {
		System.out.println("[数あてゲーム]");
		//０〜９までの整数の中からランダムな数を１つ生成して変数ansに代入する
		int ans = new java.util.Random().nextInt(10);
		//forを用いた５回繰り返するループ
		for (int i = 0; i < 5; i++) {
			System.out.println("０〜９の数字を入力してください");
			//数字を入力し変数numに代入する
			int num = new java.util.Scanner(System.in).nextInt();
			//もし変数numが変数ansと等しかったらアタリと表示され終了
			if (ans == num) {
				System.out.println("アタリ!");
				break;
			} else {
				System.out.println("違います");
			}
		}
		System.out.println("ゲームを終了します");
	}
}