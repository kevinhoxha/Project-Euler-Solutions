package euler;

import java.util.ArrayList;
import java.util.List;

public class Problem35 {

	public static void main(String[] args) {
		System.out.println(problem35());
	}
	
	private static long problem35() {
		long currentCount = 0;
		long currentPrime = 0;
		char[] prime = {};
		for (long i = 1; i < 1000000; i += 2) {
			if (MyUtilities.isPrime(i) == true) {
				currentPrime = 0;
				prime = Long.toString(i).toCharArray();
				List<Long> primes = new ArrayList<>(prime.length);
				for (int count = 0; count < prime.length; count++) {
					for (int count2 = prime.length - 1; count2 >= 0; count2--) {
						currentPrime += prime[count] * (long)Math.pow(10, count2);
						primes.add(currentPrime);
					}
				}
				for (Long l: primes) {
					if (MyUtilities.isPrime(l) == false) {
						break;
					}
					currentCount++;
				}
				
			}
		}
		return currentCount;
	}
}
