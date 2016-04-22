package com.srini.test;

public class Separation {
    
  	public static void main(String[] args)
  	{
  	    int[] array = {5, 7, 13 ,3 };
  	    for(int i =0;i<array.length;i++)
  		System.out.print("  " + array[i] );
  	    
  	    System.out.println(" after changes ");
  	    int[] array2 = partition(array);
  	  for(int i =0;i<array.length;i++)
		System.out.print("  " + array2[i] );
	    
  	    
  	}

  	public static int[] partition(int[] arr)
  	{
  	    int low = 0;
  	    int count = 0;
  	    int high = arr.length-1;
  	    int temp;
  	    while(low < high)
  	    {
  		count++;
  		while(low<high && (arr[low]%2 ==0))
  		    low++;
  		
  		while(low<high && (arr[high]%2 ==1))
  		    high--;
  		
  		if(low<high)
  		{
  		    temp = arr[low];
  		    arr[low] = arr[high];
  		    arr[high] = temp;
  		}
  	    }
  	    
  	    System.out.println(" total number of times " + count);
  	    return arr;
  	}
}
