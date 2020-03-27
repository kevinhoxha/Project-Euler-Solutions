package euler;

public class Problem9 {

	public static void main(String[] args) {
		System.out.println(problem9());
	}
	
	private static long problem9() {
		long product = 0;
		for (int c = 1; c < 1000; c++) {
			for (int b = 1; b < c; b++) {
				for (int a = 1; a < b; a++) {
					if (a + b + c == 1000 && a*a + b*b == c*c) {
						product = a*b*c;
					}
				}
			}
		}
		return product;
	}
}
