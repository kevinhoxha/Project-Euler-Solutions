package euler;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Problem13 {

	public static void main(String[] args) {
		System.out.println(problem13());
	}
	
	private static BigInteger problem13() {
		BigInteger sum = new BigInteger("0");
		File file = new File("/Users/kevin/Documents/workspace/my.project/src/euler/Problem13.data");
		Scanner sc;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				sum = sum.add(new BigInteger(sc.nextLine())); 
				}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return sum;
	}
}
