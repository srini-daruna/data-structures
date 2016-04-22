package com.srini.test;

public class MergeOwn
{
	public static int[] array = {20, 6, 5 ,6, 12, 3, 6, 9};
	public static int[] array2 = new int[array.length];
		
	public static void main(String args[])
	{
		
		for(int i =0; i < array.length; i++)
			System.out.print(" " + array[i]);
			
		mergeSort(0, array.length-1);
		
		for(int i =0; i < array.length; i++)
			System.out.print(" " + array[i]);
		
	}
	
	public static void mergeSort(int low, int high)
	{
		if(low < high)
		{
			int mid = (low+high)/2;
			mergeSort(low, high);
			mergeSort(mid+1, high);
			merge(low, mid, high);
		}
	}
	
	public static void merge(int low, int mid, int high)
	{
		int i = low;
		int j = mid+1;
		int k = low;
		
		for(;i<=mid && j<=high;)
		{
			if(array[i] <= array[j])
				array2[k++] = array[i++];
			else
				array2[k++] = array[j++];
		}
		
		for(k = i; i <= mid; k++)
			array2[k++] = array[i++];
		for(k = j ; k <= high; k++)
			array2[k++] = array[j++];
			
		for(i = low; i <=high;i++)
			array[i] = array2[i];
	}
	
}
