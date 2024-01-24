package sample;

//1〜10までに偶数が何個あるか、また偶数の合計は幾つになるか表示させる
public class Practice2 {
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				count++;
				sum += i;
			}
		}
		System.out.println("偶数の個数" + count);
		System.out.println("偶数の合計" + sum);
	}
}
