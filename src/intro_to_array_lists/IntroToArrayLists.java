package intro_to_array_lists;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		ArrayList<String> words = new ArrayList<String>();
		words.add("one");
		words.add ("two");
		words.add ("three");
		words.add("four");
		words.add ("five");
		//   Don't forget to import the ArrayList class
		
		//2. Add five Strings to your list
		
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < 5; i++) {
			JOptionPane.showMessageDialog(null, words.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for (String string : words) {
			JOptionPane.showMessageDialog(null, string);
		}
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < 5; i++) {
		if (i % 2 == 0) {
			JOptionPane.showMessageDialog(null, words.get(i));
		}
		}
		//6. Print all the Strings in reverse order.
		for (int i = 4; i >= 0; i--) {
			JOptionPane.showMessageDialog(null, words.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < args.length; i++) {
			JOptionPane.showMessageDialog(null, words.get(i).contains("e"));
		}
		}
	}

	
	

