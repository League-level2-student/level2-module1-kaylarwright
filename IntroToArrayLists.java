package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		ArrayList<String> s = new ArrayList<String>();
		//   Don't forget to import the ArrayList class
		
		//2. Add five Strings to your list
		s.add("Hi");
		s.add("Hello");
		s.add("Here");
		s.add("Happy");
		s.add("Hill");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < s.size(); i++) {
			String h = s.get(i);
			System.out.println(h);
		}
		//4. Print all the Strings using a for-each loop
		System.out.println("\n");
		for(String h : s) {
			System.out.println(h);
		}
		//5. Print only the even numbered elements in the list.
		System.out.println("\n");
		for (int i = 0; i < s.size(); i++) {
	if (i%2==0) {
		System.out.println(s.get(i));
	}	
		
		}
		//6. Print all the Strings in reverse order.
		System.out.println("\n");
		for (int i = s.size()-1; i >= 0; i--) {
			System.out.println(s.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
//		String t = "paco";
//		if(t.contains("a")) {
//			System.out.println("ok");
//		}else {
//			System.out.println("noway");
//		}
		System.out.println("\n");
		for (int i = 0; i < s.size(); i++) {
			if (s.get(i).contains("e")) {
				System.out.println(s.get(i));
			}
		}
		
	}
}
