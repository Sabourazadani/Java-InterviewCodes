package Interview;

public class Q6LargestNumber {

	public static void main(String[] args) {

		// find the largest number in this array
		// find the smallest number in this array
		// find the sum of all numbers in this array
		// find the average of all numbers in this array

		int[] numbers = { 1, 5, 8, 6, 9, 5, 4, 2, 5, 8, 2, 5, 2, 5, 41 };

		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("The Largest Number is:" + max);

		int min = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		System.out.println("The mimum Number is:" + min);
		

	}

}
