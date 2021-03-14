package Interview;

import java.util.HashMap;

public class Q2CountingWords {
	public static void main(String[] args) {

		// write a function to count the number of words in this String.
		// then it should print the list of the words with the repetition number of each
		// one of them.

		String text = "The brwon fox jumped on the desk. The fox is looking at the window now. fox fox fox";

		// lets find the count of all words - separated by space
		// create a unique list of the words
		// count each repetition of each word

		countWords(text);

	}

	public static void countWords(String str) {
		String[] allWrods = str.split(" ");

		HashMap<String, Integer> words = new HashMap<String, Integer>();

		for (int i = 0; i < allWrods.length; i++) {
			if (words.containsKey(allWrods[i])) {
				// i do have the word
				words.put(allWrods[i], (words.get(allWrods[i]) + 1));
			} else {
				// i dont have the word
				words.put(allWrods[i], 1);
			}
		}

		System.out.println(words);

		// adding all of the words in a set will give a unique list of the words
//			HashSet<String> temp  = new HashSet<String>();
//			
//			for (String s : allWrods) {
//				temp.add(s);
//			}
//			
//			System.out.println(temp);
//			System.out.println(temp.size());

		// after split, you could get the size of the array for the total number of
		// words
//			System.out.println(allWrods.length);
//			for (int i = 0; i < allWrods.length; i++) {
//				System.out.println(1+i + " " + allWrods[i]);
//			}

	}
}
