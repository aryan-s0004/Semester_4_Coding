package Sliding_Windows;

// PROBLEM
// -------
// Find the maximum sum of a subarray of size K.

// PATTERN
// -------
// Fixed Sliding Window

// SAMPLE INPUT
// ------------
// arr = [2,1,5,1,-3,-2]
// k = 3

// SAMPLE OUTPUT
// -------------
// 8

// EXPLANATION
// -----------
// Subarray with maximum sum = [2,1,5]
// Sum = 8

// TIME COMPLEXITY
// ---------------
// O(n)

// SPACE COMPLEXITY
// ----------------
// O(1)

public class MaxSumSubarrayOfSizeK {

    public static int maxSum(int[] arr, int k){

        // Edge case: invalid array or window size
        if(arr == null || arr.length < k || k <= 0)
            return -1;

        int windowSum = 0;

        // Calculate first window sum
        for(int i = 0; i < k; i++)
            windowSum += arr[i];

        int maxSum = windowSum;

        // Slide the window
        for(int right = k; right < arr.length; right++){

            // Add next element
            windowSum += arr[right];

            // Remove element leaving the window
            windowSum -= arr[right - k];

            // Update maximum sum
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args){

        int[] arr = {2,1,5,1,-3,-2};
        int k = 3;

        int result = maxSum(arr, k);

        System.out.println("Maximum Sum: " + result);
    }
}