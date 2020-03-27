package euler;

import java.util.ArrayList;
import java.util.List;

public class Problem37
{
	public static void main(String[] args)
	{
		int sum = 0;
		int numPrimes = 0;
		int truncationsPrime = 0;
		for (int i = 10; i < Integer.MAX_VALUE; i++)
		{
			if (numPrimes == 11)
			{
				break;
			}
			truncationsPrime = 0;
			int[] truncations = truncations(i);
			for (int truncation: truncations)
			{
				if (isPrime(truncation))
				{
					truncationsPrime++;
				}
			}
			if (truncationsPrime == truncations.length)
			{
				numPrimes++;
				sum += i;
				System.out.println(i);
			}
		}
		System.out.println(sum); 
	}
	
	public static boolean isPrime(int num)
	{
		if (num == 1)
		{
			return false;
		}
		for (int i = 2; i <= num/2; i++)
		{
			if (num % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static int[] truncations(int num)
	{
		List<Integer> truncations = new ArrayList<>();
		for (int i = 0; i < Integer.toString(num).length(); i++)
		{
			truncations.add(Integer.parseInt(Integer.toString(num).substring(i)));
			truncations.add(Integer.parseInt(Integer.toString(num).substring(0, i + 1)));
		}
		int[] truncationsArray = new int[truncations.size()];
		for (int i = 0; i < truncations.size(); i++)
		{
			truncationsArray[i] = truncations.get(i);
		}
		return truncationsArray;
	}
}
