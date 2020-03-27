package euler;

public class Problem41
{
	public static void main(String[] args)
	{
		for (int i = 708000000; i >= 1; i--)
		{
			if (i % 1000000 == 0)
			{
				System.out.println(i);
			}
			if (isPandigital(i) && isPrime(i))
			{
				System.out.println(i);
			}
		}
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
	
	public static boolean isPandigital(int num)
	{
		int len = Integer.toString(num).length();
		for (int i = 1; i <= len; i++)
		{
			if (!Integer.toString(num).contains(Integer.toString(i)))
			{
				return false;
			}
		}
		return true;
	}
}
