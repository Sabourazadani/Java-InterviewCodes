package Interview;

import java.util.HashMap;
import java.util.Map;

public class Q3CountChar {

	public static void main(String[] args) {

		// Write the function to count Characters

		String text = "How many oF of the words WORDS in The the sentenses is Is being repeated";
		System.out.println(text);
		int count = 0;

		countChars(text);

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) != ' ')
				count++;
		}
		// System.out.println("The total number of Char in the above text is: " +
		// count);

	}

	public static void countChars(String string) {
		char[] chars = string.toCharArray();

		HashMap<Character, Integer> charsWithCount = new HashMap<Character, Integer>();

		for (char c : chars) {
			if (charsWithCount.containsKey(c)) {
				// i have the char
				charsWithCount.put(c, charsWithCount.get(c) + 1);
			} else {
				// if i dont have it
				charsWithCount.put(c, 1);
			}
		}
		System.out.println(charsWithCount);
		
		for (Map.Entry entry : charsWithCount.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
			
		

		}

	}
}
