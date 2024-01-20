package sample;

public class JavaSampleClass {
	public static void main(String []args) {
		int isHungry =1;
		String food = "ラーメン";
		System.out.println("こんにちは");
		if (isHungry == 0) {
			System.out.println("お腹いっぱいです");
		} else {
			System.out.println("はらぺこです");
		}
		if (isHungry == 1) {
			System.out.println(food + "をいただきます");
		}
	System.out.println("ごちそうさまでした");
	}
}