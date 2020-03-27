package euler;

public class Problem6 {

	public static void main(String[] args) {
		System.out.println(problem6());
	}
	
	private static long problem6() {
		int sumOfNums = 0;
		int sumOfSquares = 0;
		for (int i = 1; i <= 100; i++) {
			sumOfNums += i;
			sumOfSquares += Math.pow(i, 2);
		}
		return (long) Math.pow(sumOfNums, 2) - sumOfSquares;
	}
}
