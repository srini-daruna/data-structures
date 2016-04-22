package com.srini.dynamic;

public class MaxSumBrute {
    
    public static int[] input = {-1,2,-4,5,2,-3,6};
    
    public static void main(String... args)
    {
	// TODO
	int currentSum = 0;
	int[] targetSequence = new int[input.length];
	
	for(int i = 0,j=0; i < input.length ; i++)
	{
	    if(currentSum < (currentSum+ input[i])){
		   currentSum = currentSum+input[i];
		   targetSequence[j++] = input[i];
	    }
	}
	
	System.out.println("Max Sum that we got is " + currentSum);
	
	System.out.println(" Target Sequence is ");
	for(int i = 0;(i<targetSequence.length && targetSequence[i] != 0 );i++)
	{
	    System.out.print(" - " + targetSequence[i]);
	}
	
    }

}
