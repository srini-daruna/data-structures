package com.srini.test;
public class QuickSort {

 public static void main(String[] args) {
  
  int array[] = { 5,4,3,2,1 };
  
  System.out.print("Array before sorting : ");
  printArray(array);
  
  quickSort(array, 0, array.length - 1);
  
  System.out.print("Array after sorting : ");
  printArray(array);
 }

 public static void quickSort(int array[], int lower, int length) {

  if (lower >= length)
   return;
  int first = lower, last = length;
  int piv = array[(first + last) / 2]; // Picking pivot element

  while (first < last) {
	  // Searching for smaller element than pivot element
	  while (first < last && array[first] < piv)
		  first++;

	  // Searching for greater element than pivot element
	  while (first < last && array[last] > piv)
		  last--;
	  if (first < last) {
		  int tmp = array[first];
		  array[first] = array[last];
		  array[last] = tmp;
	  }
  }
  
  if (last < first) {
   int tmp = first;
   first = last;
   last = tmp;
  }
  // Calling recursive
  quickSort(array, lower, first);
  quickSort(array, first + 1 , length);
 }

 public static void printArray(int[] array) {
  for (int i : array) {
   System.out.print(i + ", ");
  }
  System.out.println();
 }
}

