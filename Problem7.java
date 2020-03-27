package euler;

public class Problem7 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println(findPrimeNumber(10001));
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
	
	private static long findPrimeNumber(int count) {
		int primeCount = 1;
		for (long i = 3; i > 2; i += 2) {
			if (isPrime(i)) {
				primeCount++;
				if (primeCount == count) {
					return i;
				}
			}
		}
		return 0;
	}
	
	private static boolean isPrime(long num) {
		long start = (num/2)%2 == 0 ? num/2 + 1 : num/2;
		for (long x = start; x > 1; x = x - 2) {
			if (num % x == 0) {
				return false;
			}
		}
		return true;
	}
}
