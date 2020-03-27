package euler;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Problem56 {

	public static void main (String[] args) {
		System.out.println(problem56());
	}
	
	private static String problem56() {
		int digitSum = 0;
		BigInteger number = new BigInteger("0");
		int base = 0;
		int exponent = 0;
		for (int a = 1; a < 100; a++) {
			for (int b = 1; b < 100; b++) {
				BigInteger power = BigInteger.valueOf(a).pow(b);
				int currentSum = findDigitSum(power);
				if (currentSum > digitSum) {
					digitSum = currentSum;
					number = power;
					base = a;
					exponent = b;
				}
			}
		}
		String ret = "base=" + base + "\nexponent=" + exponent + "\nnumber=" + number + "\nsum=" + digitSum;
		return ret;
	}
	
	private static int findDigitSum(BigInteger number) {
		BigInteger ten = new BigInteger("10");
		BigInteger zero = new BigInteger("0");
		int digitSum = 0;
		while (number.compareTo(zero) == 1) {
			digitSum = digitSum + (number.remainder(ten).intValue());
			number = number.divide(ten);
		}
		return digitSum;
	}
	
	private static int findDigitSum2(BigInteger number) {
		int digitSum = 0;
		char[] numList = number.toString().toCharArray();
		for (char i: numList) {
			digitSum = digitSum + Character.getNumericValue(i);
		}
		return digitSum;
	}
}
