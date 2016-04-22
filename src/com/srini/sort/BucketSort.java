package com.srini.sort;

public class BucketSort
{
	public static void main(String... args)
	{
		int[] array = {4,5,2,5,8,3,9};
		int[] bucket = new int[10];

		for(int i = 0; i< bucket.length;i++)
			bucket[i] = 0;
		
		System.out.println(" Initial Array " );

		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i] + " " );
			bucket[array[i]]++;
		}
		System.out.println(" ");

		for(int i=0,j=0 ; j<bucket.length;j++)
		{
			for(int k=bucket[j];k>0;k--)
				array[i++] = j;
		}

		System.out.println(" Modified Array " );

		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i] + " " );
			bucket[array[i]]++;
		}
		System.out.println(" ");

	}

}