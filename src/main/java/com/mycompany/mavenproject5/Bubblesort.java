/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject5;

/**
 *
 * @author mdinu
 */


/**
 *
 * @author MoaathAlrajab
 */
public class Bubblesort {

   public static void bubbleSort(int[] arr, int size) {
        int n = size; // Get the length of the input array
        // Loop through the input array n - 1 times
        for (int i = 0; i < n - 1; i++) {
            // Loop through the input array up to n - i - 1 times
            // This is because after each iteration of the outer loop, the largest element is placed at the end of the array
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements and swap them if they are in the wrong order
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    
}