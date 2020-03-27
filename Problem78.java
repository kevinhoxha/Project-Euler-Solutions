package euler;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Problem78
{
	private static final Map<Long, BigInteger> CALCULATED_VALUES = new HashMap<>(100000);
	
	public static void main(String[] args)
	{
		CALCULATED_VALUES.put(0L, BigInteger.valueOf(1));
		CALCULATED_VALUES.put(1L, BigInteger.valueOf(1));
		CALCULATED_VALUES.put(2L, BigInteger.valueOf(2));
		CALCULATED_VALUES.put(3L, BigInteger.valueOf(3));
		CALCULATED_VALUES.put(4L, BigInteger.valueOf(5));
		CALCULATED_VALUES.put(5L, BigInteger.valueOf(7));
		for (long n = 6; ; n++)
		{
			BigInteger num = getNumPartitions(n);
			CALCULATED_VALUES.put(n, num);
			if(n % 1000 == 0)
			{
				System.out.println(n + " --> " + num);
			}
			if (num.remainder(BigInteger.valueOf(1000000)).equals(BigInteger.valueOf(0)))
			{
				System.out.println("The answer is " + n + ".");
				break;
			}
		}
		
		/*
		for (int n = 1; ; n++)
		{
			long start = System.currentTimeMillis();
			Set<Partition> p = getPartitions(n);
			long end = System.currentTimeMillis();
			System.out.println(n + " --> " + (end-start));
			if (p.size() % 1000000 == 0)
			{
				System.exit(0);
			}
		}
		*/
	}
	
	public static Set<Partition> getPartitions(int n)
	{ 
		if (n == 1)
		{
			return new HashSet<Partition>(Arrays.asList(new Partition(new int[] {1})));
		}
		else
		{
			Set<Partition> n_1Part = getPartitions(n - 1);
			Set<Partition> nPart = new HashSet<>();
			for (Partition p : n_1Part)
			{
				for (int k = 0; k < n; k++)
				{
					int[] newPart = p.cloneUp();
					newPart[k] += 1;
					nPart.add(new Partition(newPart));
				}
			}
			return nPart;
		}
	}
	
	public static BigInteger getNumPartitions(long n)
	{
		//System.out.println("boo");
		if (n < 0)
		{
			return BigInteger.valueOf(0);
		}
		else if (CALCULATED_VALUES.containsKey(n))
		{
			return CALCULATED_VALUES.get(n);
		}
		else
		{
			BigInteger num = BigInteger.valueOf(0);
			for (long k = 1; k < n; k++)
			{
				BigInteger a = null;
				BigInteger b = null;
				final long high = n - k * (3 * k - 1) / 2;
				final long low = n - k * (3 * k + 1) / 2;
				
				if (high < 0)
				{
					a = BigInteger.valueOf(0);
				}
				else if (!CALCULATED_VALUES.containsKey(high))
				{
					a = getNumPartitions(high);
					CALCULATED_VALUES.put(high, a);
				}
				else
				{
					a = CALCULATED_VALUES.get(high);
				}
				
				if (low < 0)
				{
					b = BigInteger.valueOf(0);
				}
				else if (!CALCULATED_VALUES.containsKey(low))
				{
					b = getNumPartitions(low);
					CALCULATED_VALUES.put(low, b);
				}
				else
				{
					b = CALCULATED_VALUES.get(low);
				}
				num = num.add(BigInteger.valueOf((long)(Math.pow(-1, k + 1))).multiply(a.add(b))); 
			}
			return num;
		}
	}
	
	public static class Partition 
	{
		private int[] partition;

		public Partition(int[] p)
		{
			this.partition = p;
			Arrays.sort(this.partition);
		}

		public int[] getPartition()
		{
			return this.partition;
		}
		
		public int[] cloneUp()
		{
			return Arrays.copyOf(this.partition, this.partition.length + 1);
		}

		@Override
		public int hashCode()
		{
			final int prime = 31;
			int result = 1;
			result = prime * result + Arrays.hashCode(partition);
			return result;
		}

		@Override
		public boolean equals(Object obj)
		{
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Partition other = (Partition) obj;
			if (!Arrays.equals(partition, other.partition))
				return false;
			return true;
		}

	}

}
