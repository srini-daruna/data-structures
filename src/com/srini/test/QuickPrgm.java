package com.srini.test;
import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;


public class QuickPrgm {
	public static void main(String[] args) throws IOException
	{
		System.out.println( " Enter numbers that you want to sort");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String list = br.readLine();
		int[] a = new int[list.length()];
		int i=0;
		for(i = 0;i<list.length();i++)
		{
			a[i] = Integer.parseInt(list.substring(i, i+1));
		}
		
		for(i =0;i<list.length();i++)
			System.out.println(" Integer at " + i + " is " + a[i]);
		
		QuickSort(a,0,list.length()-1);
		
		System.out.println( " Array after sorted ");
		
		for(i =0;i<list.length();i++)
			System.out.println(" Integer at " + i + " is " + a[i]);
		
	}
	
	private static void QuickSort(int[] a, int lower, int length) {
		// TODO Auto-generated method stub
		System.out.print(" Array came for sorting is ");
		for(int i = 0 ; i<=length;i++)
			System.out.print(a[i]);
			
		System.out.println();
		int first = lower, last = length;
		
		int tmp;
		if(first >= last)
			return;
		
		int pivot = a[(first+last)/2]; 
			//a[last];
			
		while(first < last)
		{
			while(first < last && a[first] < pivot)
				first++;
			
			while(first < last && a[last] >= pivot)
				last--;
			
			if(first < last)
			{
				tmp = a[first];
				a[first] = a[last];
				a[last] = tmp;
			}
		}
		
		if(first > last)
		{
			tmp = first;
			first = last;
			last = tmp;
		}
		
		QuickSort(a, lower, first);
		QuickSort(a, first+1, length);
	}
	

}
