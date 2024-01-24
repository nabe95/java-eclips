package sample;

//1~10までの数字のうち偶数のみを昇順で表示する
public class Practice1 {
	public static void main(String[] args) {
		System.out.println("偶数のみ昇順");

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
