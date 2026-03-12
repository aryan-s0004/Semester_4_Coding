package Sliding_Windows;

import java.util.*;

class SmallestSubarrayWithSumGreaterThanK {

    // PROBLEM DESCRIPTION
    // -------------------
    // Find the length of the smallest subarray
    // whose sum is greater than K.

    // SAMPLE INPUT
    // ------------
    // arr = [2,1,5,2,3,2]
    // k = 7

    // SAMPLE OUTPUT
    // -------------
    // 2

    // EXPLANATION
    // -----------
    // Smallest subarray with sum > 7 is [5,2]
    // Length = 2

    // TIME COMPLEXITY
    // ---------------
    // O(n)

    // SPACE COMPLEXITY
    // ----------------
    // O(1)

    public static int smallestSubarray(int[] arr, int k){

        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for(int right = 0; right < arr.length; right++){

            // expand window
            sum += arr[right];

            // shrink window when condition satisfied
            while(sum > k){

                minLength = Math.min(minLength, right - left + 1);

                sum -= arr[left];
                left++;
            }
        }

        if(minLength == Integer.MAX_VALUE)
            return 0;

        return minLength;
    }

    public static void main(String[] args) {

        int[] arr = {2,1,5,2,3,2};
        int k = 7;

        int result = smallestSubarray(arr, k);

        System.out.println(result);
    }
}