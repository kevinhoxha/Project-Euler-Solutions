package euler;

public class Problem45
{
	public static void main(String[] args)
	{
		long count = 0;
		long currentTri = 0;
		while (true)
		{
			count++;
			currentTri = count * (count + 1) / 2;
			if (isPentagonal(currentTri) && isHexagonal(currentTri))
			{
				System.out.println(currentTri);
			}
		}
	}
	
	public static boolean isPentagonal(long num)
	{
		double x = (1 + Math.sqrt(1 - 4 * 3 * (-2 * num)))/6;
		return x % 1 == 0;
	}
	
	public static boolean isHexagonal(long num)
	{
		double x = (1 + Math.sqrt(1 - 4 * 2 * (-num)))/4;
		return x % 1 == 0;
	}
}
