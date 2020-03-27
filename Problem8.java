package euler;

import java.math.BigInteger;

public class Problem8 {

	public static void main(String[] args) {
		System.out.println(problem8());
	}
	
	private static BigInteger problem8() {
		int count = 0;
		BigInteger highestProduct = new BigInteger("0"); 
		BigInteger currentProduct = new BigInteger("0"); 
		BigInteger d1 = new BigInteger("7");
		BigInteger d2 = new BigInteger("3");
		BigInteger d3 = new BigInteger("1");
		BigInteger d4 = new BigInteger("6");
		BigInteger d5 = new BigInteger("7");
		BigInteger d6 = new BigInteger("1");
		BigInteger d7 = new BigInteger("7");
		BigInteger d8 = new BigInteger("6");
		BigInteger d9 = new BigInteger("5");
		BigInteger d10 = new BigInteger("3");
		BigInteger d11 = new BigInteger("1");
		BigInteger d12 = new BigInteger("3");
		BigInteger d13 = new BigInteger("3");
		String number = "73167176531330624919225119674426574742355349194934"
				+ "96983520312774506326239578318016984801869478851843"
				+ "85861560789112949495459501737958331952853208805511"
				+ "12540698747158523863050715693290963295227443043557"
				+ "66896648950445244523161731856403098711121722383113"
				+ "62229893423380308135336276614282806444486645238749"
				+ "30358907296290491560440772390713810515859307960866"
				+ "70172427121883998797908792274921901699720888093776"
				+ "65727333001053367881220235421809751254540594752243"
				+ "52584907711670556013604839586446706324415722155397"
				+ "53697817977846174064955149290862569321978468622482"
				+ "83972241375657056057490261407972968652414535100474"
				+ "82166370484403199890008895243450658541227588666881"
				+ "16427171479924442928230863465674813919123162824586"
				+ "17866458359124566529476545682848912883142607690042"
				+ "24219022671055626321111109370544217506941658960408"
				+ "07198403850962455444362981230987879927244284909188"
				+ "84580156166097919133875499200524063689912560717606"
				+ "05886116467109405077541002256983155200055935729725"
				+ "71636269561882670428252483600823257530420752963450";
		char[] digits = number.toCharArray();
		for (char i: digits) {
			count++;
			if (count > 13) {
				d1 = d2;
				d2 = d3;
				d3 = d4;
				d4 = d5;
				d5 = d6;
				d6 = d7;
				d7 = d8;
				d8 = d9;
				d9 = d10;
				d10 = d11;
				d11 = d12;
				d12 = d13;
				d13 = BigInteger.valueOf(Character.getNumericValue(i));
			}
			currentProduct = d1.multiply(d2).multiply(d3).multiply(d4).multiply(d5).multiply(d6).multiply(d7).multiply(d8).multiply(d9).multiply(d10).multiply(d11).multiply(d12).multiply(d13);
			if (highestProduct.compareTo(currentProduct) == -1) {
				highestProduct = currentProduct;
			}
			
		}
		return highestProduct;
	}
}
