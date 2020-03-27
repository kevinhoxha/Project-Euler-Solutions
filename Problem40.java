package euler;

public class Problem40 {

	public static void main(String[] args) {
		System.out.println(problem40());
	}
	
	private static long problem40() {
		long product = 1;
		String number = "";
		for (int i = 1; i < 200000; i++) {
			if (i % 1000 == 0) {
				System.out.println(i);	
			}
			number += Integer.toString(i);
		}
		char[] digits = number.toCharArray();
		product *= Character.getNumericValue(digits[0]);
		product *= Character.getNumericValue(digits[9]);
		product *= Character.getNumericValue(digits[99]);
		product *= Character.getNumericValue(digits[999]);
		product *= Character.getNumericValue(digits[9999]);
		product *= Character.getNumericValue(digits[99999]);
		product *= Character.getNumericValue(digits[999999]);
		return product;
	}
}
