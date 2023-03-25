/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject5;

import static com.mycompany.mavenproject5.Binarysearch.runBinarySearchIteratively;
import static com.mycompany.mavenproject5.Bubblesort.bubbleSort;



/**
 *
 * @author mdinu
 */
public class Main {

    public static void main(String[] args) {
        //Binary search
    int[] sortedArray = {2, 6, 11, 17, 19};
    int key = 11;
    int low = 0;
    int high = sortedArray.length - 1;
    int index = runBinarySearchIteratively(sortedArray, key, low, high);
    System.out.println("Index of " + key + " is: " + index);
    
    //Bubble sort
    int[] arr = {8, 77, 25, 67, 22, 90, 770}; 
        bubbleSort(arr, arr.length); 
        System.out.println("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    
    
    }
}