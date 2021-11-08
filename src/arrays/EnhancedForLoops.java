package arrays;

public class EnhancedForLoops {

	public static void main(String[] args) {

		method1();
	}

	public static void method1() {
		int[] stringArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		
		for(int arrayNum : stringArray) {
			System.out.println(arrayNum * arrayNum);
		}
	}
}
