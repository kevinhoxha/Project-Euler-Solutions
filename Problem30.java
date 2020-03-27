package euler;

import java.math.BigInteger;

public class Problem30 {

	public static void main(String[] args) {
		System.out.println(problem30());
	}
	
	private static BigInteger problem30() {
		BigInteger sum = BigInteger.ZERO;
		BigInteger current5thPowerSum = BigInteger.ZERO;
		for (BigInteger i = new BigInteger("10"); i.compareTo(BigInteger.ZERO) == 1; i = i.add(BigInteger.ONE)) {
			current5thPowerSum = BigInteger.ZERO;
			char[] digits = i.toString().toCharArray();
			for (char x: digits) {
				current5thPowerSum = current5thPowerSum.add(BigInteger.valueOf(Character.getNumericValue(x)).pow(5));
			}
			if (current5thPowerSum.compareTo(i) == 0) {
				sum = sum.add(i);
				System.out.println(sum);
			}
		}
		return sum;
	}
}
