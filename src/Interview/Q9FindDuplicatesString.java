package Interview;

public class Q9FindDuplicatesString {

	public static void main(String[] args) {

		String sentence = "I would like to see how many duplicates letters I have "
				+ "here at my string. Thank you for counting this Java";
		System.out.println(sentence);

	
		
		for (int i = 0; i < sentence.length(); i++) {
			char character = sentence.charAt(i);
		}
		
		char [] charArray = sentence.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			char character = charArray[i];
			
			System.out.println(character);
		}
	}
}
