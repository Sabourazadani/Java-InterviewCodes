package Interview;

public class Q3ReverseString {

	public static String reverse(String text) {
		// Reversing the string of "This should be easy."

		return new StringBuilder(text).reverse().toString();
	}

	public static void main(String[] args) {

		String text = "This should be easy.";
		System.out.println("String is : " + text);
		
		text = reverse(text);

		System.out.println("Reverse string is : " + text);

	}

}
