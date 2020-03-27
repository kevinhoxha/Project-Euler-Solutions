package euler;

public class Problem3 {
	
	public static void main (String[] args) {
		System.out.println(problem3());
	}
	
	private static long problem3() {
		long number = 600851475143L;
		for (long i = number/10000000; i > 1; i = i - 2) {
			if (isPrime(i)  == true && number % i == 0) {
				return i;
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
