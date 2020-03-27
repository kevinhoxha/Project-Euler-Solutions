package euler;

public class Problem18 
{
	private static int[][] pyramid = {{75}, 
							   		  {95, 64}, 
							   		  {17, 47, 82}, 
							   		  {18, 35, 87, 10}, 
							   		  {20,  4, 82, 47, 65}, 
							   		  {19,  1, 23, 75, 03, 34}, 
							   		  {88,  2, 77, 73, 07, 63, 67}, 
							   		  {99, 65, 04, 28, 06, 16, 70, 92}, 
							   		  {41, 41, 26, 56, 83, 40, 80, 70, 33}, 
							   		  {41, 48, 72, 33, 47, 32, 37, 16, 94, 29}, 
							   		  {53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14}, 
							   		  {70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57,}, 
							   		  {91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48}, 
							   		  {63, 66, 04, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31}, 
							   		  { 4, 62, 98, 27, 23,  9, 70, 98, 73, 93, 38, 53, 60,  4, 23}};

	public static void main(String[] args)
	{
		int sum1 = 0;
		int sum2 = 0;
		for (int i = pyramid.length - 2; i >= 0; i--)
		{
			for (int k = 0; k < pyramid[i].length; k++)
			{
				sum1 = pyramid[i][k] + pyramid[i + 1][k];
				sum2 = pyramid[i][k] + pyramid[i + 1][k + 1];
				pyramid[i][k] = Math.max(sum1, sum2);
			}
		}
		System.out.println(pyramid[0][0]);
	}
}
