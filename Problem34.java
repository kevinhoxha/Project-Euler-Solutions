package euler;

import java.math.BigInteger;

public class Problem34 {

	public static void main(String[] args) {
		System.out.println(problem34());
	}
	
	private static BigInteger problem34() {
		BigInteger sum = new BigInteger("0");
		BigInteger currentDigitSum = new BigInteger("0");
		for (BigInteger i = new BigInteger("10"); i.compareTo(BigInteger.valueOf(2000000000)) == -1; i = i.add(BigInteger.valueOf(1))) {
			currentDigitSum = BigInteger.valueOf(0);
			char[] digits = i.toString().toCharArray();
			for (char x: digits) {
				currentDigitSum = currentDigitSum.add(MyUtilities.factorial(Character.getNumericValue(x)));
			}
			if (currentDigitSum.compareTo(i) == 0) {
				sum = sum.add(currentDigitSum);
				System.out.println(sum);
			}
		}
		return sum;
	}
}
