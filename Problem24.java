package euler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem24 {

	public static void main(String[] args) {
		System.out.println(problem24());
	}
	
	private static long problem24() {
		String[] digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		List<Long> lexicographicPermutations = new ArrayList<>();
		for (String str: digits) {
			
		}
		Collections.sort(lexicographicPermutations);
		int count = 1;
		for (long l: lexicographicPermutations) {
			if (count == 1000000) {
				return l;
			}
			count++;
		}
		return 0;
	}
}
