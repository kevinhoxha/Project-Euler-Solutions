package euler;

import java.util.ArrayList;

public class Problem32
{
	public static void main(String[] args)
	{
		int sum = 0;
		ArrayList<Integer> pandigitals = new ArrayList<>();
		for (double i = 1; i < 10000; i++)
		{
			for (double k = 1; k < i; k++)
			{
				if ((i / k) % 1 == 0 && isPandigital("" + (int)i + (int)k + (int)(i/k)) && !pandigitals.contains((int)i))
				{
					System.out.println(i);
					sum += i;
					pandigitals.add((int)i);
				}
			}
		}
		System.out.println(sum);
	}
	
	public static boolean isPandigital(String num)
	{
		int len = num.length();
		if (len != 9)
		{
			return false;
		}
		for (int i = 1; i <= len; i++)
		{
			if (!num.contains(Integer.toString(i)))
			{
				return false;
			}
		}
		return true;
	}
}
