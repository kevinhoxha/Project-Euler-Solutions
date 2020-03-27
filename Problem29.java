package euler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Problem29 {
	
	public static void main(String[] args) {
		System.out.println(problem29());
	}
	
	private static int problem29() {
		List<BigInteger> distinctTerms = new ArrayList<>();
		int numTerms = 0;
		BigInteger currentPower = new BigInteger("0");
		for (int a = 2; a <= 100; a++) {
			for (int b = 2; b <= 100; b++) {
				currentPower = BigInteger.valueOf(a).pow(b);
				if (distinctTerms.contains(currentPower) == false) {
					distinctTerms.add(currentPower);
					numTerms++;
				}
			}
		}
		return numTerms;
	}
}
