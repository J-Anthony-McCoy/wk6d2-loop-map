package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Numbers {

//        Write a program that does the following:
//        Asks the user for 5 numbers
//        Stores them in an array list
//        Finds the sum, product, largest, and smallest of those numbers

//  METHOD
    public static void FiveNumbers() {

        Scanner input = new Scanner(System.in);

//       FOR LOOP TO GATHER USER INPUT

        Integer[] numArr = new Integer[5];
        for(int i = 0; i < numArr.length; i++) {
            System.out.println("Enter a number. There will be five total input one at a time.");
            numArr[i] = input.nextInt();
        }

//       PRINTS OUT ALL INTEGERS IN ARRAY
        System.out.println("Your numbers are: " + Arrays.toString(numArr));

//       SUM
        int sum = 0;
        for(int i = 0; i < numArr.length; i++){
            sum = sum + numArr[i];
        }
        System.out.println("The sum of your array is: " + sum);

//       PRODUCT
        int prod = 1;
        for(int i = 0; i < numArr.length; i++){
           prod = prod * numArr[i];
        }
        System.out.println("The product of your array is: " + prod);

//        MAX
        int max = Collections.max(Arrays.asList(numArr));
        System.out.println("The max number is: " + max);

//        MIN
        int min = Collections.min(Arrays.asList(numArr));
        System.out.println("The minimum number is: " + min);

    }
}
