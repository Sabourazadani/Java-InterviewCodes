package Interview;

import java.util.ArrayList;

public class FibonacciNumber {

	public static void main(String[] args) {
		// The Fibonacci series is a series of elements where, the previous two elements
		// are added to get the next element, starting with 0 and 1.

		int n1 = 0;
		int n2 = 1;
		int n3;
		int i;
		int count = 10;
		System.out.print(n1 + " " + n2);// printing 0 and 1

		for (i = 2; i < count; ++i)// loop starts from 2 because 0 and 1 are already printed
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
		
		System.out.println("\n ********* Printing with ArrayList ************");
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(0);
		nums.add(1);
		for (int count1 = 0; count1 < 10; count1++) {
			nums.add(nums.get(nums.size() - 1) + nums.get(nums.size() - 2));
		}
		System.out.println(nums);

	}
}
