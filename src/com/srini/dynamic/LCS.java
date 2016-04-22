package com.srini.dynamic;

import java.util.Scanner;
 
public class LCS {  
 
    public static int LLCS[][];
    public static String x, y;
 
    public static void main(String[] args) {
        Scanner iFile = new Scanner(System.in);
 
        x = iFile.next();
        y = iFile.next();
 
        buildMatrix();
 
        System.out.printf("\"%s\", %d\n", getLCS(), getLLCS());
        
        iFile.close();
    }
 
    public static String getLCS() {
        int i, m = LLCS.length-1;
        int j, n = LLCS[0].length-1;
        i = m;
        j = n;
 
        int pos = LLCS[m][n];
        char ans[] = new char[pos];
 
        while(pos > 0) {
            if(x.charAt(i-1) == y.charAt(j-1)) {
                // if the same
                ans[--pos] = x.charAt(i-1);
                i--; j--;
                //System.out.println("\tTie");
            }
            else {
                //System.out.println("\tNot Tie");
                int topValue = LLCS[i-1][j];
                int leftValue = LLCS[i][j-1];
 
                if(topValue >= leftValue)
                    i--;
                else
                    j--;
            }
        }
 
        return new String(ans);
    }
 
    public static int getLLCS() {
        int m = x.length() + 1;
        int n = y.length() + 1;
 
        return LLCS[m-1][n-1];
    }
 
    public static void buildMatrix() {
        int m = x.length() + 1;
        int n = y.length() + 1;
 
        LLCS = new int[m][n];
 
        for(int i = 1; i < m; i++)
            for(int j = 1; j < n; j++)
                if(Character.toLowerCase(x.charAt(i-1)) == Character.toLowerCase(y.charAt(j-1)))
                    LLCS[i][j] = 1 + LLCS[i-1][j-1];
                else
                    LLCS[i][j] = Math.max(LLCS[i-1][j], LLCS[i][j-1]);
    }
 
}
