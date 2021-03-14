package Interview;

import java.util.HashMap;
import java.util.Map;

public class Q8SecondHieghestRepetation {

	public static void main(String[] args) {

		String text = "This is just to check if we can code it or not ttttttt";

		Map<Character, Integer> map1 = new HashMap<Character, Integer>();

		for (int i = 0; i < text.length(); i++) {
			char currentChar = text.charAt(i);

			if (map1.get(currentChar) == null) {
				map1.put(currentChar, 1);
			} else {
				map1.put(currentChar, map1.get(currentChar) + 1);
			}
		}

		int higestNumber = 0;
		char maximumCharacter = 'a';

		for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
			System.out.println("Character = " + entry.getKey() + " : HighestNumber " + entry.getValue());
			
			if (higestNumber < entry.getValue()) {
				higestNumber = entry.getValue();
				maximumCharacter = entry.getKey();
			}
		}
		System.out.println("Max Character = " + maximumCharacter + " Max Count " + higestNumber);

	}

}
