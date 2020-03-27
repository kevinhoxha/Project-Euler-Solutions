package euler;

public class Problem49
{
	public static void main(String[] args)
	{
		for (int i = 1000; i < 10000; i++)
		{
			for (int k = 1; i + 2 * k < 10000; k++) 
			{
				if (isPrime(i) && isPrime(i + k) && isPrime(i + 2 * k) && permutations(i, i + k, i + 2 * k))
				{
					System.out.println("" + i + (i + k) + (i + 2 * k));
				}
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
	
	public static boolean permutations (int a, int b, int c)
	{
		char[] digits = Integer.toString(a).toCharArray();
		String sB = Integer.toString(b);
		String sC = Integer.toString(c);
		for (char digit: digits)
		{
			if (!sB.contains(Character.toString(digit)) || !sC.contains(Character.toString(digit)))
			{
				return false;
			}
			else
			{
				sB = sB.substring(0, sB.indexOf(digit)) + sB.substring(sB.indexOf(digit) + 1);
				sC = sC.substring(0, sC.indexOf(digit)) + sC.substring(sC.indexOf(digit) + 1);
			}
		}
		return true;
	}
}
