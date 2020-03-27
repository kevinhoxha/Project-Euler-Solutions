package euler;

public class Problem5 {

	public static void main (String[] args) {
		System.out.println(problem5());
	}
	
	private static long problem5() {
		for (long i = 20; i > 1; i+= 20) {
			if (i % 3 == 0 && i % 6 == 0 && i % 7 == 0 && i % 8 == 0 && i % 9 == 0 && i % 11 == 0 && i % 12 == 0 && i % 13 == 0 &&  i % 14 == 0 && i % 15 == 0 && i % 16 == 0 && i % 17 == 0 && i % 18 == 0 && i % 19 == 0) {
				return i;
			}
		}
		return 0;
	}
}
