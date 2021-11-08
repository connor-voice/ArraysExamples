package arrays;

public class StringManipulation {
	public static void main(String[] args) {
		method1();
	}

	public static void method1() {
		String rainyDay = "yesterday it was raining";
		String sunnyDay = "today it is sunny";

		System.out.println(sunnyDay.toUpperCase() + ", " + rainyDay.toUpperCase());
	}
}
