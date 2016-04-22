package com.srini.test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoogleQuestion2 {
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
		
		QuickSort(a,0,list.length()-1);
		
		System.out.println( " Array after sorted ");
		
		for(i =0;i<list.length();i++)
			System.out.print(a[i]);
		
	}
	
	private static void QuickSort(int[] a, int lower, int length) {
		// TODO Auto-generated method stub
		int first = lower, last = length;
		
		int tmp;
		if(first >= last)
			return;
		
		int pivot = a[(first+last)/2];
		while(first < last)
		{
			while(first < last && a[first] < pivot)
				first++;
			
			while(first < last && a[last] > pivot)
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
		
	}

}
