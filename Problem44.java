package euler;

import java.util.HashSet;
import java.util.Set;

public class Problem44
{
	public static void main(String[] args)
	{
		int currentPi = 0;
		int currentPk = 0;
		int minD = Integer.MAX_VALUE;
		Set<Integer> pentagonals = new HashSet<>();
		for (int i = 1; i < 10000; i++)
		{
			if (i % 1000 == 0)
			{
				System.out.println(i);
			}
			currentPi = i * (3 * i - 1) / 2;
			for (int k = 1; k < 10000; k++)
			{
				currentPk = k * (3 * k - 1) / 2;
				pentagonals.add(currentPk);
				if (pentagonals.contains(currentPi + currentPk) && pentagonals.contains(Math.abs(currentPi - currentPk)) && Math.abs(currentPi - currentPk) < minD)
				{
					minD = Math.abs(currentPi - currentPk);
				}
			}
		}
		System.out.println(minD);
	}
}
