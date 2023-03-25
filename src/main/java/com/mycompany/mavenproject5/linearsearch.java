/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject5;

/**
 *
 * @author mdinu
 */
public class linearsearch {
    
    public static int search(int arr[], int x)
    {
      int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i; // return the index of the first occurrence of x
            }
        }
        return -1; // x not found in the array
    }
    
   }


