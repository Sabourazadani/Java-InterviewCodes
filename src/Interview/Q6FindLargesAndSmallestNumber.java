package Interview;

public class Q6FindLargesAndSmallestNumber {

	public static void main(String[] args) {
		// find the largest number in this array
		// find the smallest number in this array
		// find the sum of all numbers in this array
		// find the average of all numbers in this array

		int[] numbers = { 15, 5, 8, 6, 9, 5, 4, 2, 5, 8, 2, 5, 2, 5, 41 };

		int max = numbers[0], min = numbers[0], sum = 0;

		for (int num : numbers) {
			if (num > max) {
				max = num;
			} else if (num < min) {
				min = num;
			}
			sum += num;
		}
		double avg = (double) sum / numbers.length;

		System.out.println("Min: " + min + " Max: " + max + " sum: " + sum + " average: " + avg);

		// round the avg number to 2 decimal points

		double avg1 = avg;
		double round = Math.round(avg1 * 100.0) / 100.0;

		System.out.println("Round of the Average Number with points: " + round);

		int largest = numbers[0];
		int secondLargest = numbers[0];

		System.out.println("The given array is:");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + "");
		}
		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] > largest) {
				secondLargest = largest;
				largest = numbers[i];

			} else if (numbers[i] > secondLargest) {
				secondLargest = numbers[i];

			}
		}

		System.out.println("\nSecond largest number is:" + secondLargest);

	}
}
