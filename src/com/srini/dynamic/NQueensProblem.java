package com.srini.dynamic;

import java.util.Scanner;

public class NQueensProblem {

    private static int[] board;
    private static int s = 0;

    static boolean unsafe(int y) {
	int x = board[y];
	for (int i = 1; i <= y; i++) {
	    int t = board[y - i];
	    if (t == x ||  // Check if queens are on same row
		    t == x - i || t == x + i) {  // Check if they are on same diagonal  
		return true;
	    }
	}

	return false;
    }

    public static void putboard() {
	System.out.println("\n\nSolution " + (++s));
	for (int y = 0; y < board.length; y++) {
	    for (int x = 0; x < board.length; x++) {
		System.out.print((board[y] == x) ? "|Q" : "|_");
	    }
	    System.out.println("|");
	}
    }

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println(" Enter n for n*n chess board");
	int n = scanner.nextInt();
	board = new int[n];

	int y = 0;
	board[0] = -1;

	for(; y>=0;){
	    do {
		board[y]++;
	    } while ((board[y] < board.length) && unsafe(y));
	    
	    if (board[y] < board.length) {
		if (y < board.length-1) {
		    board[++y] = -1;
		} else {
		    putboard();
		}
	    } else 
		y--;
	}
	
	scanner.close();
    }
}
