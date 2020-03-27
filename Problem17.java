package euler;

public class Problem17 {

	public static void main(String[] args) {
		System.out.println(problem17v2());
	}
	
	private static long problem17() {
		long charCount = 0;
		int currentCount = 0;
		char[] currentNum = {};
		for (int i = 1; i <= 1000; i++) {
			currentCount = 0;
			currentNum = Integer.toString(i).toCharArray();
			for (char digit: currentNum) {
				currentCount++;
				if (currentNum.length == 1) {
					if (Character.getNumericValue(digit) == 1 || Character.getNumericValue(digit) == 2 || Character.getNumericValue(digit) == 6) {
						charCount += 3;
					}
					if (Character.getNumericValue(digit) == 4 || Character.getNumericValue(digit) == 5 || Character.getNumericValue(digit) == 9) {
						charCount += 4;
					}
					if (Character.getNumericValue(digit) == 3 || Character.getNumericValue(digit) == 7 || Character.getNumericValue(digit) == 8) {
						charCount += 5;
					}
				}
				if (currentNum.length == 2) {
					if (currentCount == 1 && Character.getNumericValue(digit) == 1) {
						if (Character.getNumericValue(currentNum[1]) == 0) {
							charCount += 3;
						} else if (Character.getNumericValue(currentNum[1]) == 1 || Character.getNumericValue(currentNum[1]) == 2) {
							charCount += 6;
						} else if (Character.getNumericValue(currentNum[1]) == 3 || Character.getNumericValue(currentNum[1]) == 4 || Character.getNumericValue(currentNum[1]) == 8 || Character.getNumericValue(currentNum[1]) == 9) {
							charCount += 8;
						} else if (Character.getNumericValue(currentNum[1]) == 5 || Character.getNumericValue(currentNum[1]) == 6) {
							charCount += 7;
						} else if (Character.getNumericValue(currentNum[1]) == 7) {
							charCount += 9;
						}
					} else if (currentCount == 2 && Character.getNumericValue(currentNum[0]) != 1) {
						if (Character.getNumericValue(digit) == 1 || Character.getNumericValue(digit) == 2 || Character.getNumericValue(digit) == 6) {
							charCount += 3;
						}
						if (Character.getNumericValue(digit) == 4 || Character.getNumericValue(digit) == 5 || Character.getNumericValue(digit) == 9) {
							charCount += 4;
						}
						if (Character.getNumericValue(digit) == 3 || Character.getNumericValue(digit) == 7 || Character.getNumericValue(digit) == 8) {
							charCount += 5;
						}
					} else if (currentCount == 1 && Character.getNumericValue(digit) != 1) {
						if (Character.getNumericValue(digit) == 4 || Character.getNumericValue(digit) == 5 || Character.getNumericValue(digit) == 6) {
							charCount += 5;
						}
						if (Character.getNumericValue(digit) == 2 || Character.getNumericValue(digit) == 3 || Character.getNumericValue(digit) == 8 || Character.getNumericValue(digit) == 9) {
							charCount += 6;
						}
						if (Character.getNumericValue(digit) == 7) {
							charCount += 7;
						}
					}
				}
				if (currentNum.length == 3) {
					if (currentCount == 1 && (currentNum[1] != 0 || currentNum[2] != 0)) {
						if (Character.getNumericValue(digit) == 1 || Character.getNumericValue(digit) == 2 || Character.getNumericValue(digit) == 6) {
							charCount += 13;
						}
						if (Character.getNumericValue(digit) == 4 || Character.getNumericValue(digit) == 5 || Character.getNumericValue(digit) == 9) {
							charCount += 14;
						}
						if (Character.getNumericValue(digit) == 3 || Character.getNumericValue(digit) == 7 || Character.getNumericValue(digit) == 8) {
							charCount += 15;
						}
					} else if (currentCount == 1 && currentNum[1] == 0 && currentNum[2] == 0) {
						if (Character.getNumericValue(digit) == 1 || Character.getNumericValue(digit) == 2 || Character.getNumericValue(digit) == 6) {
							charCount += 10;
						}
						if (Character.getNumericValue(digit) == 4 || Character.getNumericValue(digit) == 5 || Character.getNumericValue(digit) == 9) {
							charCount += 11;
						}
						if (Character.getNumericValue(digit) == 3 || Character.getNumericValue(digit) == 7 || Character.getNumericValue(digit) == 8) {
							charCount += 12;
						}
					} else if (currentCount == 2 && Character.getNumericValue(digit) == 1) {
						if (Character.getNumericValue(currentNum[2]) == 0) {
							charCount += 3;
						} else if (Character.getNumericValue(currentNum[2]) == 1 || Character.getNumericValue(currentNum[2]) == 2) {
							charCount += 6;
						} else if (Character.getNumericValue(currentNum[2]) == 3 || Character.getNumericValue(currentNum[2]) == 4 || Character.getNumericValue(currentNum[1]) == 8 || Character.getNumericValue(currentNum[1]) == 9) {
							charCount += 8;
						} else if (Character.getNumericValue(currentNum[2]) == 5 || Character.getNumericValue(currentNum[2]) == 6) {
							charCount += 7;
						} else if (Character.getNumericValue(currentNum[2]) == 7){
							charCount += 9;
						}
					} else if (currentCount == 3 && Character.getNumericValue(currentNum[1]) != 1) {
						if (Character.getNumericValue(digit) == 1 || Character.getNumericValue(digit) == 2 || Character.getNumericValue(digit) == 6) {
							charCount += 3;
						}
						if (Character.getNumericValue(digit) == 4 || Character.getNumericValue(digit) == 5 || Character.getNumericValue(digit) == 9) {
							charCount += 4;
						}
						if (Character.getNumericValue(digit) == 3 || Character.getNumericValue(digit) == 7 || Character.getNumericValue(digit) == 8) {
							charCount += 5;
						}
					} else if (currentCount == 2 && Character.getNumericValue(digit) != 1) {
						if (Character.getNumericValue(digit) == 4 || Character.getNumericValue(digit) == 5 || Character.getNumericValue(digit) == 6) {
							charCount += 5;
						}
						if (Character.getNumericValue(digit) == 2 || Character.getNumericValue(digit) == 3 || Character.getNumericValue(digit) == 8 || Character.getNumericValue(digit) == 9) {
							charCount += 6;
						}
						if (Character.getNumericValue(digit) == 7) {
							charCount += 7;
						}
					}
				}
				if (currentNum.length == 4) {
					charCount += 11;
				}
			}
		}
		return charCount;
	}
	
	private static long problem17v2() {
		long charCount = 0;
		charCount += 3 + 3 + 5 + 4 + 4 + 3 + 5 + 5 + 4 + 3 + 6 + 6 + 8 + 8 + 7 + 7 + 9 + 8 + 8;
		charCount += 5*30 + 6*40 + 7*10 + 3*24 + 4*24 + 5*24;
		charCount += 854*9 + 10*3 + 11*3 + 12*3 + 13*99*3 + 14*99*3 + 15*99*3 + 11;
		return charCount;
	}
}
