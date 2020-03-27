package euler;

import java.math.BigInteger;

public class Problem20 {

	public static void main(String[] args) {
		System.out.println(problem20());
	}
	
	private static long problem20() {
		long sum = 0;
		BigInteger num = MyUtilities.factorialRecursion(100);
		char[] digits = num.toString().toCharArray();
		for (char i: digits) {
			sum += Character.getNumericValue(i);
		}
		return sum;
	}
}
