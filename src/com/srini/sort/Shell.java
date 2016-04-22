package com.srini.sort;

public class Shell
{
	public static void main(String[] args)
	{
		int[] array = { 12, 6, 3, 5, 20, 7, 4 , 2};
		
		System.out.println(" Array before Sort ");
		
		for(int i = 0; i < array.length; i++)
			System.out.print("  " + array[i]);
			
		System.out.println();
		
		array = shellSort(array);
		
		System.out.println(" Array after Sort ");
		
		for(int i = 0; i < array.length; i++)
			System.out.print("  " + array[i]);
		
		
	}
	
	public static int[] shellSort(int[] arr)
	{
		int temp = 0;
		int min;
		int gap;
		int j;
		
		for(gap = arr.length/2; gap >0 ; gap/=2)
		{
			for(int i = gap; i < arr.length; i++)
			{
				min = arr[i];
				j = i-1;
				while(j > gap)
				{
					if(arr[j-gap] < min)
						arr[j] = arr[j-gap];
						
					 j-=gap;
				}
				arr[j] = temp;
			}
		}
		
		return arr;
	}
}