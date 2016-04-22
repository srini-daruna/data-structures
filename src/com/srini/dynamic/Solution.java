package com.srini.dynamic;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
        
        in.close();
    }
    
    private static long Solve(int n, int a, int b){
	int chocolatesForMoney = n/a;
	int totalChocolates = chocolatesForMoney;
	
	int totalWrappers = chocolatesForMoney;
	while(totalWrappers >= b)
	{
	    totalChocolates = totalChocolates + totalWrappers/b;
	    totalWrappers = totalWrappers/b + totalWrappers%b;
	    
	}
	
	return totalChocolates; 
    }
}
