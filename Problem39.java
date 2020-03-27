package euler;

public class Problem39
{
	public static void main(String[] args)
	{
		int maxNumSolutions = 0;
		int maxP = 0;
		int currentNum = 0;
		for (int p = 1; p <= 1000; p++)
		{
			currentNum = numSolutions(p);
			if (currentNum > maxNumSolutions)
			{
				maxNumSolutions = currentNum;
				maxP = p;
			}
		}
		System.out.println(maxP);
		System.out.println(maxNumSolutions);
	}
	
	public static int numSolutions(int p)
	{
		int numSolutions = 0;
		int isosceles = 0; 
		for (double a = 1.0; a < p; a++)
		{
			for (double b = 1.0; b < p; b++)
			{
				if (Math.sqrt(a*a + b*b) + a + b == p && a != b)
				{
					numSolutions++;
				}
				else if (Math.sqrt(a*a + b*b) + a + b == p && a == b)
				{
					isosceles++;
				}
			}
		}
		return numSolutions/2 + isosceles;
	}
}
