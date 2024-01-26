package sample;

//要素数20の配列を宣言し、要素に0から5ずつ加算して代入させる。[0]~[10]の値の奇数のみカンマ区切りで、[11]~[19]の値は偶数をカンマ区切りで表示させる
public class Practice4_2 {
	public static void main(String[] args) {
		//要素数20の配列を宣言
		int[] array = new int[20];

		// 要素に0から5ずつ加算して代入
		for (int i = 0; i < array.length; i++) {
			array[i] = i * 5;
		}
		//[0]~[10]の値の奇数のみカンマ区切り
		System.out.print("奇数: ");
        for (int i = 0; i <= 10; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i]);
                if (i < 9) {
                    System.out.print(", ");
				}
			}
		}

		//[11]~[19]の値は偶数をカンマ区切り
		System.out.print("\n偶数: ");
		for (int i = 11; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i]);
				if (i < 18) {
					System.out.print(", ");
				}
			}
		}
	}
}
