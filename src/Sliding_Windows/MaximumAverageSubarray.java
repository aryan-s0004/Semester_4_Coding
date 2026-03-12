package Sliding_Windows;

/*
Find maximum average of subarray size k
Pattern : Fixed Window
TC : O(n)
SC : O(1)
*/

public class MaximumAverageSubarray {

    public static double findMaxAverage(int[] arr, int k){

        if(arr == null || arr.length < k) return 0;

        int windowSum = 0;

        for(int i=0;i<k;i++)
            windowSum += arr[i];

        int maxSum = windowSum;

        for(int i=k;i<arr.length;i++){

            windowSum += arr[i];
            windowSum -= arr[i-k];

            maxSum = Math.max(maxSum, windowSum);
        }

        return (double) maxSum/k;
    }
}