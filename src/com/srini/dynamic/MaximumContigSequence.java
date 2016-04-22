package com.srini.dynamic;

public class MaximumContigSequence {
    
    public static void main(String... args)
    {
	
	int maxSum = 0;
	int[] input = {-1, 3, 4, -2, 3, -2};
	int[] M = new int[input.length + 1];
	
	if(input[0] >0){
	    M[0] = input[0];
	}
	
	for(int i =1; i <input.length ; i++)
	{
	    System.out.print("    --     " + input[i]);
	    if(M[i-1] + input[i] > 0 )
		M[i] = M[i-1] + input[i];
	    else
		M[i] = input[i];
	}
	
	maxSum= M[0];
	
	for(int i =0; i<input.length;i++)
	{
	    //System.out.println(" M [" + i + "]  is "  + M[i]);
	    if(M[i] > maxSum)
		maxSum = M[i];
	}
	System.out.println(" Max Sum is" + maxSum);
    }

}
