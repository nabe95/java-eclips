package sample;

public class Practice8 {
	public static void main(String[] args) {
		String[] array = new String[3];
		array[0] = "{1,2,3}";
		array[1] = "{2,4,6}";
		array[2] = "{3,6,9}";
		
		for (int i = 0; i < 3; i++) {
			System.out.println("要素[" + i + "] = " + array[i]);
		}
	}
}