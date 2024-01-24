package sample;

//1〜10までの整数をカンマ区切りで降順で表示させる（1にはカンマをつけない）
public class Practice5 {
	public static void main(String[] args) {
		for (int i = 10; i > 0; i--) {
			System.out.print(i);
			if (i > 1) {
				System.out.print(", ");
			}
		}
	}
}
