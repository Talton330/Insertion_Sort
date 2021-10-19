/*
Talton Frison
Software Engineering
October 10, 2021
Implementing the Insertion Sort Algorithm

 */
package com.company;
public class Main {
    public static void insertionSort(int array[]) {
        /*Function to sort array using insertion sort*/
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
             /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
    }

    public static void main(String args[]){
        // Unsorted Array
        int[] arr1 = {9,14,3,2,43,11,58,22};
        System.out.println("Before Insertion Sort");
        for(int i:arr1){
            // Print out unsorted array
            System.out.print(i+" ");
        }
        System.out.println();
        //sorting array using insertion sort
        insertionSort(arr1);
        //Sorted Array
        System.out.println("After Insertion Sort");
        for(int i:arr1){
            //Print out sorted array
            System.out.print(i+" ");
        }
    }
}