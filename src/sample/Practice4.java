package sample;

//要素数20の配列を宣言し、要素に0から5ずつ加算して代入させる。[0]~[10]の値の奇数のみカンマ区切りで、[11]~[19]の値は偶数をカンマ区切りで表示させる
public class Practice4 {
	public static void main(String []args) {
		//要素数20の配列を宣言
		int[] numbers = new int[20];
		//要素に0から5ずつ加算して代入
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i * 5;
		}
		//[0]~[10]の値の奇数のみカンマ区切り
		System.out.println("[0]~[10]の奇数");
		for (int i = 0; i <= 10; i++) {
			if (numbers[i] % 2 != 0) {
				System.out.print(numbers[i]);
				if (i < 10-1) {
					System.out.print(", ");
				}
			}
		}
		//[11]~[19]の値は偶数をカンマ区切り
		System.out.println("\n[11]~[19]の偶数");
		for (int i = 11; i < 19; i++) {
			if (numbers[i] % 2 == 0) {
				System.out.print(numbers[i]);
				if (i < 19-1) {
					System.out.print(", ");
				}
			}
		}
	}

}
