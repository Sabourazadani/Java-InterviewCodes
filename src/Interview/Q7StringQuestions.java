package Interview;

public class Q7StringQuestions {

	public static void main(String[] args) {
		// Find the Vowels letter at the below String

		String text = "This is just to check if we can code it or not";

		String newText = new String(text);
		

		for (int i = 0; i < newText.length(); i++) {
			if (newText.charAt(i) 
					== 'a' || newText.charAt(i) 
					== 'e' || newText.charAt(i) 
					== 'i' || newText.charAt(i) 
					== 'o' || newText.charAt(i) 
					== 'u') {
				System.out.println("Sabour Printed Vowel Letter at the given string is: " + newText.charAt(i) 
									+ " at the index " + i);
				
				 
			}	
			}
	}
}
