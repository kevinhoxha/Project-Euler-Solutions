package euler;

public class Problem33 
{
	public static void main(String[] args)
	{
		int num = 1;
		int denom = 1;
		for (double i = 10.0; i < 100.0; i++)
		{
			for (double k = 99.0; k > i; k--)
			{
				if (i % 10 == 0 && k % 10 == 0)
				{
					continue;
				}
				else if (Double.toString(i).charAt(0) == Double.toString(k).charAt(0))
				{
					double newNum = ((int)(i)) - (((int)(i))/10) * 10;
					double newDenom = ((int)(k)) - (((int)(k))/10) * 10;
					if (i/k == newNum/newDenom && i/k != 1.0)
					 {
						 num *= i;
						 denom *= k;
						 System.out.println(i + "/" + k);
					 }
				}
				else if (Double.toString(i).charAt(0) == Double.toString(k).charAt(1))
				{
					double newNum = ((int)(i)) - (((int)(i))/10) * 10;
					double newDenom = ((int)(k))/10; 
					if (i/k == newNum/newDenom && i/k != 1.0)
					 {
						 num *= i;
						 denom *= k;
						 System.out.println(i + "/" + k);
					 }
				}
				else if (Double.toString(i).charAt(1) == Double.toString(k).charAt(0))
				{
					double newNum = ((int)(i))/10;
					double newDenom = ((int)(k)) - (((int)(k))/10) * 10; 
					if (i/k == newNum/newDenom && i/k != 1.0)
					 {
						 num *= i;
						 denom *= k;
						 System.out.println(i + "/" + k);
					 }
				}
				else if (Double.toString(i).charAt(1) == Double.toString(k).charAt(1))
				{
					double newNum = ((int)(i))/10; 
					double newDenom = ((int)(k))/10;
					if (i/k == newNum/newDenom && i/k != 1.0)
					 {
						 num *= i;
						 denom *= k;
						 System.out.println(i + "/" + k);
					 }
				}
			}
		}
		System.out.println(num + "/" + denom);
	}
}
