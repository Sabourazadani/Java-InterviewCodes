package Interview;

import java.util.HashMap;
import java.util.Set;

public class CountWords {

	public static void main(String[] args) {

		String text = "How many oF of the words WORDS WORDS words in The the sentenses is Is being repeated";
		System.out.println(text);
		
		String item[] = text.split(" ");

		HashMap<String, Integer> map = new HashMap<>();

		for (String t : item) {
			if (map.containsKey(t)) {
				map.put(t, map.get(t) + 1);

			} else {
				map.put(t, 1);
			}
		}
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println("This -> "+key + " <- word/words is being repeated as follow; ");
			System.out.println("Repeated number is : "+ map.get(key));
		}

	}

}
