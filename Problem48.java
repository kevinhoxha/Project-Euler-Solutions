package euler;

import java.math.BigInteger;

public class Problem48 {

	public static void main(String[] args) {
		System.out.println(problem48());
	}
	
	private static BigInteger problem48() {
		BigInteger sum = BigInteger.valueOf(0);
		for (int i = 1; i <= 1000; i++) {
			sum = sum.add(BigInteger.valueOf(i).pow(i));
		}
		return sum;
	}
}
