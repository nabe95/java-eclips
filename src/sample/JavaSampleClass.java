package sample;

public class JavaSampleClass {
	//1〜10までの数字のうち偶数のみを昇順で表示させる
	public static void main(String[] args) {
		System.out.println("偶数の昇順");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}