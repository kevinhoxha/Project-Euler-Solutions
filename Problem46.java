package euler;

public class Problem46
{
	public static void main(String[] args)
	{
		boolean bool = false;
		for (long i = 3; i < Long.MAX_VALUE; i += 2)
		{
			bool = false;
			if (isPrime(i))
			{
				continue;
			}
			for (long k = 1; k < i; k++)
			{
				if (isPrime(k))
				{
					for (long p = 1; p < i; p++)
					{
						if (i == k + 2 * p * p)
						{
							bool = true;
							break;
						}
					}
				}
			}
			if (bool == false)
			{
				System.out.println(i);
			}
		}
	}
	
	public static boolean isPrime(long num)
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
}
