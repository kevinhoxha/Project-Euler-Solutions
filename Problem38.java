package euler;

public class Problem38
{
	public static void main(String[] args)
	{
		for (int i = 9000; i < 10000; i++)
		{
			if (isPandigital("" + i + (i * 2)))
			{
				System.out.println("" + i + (i*2));
			}
		}
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
