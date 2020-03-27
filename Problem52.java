package euler;

import java.math.BigInteger;
import java.util.Arrays;

public class Problem52 {

	public static void main(String[] args) {
		System.out.println(problem52());
	}
	
	private static BigInteger problem52() {
		BigInteger smallestInt = BigInteger.ZERO;
		char[] x1 = {}; char[] x2 = {};  char[] x3 = {};  char[] x4 = {};  char[] x5 = {};  char[] x6 = {}; 
		for (BigInteger x = BigInteger.ONE; x.compareTo(new BigInteger("900000000000000000000000000000000")) == -1; x.add(BigInteger.ONE)) {
			x1 = x.toString().toCharArray();
			x2 = x.multiply(BigInteger.valueOf(2)).toString().toCharArray();
			x3 = x.multiply(BigInteger.valueOf(3)).toString().toCharArray();
			x4 = x.multiply(BigInteger.valueOf(4)).toString().toCharArray();
			x5 = x.multiply(BigInteger.valueOf(5)).toString().toCharArray();
			x6 = x.multiply(BigInteger.valueOf(6)).toString().toCharArray();
			int[] y1 = new int[x1.length];  int[] y2 = new int[x2.length];  int[] y3 = new int[x3.length];  int[] y4 = new int[x4.length];  int[] y5 = new int[x5.length];  int[] y6 = new int[x6.length];
			for (int i = 0; i < x1.length; i++) {
				y1[i] = Character.getNumericValue(x1[i]);
			}
			for (int i = 0; i < x1.length; i++) {
				y2[i] = Character.getNumericValue(x2[i]);
			}
			for (int i = 0; i < x1.length; i++) {
				y3[i] = Character.getNumericValue(x3[i]);
			}
			for (int i = 0; i < x1.length; i++) {
				y4[i] = Character.getNumericValue(x4[i]);
			}
			for (int i = 0; i < x1.length; i++) {
				y5[i] = Character.getNumericValue(x5[i]);
			}
			for (int i = 0; i < x1.length; i++) {
				y6[i] = Character.getNumericValue(x6[i]);
			}
			Arrays.sort(y1); Arrays.sort(y2); Arrays.sort(y3); Arrays.sort(y4); Arrays.sort(y5); Arrays.sort(y6);
			if (y1 == y2 && y1 == y3 && y1 == y4 && y1 == y5 && y1 == y6) {
				smallestInt = x;
				break;
			}
		}
		return smallestInt;
	}
}
