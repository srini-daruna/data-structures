package com.srini.sort;

public class CountingSort {
    
    public static void main(String[] args)
    {
		int[] array = {1,4,5,3,6,4,8,7};
		int[] temp = new int[9];
		int[] sorted = new int[array.length+1];
	
		for(int i=0;i<array.length;i++)
			temp[array[i]] = temp[array[i]]+1;
	
		System.out.println(" temp ");
		for(int i =1;i<temp.length;i++)
			System.out.print(" " + temp[i]);
	

		for(int i =1;i<temp.length;i++)
			temp[i] = temp[i-1]+temp[i];
	
		System.out.println(" temp ");

		for(int i =1;i<temp.length;i++)
			System.out.print(" " + temp[i]);
	
		for(int i = array.length-1;i>=0;i--)
		{
		    System.out.println(" array[i] " + array[i]);
		    System.out.println(" temp[array[i]] " + temp[array[i]]);
		    	sorted[temp[array[i]]-1] = array[i];
			temp[array[i]] = temp[array[i]] - 1;
		}
		
		System.out.println(" -- ");
		
		for(int a:sorted)
		    System.out.println(a);
    }
    

}
