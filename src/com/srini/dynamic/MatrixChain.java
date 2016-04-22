package com.srini.dynamic;

public class MatrixChain
{
   private int[][] m;
   private int[][] s;
   private int n;
   public MatrixChain(int[] p)
   {
	n = p.length - 1;	
	m = new int[n+1][n+1];	
	s = new int[n+1][n+1];	
	matrixChainOrder(p);	
   }

   private void matrixChainOrder(int[] p)
   {
	// Initial the cost for the empty subproblems.
	for (int i = 1; i <= n; i++)
	    m[i][i] = 0;

	// Solve for chains of increasing length l.
	for (int l = 2; l <= n; l++) {
	    for (int i = 1; i <= n-l+1; i++) {
		int j = i + l - 1;
		m[i][j] = Integer.MAX_VALUE;

		// Check each possible split to see if it's better
		// than all seen so far.
		for (int k = i; k < j; k++) {
		    int q = m[i][k] + m[k+1][j] + p[i-1] * p[k] * p[j];
		    if (q < m[i][j]) {
			// q is the best split for this subproblem so far.
			m[i][j] = q;
			s[i][j] = k;
		    }
		}
	    }
	}
   }

   private String printOptimalParens(int i, int j)
   {
	if (i == j)
	    return "A[" + i + "]";
	else
	    return "(" + printOptimalParens(i, s[i][j]) +
		printOptimalParens(s[i][j] + 1, j) + ")";
   }

   public String toString()
   {
	return printOptimalParens(1, n);
   }
}
