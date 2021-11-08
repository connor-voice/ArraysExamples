package arrays;

public class ArraysFolder {

	public static void main(String[] args) {

//		int[] numArray = { 24, 27, 29, 35, 12, 14 };
//
//		for (int i = 0; i < numArray.length; i++) {
//			System.out.println(numArray[i]);
//		}

		method1();
		
	}
	
	public static void method1() {
		
		int[][] ageArray = { {25, 30, 31}, {56, 67, 39}, {8, 1, 2} };
		String[][] nameArray = new String [3][2];
		nameArray[0][1] = "Connor";
		
		//FOR EACH LOOP
		
		for (int[] array : ageArray) {
			for (int value : array) {
				System.out.println(value);
			}
		}
		// FOR LOOP
		
		for(int i = 0; i < ageArray.length; i++) {
			for (int j = 0; j < ageArray[i].length; j++){
				System.out.println(ageArray[i][j]);
			}
		}	
	}
}
