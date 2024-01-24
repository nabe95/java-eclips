package sample;

public class Practice7 {
	public static void main(String[] args) {
		String[] fruits = { "りんご", "いちご", "ばなな", "もも", "さくらんぼ"};
		System.out.print("パフェに");
		for (int x = 0; x < 5; x++) {
			System.out.print(fruits[x]);
			if (x < 4) {
				System.out.print(", ");
			}
		}
		System.out.print("を乗せる");
	}
}
