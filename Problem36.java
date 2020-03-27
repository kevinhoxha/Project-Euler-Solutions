package euler;

import java.math.BigInteger;

public class Problem36 {

	public static void main(String[] args) {
		System.out.println(problem36());
	}
	
	private static long problem36() {
		long sum = 0;
		for (long i = 0; i < 1000000; i++) {
			if (MyUtilities.isPalindrome(BigInteger.valueOf(i)) && MyUtilities.isPalindrome(BigInteger.valueOf(Long.parseLong(Long.toBinaryString(i))))) {
				sum += i;
			}
		}
		return sum;
	}
}
