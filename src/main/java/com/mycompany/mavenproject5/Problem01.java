/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject5;

/**
 *
 * @author mdinu
 */
public class Problem01 {
    

    
    public static long getSumOfPrimes(int n){
     long sum = 0; // initialize the sum to 0
        for (int i = 2; i <= n; i++) { // iterate over all numbers from 2 to n
            if (isPrime(i)) { // check if the number is prime
                sum += i; // if it is prime, add it to the sum
            }
        }
        return sum; // return the sum of prime numbers
    }

   
    private static boolean isPrime(int n) {
        
        if (n <= 1) { // 1 and below are not prime
            return false;
        }
       
        for (int i = 2; i <= Math.sqrt(n); i++) { // check divisibility by numbers from 2 to sqrt(n)
            if (n % i == 0) { // if n is divisible by i, it's not prime
                return false;
            }
        }
        
        return true; // n is prime
    }
    }
        
    
