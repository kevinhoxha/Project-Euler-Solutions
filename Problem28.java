package euler;

public class Problem28 {

	public static void main(String[] args) {
		System.out.println(problem28());
//		long[][] m = problem28Matrix();
//		for (int i = 0; i < m.length; i++) {
//			for (int j = 0; j < m.length; j++) {
//				System.out.print(m[i][j] + ", ");
//			}
//			System.out.println();
//		}
		System.out.println(matrixDiagonalSum(problem28Matrix()));
	}
	
	private static long problem28() {
		long sum = 1;
		long count = 0;
		long numToAddBy = 2;
		for (int i = 3; i <= 1002001; i+=numToAddBy) {
			count++;
			if (count % 4 == 0) {
				numToAddBy += 2;
			}
			sum += i;
		}
		return sum;
	}
	
	private static long[][] problem28Matrix() {
		int n = 1001;
		int i = (n-1)/2;
		int j = (n-1)/2;
		int num = 0;
		int circleCount = 0;
		long[][] matrix = new long[n][n];
		while (true) {
			num++;
			matrix[i][j] = num;
			if (i==0 && j==n-1) {
				return matrix;
			}
			if (i + j == n-1 && i <= j) {
				j++;
				circleCount++;
			} else if (i == (n-1)/2 - circleCount && i <= j && j < n-1-i) { //right
				j++;
			} else if (i == (n-1)/2 + circleCount && i >= j && j > n-1-i) { //left
				j--;
			} else if (j == (n-1)/2 + circleCount && j > i) { //down
				i++;
			} else if (j == (n-1)/2 - circleCount && j < i) { //up
				i--;
			}
		}
	}
	
	private static long matrixDiagonalSum(long[][] matrix) {
		long sum = -1;
		int n = 1001;
		for (int x = 0; x < n; x++) {
			sum += matrix[x][x];
		}
		for (int y = 0; y < n; y++) {
			sum += matrix[y][1000-y];
		}
		return sum;
	}
}
