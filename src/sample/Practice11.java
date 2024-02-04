package sample;

public class Practice11 {
	public static void main(String[] args) {
        int[] a = {5, 15, 8, 12, 9};

        int firstMax = a[0];
        int secondMax = Integer.MIN_VALUE;

        for (int num : a) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax) {
                secondMax = num;
            }
        }
        System.out.println("2番目に大きい要素は: " + secondMax);
	}
}
