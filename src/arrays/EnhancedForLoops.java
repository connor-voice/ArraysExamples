package arrays;

public class EnhancedForLoops {

	public static void main(String[] args) {

		method1();

		int[] stringArrayThree = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		for (int i : stringArrayThree) {
			if (intToBool(i)) {
				System.out.println("Even " + i * i * i);
			} else {
				System.out.println("Odd " + i * i);
			}
		}

	}

	public static void method1() {
		int[] stringArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		for (int arrayNum : stringArray) {
			System.out.println(arrayNum * arrayNum);
		}
	}

	public static boolean intToBool(int num) {

//		for (int i = 0; i < boolCheckString.length; i++) {
//			System.out.println(boolCheckString[i] % 2 == 0);
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
