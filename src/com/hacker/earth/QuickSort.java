package com.hacker.earth;

public class QuickSort {

	public static void main(String[] args) {
		long[] input = {24,2,45,20,56,75,2,56,99,53,12};
		quickSort(input, 0, (input.length-1));
        for(long i:input){
            System.out.print(i);
            System.out.print(" ");
        }

	}
	
	private static void quickSort(long[] array, int lowerIndex, int higherIndex) {        
        int i = lowerIndex;
        int j = higherIndex;
        long pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        while (i <= j) {
            while (array[i] > pivot) {
                i++;
            }
            while (array[j] < pivot) {
                j--;
            }
            if (i <= j) {
            	long temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (lowerIndex < j)
            quickSort(array, lowerIndex, j);
        if (i < higherIndex)
            quickSort(array, i, higherIndex);
    }

}
