package com.srini.sort;

public class QuickSort {
    public static void main(String args[])
    {
	int[] input = {12, 6, 7, 3, 4, 1, 8};
	System.out.println(" Array before sort ");
	
	for(int i =0; i < input.length; i++ )
	    System.out.print(" " + input[i]);
	
	System.out.println();
	System.out.println(" After sort ");
	
	quickSort(input,0,input.length-1);
	
	for(int i =0; i < input.length; i++ )
	    System.out.print(" " + input[i]);
	
	
    }
    public static void quickSort(int[] array, int low, int high)
    {
	int pivot = array[(low+high)/2];
	int temp;
	int first = low;
	int last = high;
	
	/*System.out.println(" Array came for sort ");
	   for(int j =low; j<=high; j++)
	    System.out.println(" " + array[j]);
	*/
	if(low >= high)
	    return;
	
	while(low < high)
	{
	    while(low < high && array[low] < pivot)
	    {
		low++;
	    }
	    
	    while(high > low && array[high] > pivot)
	    {
		high--;
	    }
	    
	    if(low < high)
	    {
		temp = array[low];
		array[low] = array[high];
		array[high] = temp;
	    }
	    if(pivot == array[low] && pivot == array[high])
		break;
	    
	}
	
	if(low >= high)
	{
	    temp = low;
	    low = high;
	    high = temp;
	}
	
	quickSort(array, first, low);
	quickSort(array, low+1, last);
	
    }

}
