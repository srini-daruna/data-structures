package com.srini.test;
public class InsertionSort {

	public static void main(String[] args) {

		int values[] = { 5, 4, 8, 6, 2 };

		System.out.print("\nBefore sort : ");
		printArray(values);

		insertionSort(values);

		System.out.print("\nAfter sort : ");
		printArray(values);
	}

	private static void insertionSort(int[] array) {
		int i,key;
		for (int j = 1; j < array.length; j++) {
			key = array[j];
			
			for(i = j-1; (i>=0 && array[i] > key); i--){
				array[i+1] = array[i];
				
			}
			array[i+1] = key;
			System.out.println();
		}
	}
	
	
	/*private static void insertionSort(int[] array) {
		  int i;
		  for (int j = 1; j < array.length; j++) {
		   int key = array[j];
		   for (i = j - 1; (i >= 0) && (array[i] > key); i--) {
		    array[i + 1] = array[i];
		   }
		   array[i + 1] = key;
		  }
		 }
*/
	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}
}