package euler;

public class Problem14 {

	public static void main(String[] args) {
		System.out.println(problem14());
	}
	
	private static long problem14() {
		long longestNumber = 0;
		long longestCount = 0;
		long currentCount = 0;
		long currentNumber = 0;
		for (long i = 1; i < 1000000; i++) {
			currentCount = 0;
			currentNumber = i;
			while (currentNumber != 1) {
				currentCount++;
				if (currentNumber % 2 == 0) {
					currentNumber = currentNumber/2;
				} else {
					currentNumber = (3*currentNumber) + 1;
				}
			}
			if (currentCount > longestCount) {
				longestCount = currentCount;
				longestNumber = i;
			}
		}
		return longestNumber;
	}
}
