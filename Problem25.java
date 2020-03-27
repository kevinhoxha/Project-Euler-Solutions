package euler;

import java.math.BigInteger;

public class Problem25 {

	public static void main (String[] args) {
		System.out.println(problem25());
	}
	
	private static int problem25() {
		int index = 2;
		BigInteger num1 = new BigInteger("1");
		BigInteger num2 = new BigInteger("1");		
		BigInteger newNum = new BigInteger("0");		
		while (is1000Digits(num2) == false) {
			index++;
			newNum = num1.add(num2);
			num1 = num2;
			num2 = newNum;
		}
		return index;
	}
	
	private static boolean is1000Digits(BigInteger number) {
		int count = 0;
		BigInteger zero = new BigInteger("0");
		BigInteger ten = new BigInteger("10");
		while (number.compareTo(zero) == 1) {
			number = number.divide(ten);
			count++;	
		}
		if (count >= 1000) {
			return true;
		} else {
			return false;
		}
	}
}
