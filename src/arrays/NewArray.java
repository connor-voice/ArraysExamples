package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NewArray {

	public static void main(String[] args) {
		method1();
		method2();
	}
	public static void method1() {
		List<String> namesList = new ArrayList<>();
		
		namesList.add("Connor");
		namesList.add("Jason");
		namesList.add("Steve");
		namesList.add("Bob");
		namesList.add("Casey");
		namesList.add("Tyler");
		
		System.out.println(namesList);
		
		for(int i = 0; i < namesList.size(); i++) {
			System.out.println(namesList.get(i));
		}
		
		for(String listNames : namesList) {
			System.out.println(listNames);
		}
		
		namesList.get(2);
		namesList.set(0, "Connor :D");
		namesList.remove(3);
		Collections.sort(namesList);
		Collections.reverse(namesList);
		Collections.swap(namesList, 3, 1);
		
		List<String> namesList2 = namesList; // Clone no longer in Java, this is the easiest way to copy.
		System.out.println(namesList2);
	}
	
	public static void method2() {
		
	}
}
