package com.srini.sort;

public class InsertionSort {
    
    public static void main(String[] args)
    {
	int[] array = { 12, 6, 3, 5, 20, 7, 4 , 2};
	
	System.out.println(" Array before Sort ");
	
	for(int i = 0; i < array.length; i++)
		System.out.print("  " + array[i]);
		
	System.out.println();
	
	array = insertionSort(array);
	
	System.out.println(" Array after Sort ");
	
	for(int i = 0; i < array.length; i++)
		System.out.print("  " + array[i]);
	
    }
    
    public static int[] insertionSort(int[] arr)
    {	
	int key;
	for(int i = 1; i < arr.length; i++)
	{
	    key = arr[i];
	    int j = i-1;
	    while(j >=0 && arr[j] > key)
	    {
		arr[j+1] = arr[j];
		j--;
	    }
	    
	    arr[j+1] = key;
	}
	
	return arr;
    }
}
