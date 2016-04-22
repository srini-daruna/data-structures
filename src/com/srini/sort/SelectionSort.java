package com.srini.sort;

/** Selection Sorting Program **/
public class SelectionSort {
    public static void main(String[] args)
    {
	int[] array = { 12, 6, 3, 5, 20, 7, 4 , 2};
	
	System.out.println(" Array before Sort ");
	
	for(int i = 0; i < array.length; i++)
		System.out.print("  " + array[i]);
		
	System.out.println();
	
	array = selectionSort(array);
	
	System.out.println(" Array after Sort ");
	
	for(int i = 0; i < array.length; i++)
		System.out.print("  " + array[i]);
	 
    }
    
    public static int[] selectionSort(int[] arr)
    {
	int min;
	int temp;
	for(int i = 0; i < arr.length-1; i++)
	{
	    min = i;
	    for(int j = i+1 ; j < arr.length; j++)
	    {
		if(arr[j] < arr[min])
		    min = j;
	    }
	    
	    temp = arr[i];
	    arr[i] = arr[min];
	    arr[min] = temp;
	    
	}
	
	return arr;
    }

}
