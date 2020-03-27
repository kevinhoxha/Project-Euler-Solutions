package euler;

public class Problem12 {

	public static void main(String[] args) {
		System.out.println(problem12());
	}
	
	private static long problem12() {
		long currentNum = 0;
		for (long i = 1; i > 0; i++) {
			 currentNum += i;
			 if (numOfDivisors(currentNum) >= 500) {
				 return currentNum;
			 }
		}
		return 0;
	}
	
	private static long numOfDivisors(long num) {
		long divisors = 2;
		for (long i = 2; i < num; i = i++) {
			if (num % i == 0) {
				divisors += 1;
			}
		}
		return divisors;
	}
}
