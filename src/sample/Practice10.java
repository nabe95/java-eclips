package sample;

public class Practice10 {
	public static void main(String[] args) {
		int max = 5;
		String mark = "*";
		
		for (int i = 0; i < max; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(mark);
			}
			System.out.println();
		}
	}
}