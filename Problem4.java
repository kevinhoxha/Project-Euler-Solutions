package euler;

public class Problem4
{
	public static void main(String[] args)
	{
		int max = 0;
		for (int i = 100; i < 1000; i++)
		{
			for (int j = 100; j < 1000; j++)
			{
				if (isPalindrome(Integer.toString(i * j)) && i * j > max)
				{
					max = i * j;
				}
			}
		}
		System.out.println(max);
	}
	
	public static boolean isPalindrome(String str)
	{
		for (int i = 0; i < str.length()/2; i++)
		{
			if (str.charAt(i) != str.charAt(str.length() - 1 - i))
			{
				return false;
			}
		}
		return true;
	}
}
