package arrays;

public class ArrayExcersiseOne {
	
	public static void main(String[] args) {
//		method1();
		method2();
	}
	
//	public static void method1() {
//		int[] numArray = {1, 22, 333, 4444, 55555, 666666, 7777777, 88888888, 999999999, 1010101010};
//		
//		for (int i = 0; i < numArray.length; i++) {
//			System.out.println(numArray[i]);
//		}
//	}
	
	public static void method2() {
		int[] numArrayTwo = new int[5];
		int[] numArrayThree = {2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048}; // ASSIGN EACH INDEX WITH A VALUE
		
		for(int i = 0; i < numArrayTwo.length; i++) {
			numArrayTwo[i] = 50;
			System.out.println(numArrayTwo[i] + " " + i);
			}
		
		for(int i = 0; i < numArrayThree.length; i++) {
			numArrayThree[i] = numArrayThree[i]*10; // ASSIGN EACH INDEX WITH ITSELF TIMES TEN
			System.out.print(numArrayThree[i] + " "); // PRINT NEW ASSIGNED VALUES
		}
	}
}
