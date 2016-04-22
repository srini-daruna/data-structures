package com.srini.dynamic;

public class LeastCommonSequence {
    
    public static void main(String... args)
    {
	int[] X = {1,3,4,2,7,9};
	int[] Y = {7,2,4,2,5,9};
	int[][] LCS = new int[X.length+1][Y.length+1];
	int m = X.length;
	int n = Y.length; 
	
	for(int i = 0; i <=X.length ; i++)
	{
	    LCS[i][Y.length] = 0;
	}
	
	for(int i = 0; i <=Y.length ; i++)
	{
	    LCS[X.length][i] = 0;
	}
	
	for(int i = m-1; i >=0; i--)
	{
	    for(int j = n-1; j>=0; j--)
	    {
		LCS[i][j] = LCS[i+1][j+1];
		
		if(X[i] == Y[j])
		{
		    LCS[i][j]++;
		    System.out.println(X[i]);
		}
		
		if(LCS[i][j+1] > LCS[i][j])
		    LCS[i][j] = LCS[i][j+1];
		
		if(LCS[i+1][j] > LCS[i][j])
		    LCS[i][j] = LCS[i+1][j];
		
	    }
	}

	
	System.out.println(" what ever it is " + LCS[0][0]);
	
	
	
    }

}


