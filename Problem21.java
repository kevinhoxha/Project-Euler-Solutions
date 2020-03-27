package euler;

public class Problem21 {

	public static void main(String[] args) {
		System.out.println(problem21());
	}
	
	private static long problem21() {
		long sum = 0;
		for (long i = 1; i < 10000; i++) {
			if (isAmicable(i)) {
				sum += i;
			}
		}
		return sum;
	}
	
	private static boolean isAmicable (long i) {
		long x = divisorSum(i);
		if (x != i && divisorSum(x) == i) {
			return true;
		}
		return false;
	}
	
	private static long divisorSum(long i) {
		long sum = 0;
		for (int x = 1; x < i; x++) {
			if (i % x == 0) {
				sum += x;
			}
		}
		return sum;
	}
}
