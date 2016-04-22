package com.srini.test2;

public abstract class Solution {
    
    public static void main(String... args)
    {
	int[] input = {1,5,6,2,4,7};
	input = sortArray(input);
	for(int i = 0; i<input.length ;i++)
	   {
	    System.out.println(" -- " + input[i]);
	   }
    }
    
    
    public static int[] sortArray(int[] input) {
	
	
	int[] a = new int[input.length/2];
	int[] b = new int[input.length - (input.length)/2];
	
	for(int i = 0; i< input.length/2; i++)
	{
	    a[i] = input[i];
	    System.out.println(a[i] + "--");
	}
	

	
	for(int i = (input.length-(input.length)/2),j=0; i<input.length; i++,j++)
	{
	    b[j] = input[i];
	    System.out.println(b[j] + "--");
	}
	
	    int[] answer = new int[a.length + b.length];
	    int i = 0, j = 0, k = 0;

	    while (i < a.length && j < b.length)
	    {
	        if (a[i] < b[j])       
	            answer[k++] = a[i++];

	        else        
	            answer[k++] = b[j++];               
	    }

	    while (i < a.length)  
	        answer[k++] = a[i++];


	    while (j < b.length)    
	        answer[k++] = b[j++];

	    
	    for(int l =0 ; l<answer.length ; l++)
		System.out.print(answer[l]);
	    return answer;
	    
	}

}
