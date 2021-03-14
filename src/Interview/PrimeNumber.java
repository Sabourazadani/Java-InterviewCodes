package Interview;

public class PrimeNumber {
		
		private static boolean isPrime(int number) {

	        if (number <= 1) return false;    //  1 is not prime and also not composite

	        for (int i = 2; i * i <= number; i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }
	        return true;
		}
	}
