package euler;

public class Problem2 {

	public static void main(String[] args) {
		int sum = 0;
		int numOne = 1;
		int numTwo = 2;
		int currentNum = 2;
		while (currentNum <= 4000000) {
			if (currentNum % 2 == 0) {
				sum += currentNum;
			}
			currentNum = numOne + numTwo;
			numOne = numTwo;
			numTwo = currentNum;
		}
		System.out.println(sum);
	}
}
