package sample;

//要素数20の配列を宣言し、要素に0から5ずつ加算して代入させる。[0]~[10]の値の奇数のみカンマ区切りで、[11]~[19]の値は偶数をカンマ区切りで表示させる
public class Practice9 {
	public static void main(String[] args) {
		//要素数20の配列を宣言し
		int[] num = new int[20];
		for (int i = 0; i < num.length; i++) {
			num[i] = i * 5;
		}
		//[0]~[10]の値の奇数のみカンマ区切り
		System.out.println("[0]~[10]の偶数");
		boolean flag = true;
		for (int i = 1; i < 10; i++) {
			if (i % 2 != 0) {
				if (flag) {
					System.out.print(num[i]);
					flag = false;
				} else {
				System.out.print(", " + num[i]);
				}
			}
		}
		//[11]~[19]の値は偶数をカンマ区切り
		System.out.println("\n[11]~[19]の偶数");
		boolean flag2 = true;
		for (int i = 11; i < num.length; i++) {
			if (i % 2 == 0) {
				if (flag2) {
					System.out.print(num[i]);
					flag2 = false;
				} else {
				System.out.print(", " + num[i]);
				}
			}
		}
	}
}
