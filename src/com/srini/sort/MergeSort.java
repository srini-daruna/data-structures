package com.srini.sort;

public class MergeSort {
    
    public static int[] array = { 20, 6, 4, 6, 8, 2};
    public static float arr[] = new float[array.length];
    public static float[] array2 = new float[array.length];
    
    public static void main(String[] args)
    {
	
	for(int i=0; i < array.length; i++)
	{
	    array2[i] = (array[i]) + (float)i/10;
 	    System.out.print(array2[i] + "  - ");
 	    
 	    System.out.print( Math.ceil(array2[i]) + " -- ");
 	    
	}
	
	mergeSort(0, array2.length-1);
	System.out.println();
	for(int i=0; i < array2.length; i++)
	    System.out.print( " " + array2[i]);
	
	
    }

    public static void mergeSort(int low, int high)
    {
	if(low < high)
	{
	    int mid = (low + high)/2;
	    mergeSort(low, mid);
	    mergeSort(mid+1, high);
	    merge(low, mid, high);
	}
	
    }
    
    public static void merge(int low, int mid, int high)
    {
	//System.out.println(" low is " + low + " mid is " + mid + " High is "+ high);
	int i = low;
	int j = mid+1;
	int k = low;
	
	while( i <= mid && j<= high)
	{
	    if((Math.ceil(array2[i])) < Math.ceil(array2[j]))
	    {
		arr[k] = array2[i];
		//System.out.println("from i arr " + k + " is " + arr[k]);
		i++;
	    }
	    else 	    
	    {
	    arr[k] = array2[j];
	    //System.out.println("from j arr " + k + " is " + arr[k]);
	    j++;
	    }
	    
	    k++;
	 }
	
	if(i > mid)
	{
	    for(int l = j; l <= high ; l++){
		arr[k] = array2[l];
		k++;}
	}else
	{
	    for(int l = i; l <=mid ; l++){
		arr[k] = array2[l];
		k++;
	    }
	}
	
	
	for(k = low; k<=high ; k++)
	{
	    //System.out.println(" replacing array " + k + " with array2");
	    array2[k] = arr[k];
	}
	
	/*System.out.println(" Array 2 is ");
	for(i=0; i<=high; i++)
	    System.out.print( "  " + arr[i]);
	
	System.out.println( " array " );
	for(int x=0; x < array.length ; x++)
	{
	    System.out.print( " " + array[x]);
	}*/
    }
  
}
