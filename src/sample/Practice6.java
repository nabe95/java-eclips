package sample;

//987
//654
//321に並べる

public class Practice6 {
	public static void main(String[] args) {
		for (int i = 9; i >= 1; i--) {
			System.out.print(i);
			if (i % 3 == 1) {
				System.out.println("");
			}
		}
	}
}