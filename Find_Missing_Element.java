package com.jsp.Array;

import java.util.Arrays;

public class Find_Missing_Element {

	public static void main(String[] args) {
        int[] arr = {1, 2, 3,5, 3, 6}; // Array with a missing element
        int missingElement = findMissingElement(arr);
        System.out.println("Missing element: " + missingElement);
       

        
    }

    public static int findMissingElement(int[] arr) {
        Arrays.sort(arr); // Sort the array in ascending order
     
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1; // Return the first missing element
            }
        }

        return -1 ; // If no missing element is found, return -1
    }
}
