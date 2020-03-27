package euler;

public class Problem27 
{
	public static void main(String[] args) 
	{
		int bestNum = 0;
		int bestA = 0;
		int bestB = 0;
		for (int a = -1000; a <= 1000; a++) 
		{
			for (int b = -1000; b <= 1000; b++) 
			{
				int num = numberOfConsecutivePrimes(a, b);
				if (num > bestNum)
				{
					bestNum = num;
					bestA = a;
					bestB = b;
				}
			}
		}
		System.out.println(bestA * bestB);
	}

	public static int numberOfConsecutivePrimes(int a, int b) 
	{
		for (int i = 0; ; i++)
		{
			int n = i * i + i * a + b;
			if (n < 0 || !isPrime(n))
			{
				return i;
			}
		}
	}

	private static boolean isPrime(int num) 
	{
		if (num == 2) 
		{
			return true;
		}
		if (num < 2 || num % 2 == 0) 
		{
			return false;
		}
		for (int i = 3; i * i <= num; i += 2) 
		{
			if (num % i == 0)
			{
				return false;
			}	
		}
		return true;
	}
}
