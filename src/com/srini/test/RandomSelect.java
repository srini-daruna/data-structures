package com.srini.test;

public class RandomSelect {
	
	public static void main(String[] args)
	{
	    int A[] = {9,15,11,1,10,2,3};
	    
	    int loc = random_selection(A, 0,A.length-1,(A.length+1)/2);
	    System.out.println(" loc value is " + loc);

	    for(int i =0; i<A.length;i++)
	    	System.out.println(A[i]);
	}

	private static int random_selection(int[] arr, int start, int end, int k) {
		// TODO Auto-generated method stub
		   if(start == end)
		        return arr[start];

		    if(k ==0) return -1;
		    
		    if(start < end)
		    {
		    int mid = random_partition(arr, start, end);
		    System.out.println(" Mid value is " + mid);
		    int i = mid - start + 1;

		    if(i == k)
		        return arr[mid];
		    else if(k < i)
		        return random_selection(arr, start, mid-1, k);
		    else 
		        return random_selection(arr, mid+1, end, k-i);
		    }
			return k;
	}

	private static int random_partition(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
	    int pivotIdx = start + 3 % (end-start+1);

	    int pivot = arr[pivotIdx];

	    int temp = arr[end];
	    arr[end] = arr[pivotIdx];
	    arr[pivotIdx] = temp;
	    //swap(arr[pivotIdx], arr[end]); // move pivot element to the end

	    pivotIdx = end;

	    int i = start -1;

	    for(int j=start; j<=end-1; j++)

	    {

	        if(arr[j] <= pivot)

	        {

	            i = i+1;
	            temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	            //swap(arr[i], arr[j]);

	        }

	    }

		temp = arr[pivotIdx];
		arr[pivotIdx] = arr[i+1];
		arr[i+1] = temp;
		//swap(arr[i+1], arr[pivotIdx]);

	    return i+1;
	}

}
