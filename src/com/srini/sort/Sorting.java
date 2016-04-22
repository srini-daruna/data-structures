package com.srini.sort;

/** Bubble Sort Technique **/

public class Sorting {
    
    public static void main(String args[])
    {
	int[] array = {7 , 6, 12, 5, 8, 15 , 9};
	
	
	
	for(int i = 0; i < array.length; i++)
	    System.out.print(array[i] + " ");
	
	//  Bubble Sort technique
	//System.out.println("Bubble Sort Basic");
	//array = BubbleSortBasic(array);
	
	System.out.println();
	//  Bubble Sort Improved
	//array = BubbleSortImproved(array);
	//System.out.println("Bubble Sort Improved");
	
	//  Selection Sort 
	System.out.println("Selection Sort");
	array = SelectionSort(array);
		
	for(int i = 0; i < array.length; i++)
	    System.out.print(array[i] + " ");
    }

    public static int[] BubbleSortBasic(int[] arr)
    {
	int temp;
	for(int i = arr.length-1 ; i >=0 ; i--)
	{
	    for(int j = 0; j < i ; j++)
	    {
		if(arr[j] < arr[j+1])
		{
		    temp = arr[j];
		    arr[j] = arr[j+1];
		    arr[j+1] = temp;
		}
	    }
	}
	
	return arr;
    }
    
    public static int[] BubbleSortImproved(int[] arr)
    {
	int temp;
	boolean swapped = true;
	
	for(int i = arr.length-1; i >= 0 && swapped ; i--)
	{
	    swapped = false;
	    
	    for(int j = 0; j < i ; j++)
	    {
		if(arr[j] > arr[j+1])
		{
		    temp = arr[j];
		    arr[j] = arr[j+1];
		    arr[j+1] = temp;
		    
		    swapped = true;
		}
	    }
	}
	
	return arr;
    }
    
    public static int[] SelectionSort(int[] arr)
    {
	int min = 0;
	int temp;
	
	for(int i = 0; i < arr.length-1 ; i++  )
	{
	    min = i;
	    for(int j = i+1; j< arr.length ; j++)
	    {
		if(arr[min] > arr[j])
		{
		    min = j;
		}
	    }
	    
	    if(min != i)
	    {
		temp = arr[i];
		arr[i] = arr[min];
		arr[min] = temp;
	    }
	}
	
	return arr;
    }
}
