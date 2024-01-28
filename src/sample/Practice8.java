package sample;

//1〜10までに奇数が何個あるか、また奇数の合計は幾つになるか表示させる
public class Practice8 {
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				count++;
				sum += i;
			}
		}
		System.out.println(count);
		System.out.println(sum);
	}
}
