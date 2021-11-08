package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListsExample {

	public static void main(String[] args) {
		
		method1();
		method2();
	}
	
	public static void method1() {
		List<String> names = new ArrayList<>(); // CREATE LIST
		
		names.add("Zayn"); //POPULATE LIST
		names.add("Jayne");
		names.add("Bane");
		names.add("Lane");
		
		names.set(0, "Not Zayn"); // CHANGING A VALUE IN A LIST
		names.remove(3); // REMOVE FROM LIST
		Collections.sort(names); // SORT LIST IN ALPHABETICAL
		Collections.swap(names, 0, 2); // SWAP VALUES IN LIST
		Collections.reverse(names); // REVERSE ORDER OF VALUES IN LIST
		
		System.out.println(names.size()); // PRINTS SIZE OF LIST
		System.out.println(names); // PRINT WHOLE LIST
		System.out.println(names.get(1)); // PRINT LIST WITH SPECIFIC PLACE IN LIST
		
		// ENHANCED FOR LOOP TO PRINT LIST VALUES
		for(String namesNew : names) {
			System.out.println(namesNew);
			
		}
		//REGULAR FOR LOOP TO PRINT LIST VALUES
		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
	}
	public static void method2() {
		List<String> pets = List.of("cat", "dog", "cow"); // LIST THAT CANNOT BE CHANGED
		List<String> petsTwo = new ArrayList<>(); // LIST THAT CANNOT BE CHANGED
		System.out.println(pets);
		petsTwo.add("bird");
		System.out.println(petsTwo);
		
	}
}
