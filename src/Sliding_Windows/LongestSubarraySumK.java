package Sliding_Windows;

import java.util.HashMap;

public class LongestSubarraySumK {

    // Problem Description:
    // Given an array of integers and a number K,
    // find the length of the longest subarray whose sum equals K.

    // Sample Input:
    // arr = [2,1,3,2,4,3]
    // k = 11

    // Sample Output:
    // 4

    // Explanation:
    // Subarray [1,3,2,4,1] etc depending on array configuration.

    public static int longestSubarray(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int prefixSum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {

            // Update prefix sum
            prefixSum += arr[i];

            // Case 1: subarray from index 0
            if (prefixSum == k) {
                maxLength = i + 1;
            }

            // Case 2: check if (prefixSum - k) seen before
            if (map.containsKey(prefixSum - k)) {
                int length = i - map.get(prefixSum - k);
                maxLength = Math.max(maxLength, length);
            }

            // Store prefixSum only if first occurrence
            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {

        int[] arr = {2, 1, 3, 2, 4, 3};
        int k = 11;

        int result = longestSubarray(arr, k);

        System.out.println("Longest Length: " + result);
    }
}