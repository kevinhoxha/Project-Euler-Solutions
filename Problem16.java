package euler;

import java.math.BigInteger;

public class Problem16 {

	public static void main(String[] args) {
		System.out.println(problem16());
	}
	
	private static BigInteger problem16() {
		BigInteger sum = BigInteger.valueOf(0);
		char[] digits = BigInteger.valueOf(2).pow(1000).toString().toCharArray();
		for (char i: digits) {
			sum = sum.add(BigInteger.valueOf(Character.getNumericValue(i)));
		}
		return sum;
	}
}
