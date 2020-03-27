package euler;

public class Problem15 {

	public static void main(String[] args) {
		System.out.println(numRoutes(0, 0));
		
	}
	
	private static long numRoutes(int x, int y) {
		if (x == 20 || y == 20) {
			return 1;
		} else {
			return numRoutes(x + 1, y) + numRoutes(x, y + 1);
		}
	}
}
