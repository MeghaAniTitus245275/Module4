package array;

import java.util.Arrays;

public class Array2 {
	public static void main(String args[])
	{
	int a[]=	method();
	System.out.println(Arrays.toString(a));
		
	}
	public static int[] method()
	{
		int a[]= {-1,-1};
		int b[]= {2,3,4,4,1};
		int c=4;
		int count=0;
	//int d[]=new int[3];
		for(int i=0;i<b.length;i++)
		{
			if(c==b[i])
			{
				count++;
			}
			
		}
		
		if(count==0)
		{
			return a;
		}
		else
		{
			int d[]=new int[count];
			int k=0;
			for(int i=0;i<b.length;i++)
			{
				if(c==b[i])
				{
					d[k]=i;
					k++;
				}
				
			}
			return d;
			
		}
		
	}

}
