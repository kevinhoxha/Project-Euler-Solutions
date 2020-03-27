package euler;

public class Problem36
{
	public static void main(String[] args)
	{
		int sum = 0;
		for (int i = 1; i < 1000000; i++)
		{
			if (Integer.toString(i).equals(reverse(Integer.toString(i))) && toBinary(i).equals(reverse(toBinary(i))))
			{
				sum += i;
			}
		}
		System.out.println(sum);
	}
	
	public static String toBinary(int decimal)
	{
		return Integer.toBinaryString(decimal);
	}
	
	public static String reverse(String s)
	{
		String reverseS = "";
		for (int i = s.length() - 1; i >= 0; i--)
		{
			reverseS += s.charAt(i);
		}
		return reverseS;
	}
}
