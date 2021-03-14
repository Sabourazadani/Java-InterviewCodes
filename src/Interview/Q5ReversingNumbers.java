package Interview;

public class Q5ReversingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		int y = 5;
		System.out.println("X: " + x + " Y : " + y);

		int temp = x;
		x = y;
		y = temp;

		System.out.println("X: " + x + " Y : " + y);

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("X: " + x + " Y : " + y);

		x = x * y;
		y = x / y;
		x = x / y;

		System.out.println("X: " + x + " Y : " + y);

		// convert the int to string and then reverse the string using a loop.
		// then convert the reversed number to that same int

		int number = 15948;
		System.out.println("Orginal number : " + number);

		String numberToString = String.valueOf(number);
		String reverse = "";

		for (int i = numberToString.length() - 1; i >= 0; i--) {
			reverse += numberToString.charAt(i);
		}
		number = Integer.parseInt(reverse);

		System.out.println("Reverse number : " + number);
		
		// Reversing with while loop
		
		int num = 4321;
		int reverse1 = 0;
		
		while (number != 0) {
			int dig = number % 10;
			reverse1 = reverse1 * 10 + dig;
			number /= 10;
		}
		System.out.println("Reversed Number: " + reverse);
	}
	

}
