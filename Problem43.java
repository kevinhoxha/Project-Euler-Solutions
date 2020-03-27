package euler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Problem43 {

	public static void main(String[] args) {
		System.out.println(problem43());
	}
	
	private static boolean isPandigital(BigInteger num) {
		List<Long> digits = new ArrayList<>();
		for (long i = 0; i < 10; i++) {
			digits.add(i);
		}
		char[] newNum = num.toString().toCharArray();
		if (newNum.length != 10) {
			return false;
		}
		for (char c: newNum) {
			if (digits.contains(Character.getNumericValue(c))) {
				digits.remove(Character.getNumericValue(c));
			} else {
				return false;
			}
		}
		return true;
	}
	
	private static BigInteger problem43() {
		BigInteger sum = BigInteger.ZERO;
		char[] currentNum = {};
		for (BigInteger i = new BigInteger("1000000000"); i.compareTo(new BigInteger("9999999999"))  == -1; i = i.add(BigInteger.ONE)) {
			if (isPandigital(i)) {
				currentNum = i.toString().toCharArray();
				if ((Character.getNumericValue(currentNum[1]) * 100 + Character.getNumericValue(currentNum[2]) * 10 + Character.getNumericValue(currentNum[3])) % 2 != 0) {
					continue;
				} else if ((Character.getNumericValue(currentNum[2]) * 100 + Character.getNumericValue(currentNum[3]) * 10 + Character.getNumericValue(currentNum[4])) % 3 != 0) {
					continue;
				} else if ((Character.getNumericValue(currentNum[3]) * 100 + Character.getNumericValue(currentNum[4]) * 10 + Character.getNumericValue(currentNum[5])) % 5 != 0) {
					continue;
				} else if ((Character.getNumericValue(currentNum[4]) * 100 + Character.getNumericValue(currentNum[5]) * 10 + Character.getNumericValue(currentNum[6])) % 7 != 0) {
					continue;
				} else if ((Character.getNumericValue(currentNum[5]) * 100 + Character.getNumericValue(currentNum[6]) * 10 + Character.getNumericValue(currentNum[7])) % 11 != 0) {
					continue;
				} else if ((Character.getNumericValue(currentNum[6]) * 100 + Character.getNumericValue(currentNum[7]) * 10 + Character.getNumericValue(currentNum[8])) % 13 != 0) {
					continue;
				} else if ((Character.getNumericValue(currentNum[7]) * 100 + Character.getNumericValue(currentNum[8]) * 10 + Character.getNumericValue(currentNum[9])) % 17 != 0) {
					continue;
				}
				sum = sum.add(i);
			}
		}
		return sum;
	}
}
