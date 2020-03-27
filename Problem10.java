package euler;

public class Problem10 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println(problem10());
		long end = System.currentTimeMillis();
		System.out.println((end-start)/1000);
	}
	
	private static long problem10() {
		long sum = 2;
		for(long i = 3; i < 2000000; i = i + 2) {
			if (MyUtilities.isPrime(i)) {
				sum += i;
			}
		}
		return sum;
	}
}