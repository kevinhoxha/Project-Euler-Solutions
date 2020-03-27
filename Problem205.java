package euler;

public class Problem205 {
	
	public static void main (String[] args) {
		System.out.println(problem205());
	}
	
	private static double problem205() {
		int currentTotalColin = 0;
		int currentTotalPeter = 0;
		long count = 0;
		long wins = 0;
		for (int roll1Peter = 1; roll1Peter <= 4; roll1Peter++) {
			for (int roll2Peter = 1; roll2Peter <= 4; roll2Peter++) {
				for (int roll3Peter = 1; roll3Peter <= 4; roll3Peter++) {
					for (int roll4Peter = 1; roll4Peter <= 4; roll4Peter++) {
						for (int roll5Peter = 1; roll5Peter <= 4; roll5Peter++) {
							for (int roll6Peter = 1; roll6Peter <= 4; roll6Peter++) {
								for (int roll7Peter = 1; roll7Peter <= 4; roll7Peter++) {
									for (int roll8Peter = 1; roll8Peter <= 4; roll8Peter++) {
										for (int roll9Peter = 1; roll9Peter <= 4; roll9Peter++) {
											for (int roll1Colin = 1; roll1Colin <= 6; roll1Colin++) {
												for (int roll2Colin = 1; roll2Colin <= 6; roll2Colin++) {
													for (int roll3Colin = 1; roll3Colin <= 6; roll3Colin++) {
														for (int roll4Colin = 1; roll4Colin <= 6; roll4Colin++) {
															for (int roll5Colin = 1; roll5Colin <= 6; roll5Colin++) {
																for (int roll6Colin = 1; roll6Colin <= 6; roll6Colin++) {
																	currentTotalPeter = roll1Peter + roll2Peter + roll3Peter + roll4Peter + roll5Peter + roll6Peter + roll7Peter + roll8Peter+ roll9Peter;
																	currentTotalColin = roll1Colin + roll2Colin + roll3Colin + roll4Colin + roll5Colin + roll6Colin;
																	if (currentTotalPeter > currentTotalColin) {
																		wins++;
																	}
																	count++;
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return (double)wins/count;
	}
}
