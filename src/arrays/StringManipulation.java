package arrays;

public class StringManipulation {
	public static void main(String[] args) {
		method1();
	}
	public static void method1() {
		String myString = "I lIke this";
		String secondString = "I LIKE THIS";
		
		System.out.println(myString.toLowerCase());
		
		System.out.println(myString.toLowerCase().contains("ik")); // change to lower before checking contain
		
		System.out.println(myString.equalsIgnoreCase(secondString)); // ignore case on check
		
		for (int i = 0; i < myString.length(); i++) {
			System.out.println(myString.charAt(i));
		}
	}
}
