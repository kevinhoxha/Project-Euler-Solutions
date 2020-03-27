package euler;

public class Problem43
{
	public static void main(String[] args)
	{
		long sum = 0;
		for (long i = 1000000000L; i < 9999999999L; i++)
		{
			if (i % 100000000L == 0)
			{
				System.out.println(i);
			}
			if (isPandigital(Long.toString(i)))
			{
				String n = Long.toString(i);
				if (Long.parseLong("" + n.charAt(1) + n.charAt(2) + n.charAt(3)) % 2 == 0 && Long.parseLong("" + n.charAt(2) + n.charAt(3) + n.charAt(4)) % 3 == 0 && Long.parseLong("" + n.charAt(3) + n.charAt(4) + n.charAt(5)) % 5 == 0 && Long.parseLong("" + n.charAt(4) + n.charAt(5) + n.charAt(6)) % 7 == 0 && Long.parseLong("" + n.charAt(5) + n.charAt(6) + n.charAt(7)) % 11 == 0 && Long.parseLong("" + n.charAt(6) + n.charAt(7) + n.charAt(8)) % 13 == 0 && Long.parseLong("" + n.charAt(7) + n.charAt(8) + n.charAt(9)) % 17 == 0)
				{
					sum += i;
					System.out.println(i);
				}
			}
		}
		System.out.println(sum);
	}

	public static boolean isPandigital(String num)
	{
		for (int i = 0; i < num.length(); i++)
		{
			if (!num.contains(Integer.toString(i)))
			{
				return false;
			}
		}
		return true;
	}
}
