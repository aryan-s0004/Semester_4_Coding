package Sliding_Windows;

public class FixedWindowTemplate {

    // 🔹 1. Maximum Sum of Subarray of Size K
    public static int maxSum(int[] arr, int k) {

        if (arr.length < k) return -1;

        int windowSum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int max = windowSum;

        // Slide window
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i];
            windowSum -= arr[i - k];
            max = Math.max(max, windowSum);
        }

        return max;
    }


    // 🔹 2. Minimum Sum of Subarray of Size K
    public static int minSum(int[] arr, int k) {

        if (arr.length < k) return -1;

        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int min = windowSum;

        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i];
            windowSum -= arr[i - k];
            min = Math.min(min, windowSum);
        }

        return min;
    }


    // 🔹 3. Maximum Average of Subarray of Size K
    public static double maxAverage(int[] arr, int k) {

        if (arr.length < k) return -1;

        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        double maxAvg = (double) windowSum / k;

        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i];
            windowSum -= arr[i - k];
            maxAvg = Math.max(maxAvg, (double) windowSum / k);
        }

        return maxAvg;
    }


    // 🔹 4. Count Negative Numbers in Each Window (returns max negatives in any window)
    public static int maxNegativeCount(int[] arr, int k) {

        if (arr.length < k) return -1;

        int count = 0;

        // First window
        for (int i = 0; i < k; i++) {
            if (arr[i] < 0) count++;
        }

        int maxCount = count;

        // Slide window
        for (int i = k; i < arr.length; i++) {

            if (arr[i] < 0) count++;         // add new
            if (arr[i - k] < 0) count--;     // remove old

            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }


    // 🔥 MAIN METHOD
    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2, -4, -1};
        int k = 3;

        System.out.println("Maximum Sum: " + maxSum(arr, k));
        System.out.println("Minimum Sum: " + minSum(arr, k));
        System.out.println("Maximum Average: " + maxAverage(arr, k));
        System.out.println("Max Negatives in Window: " + maxNegativeCount(arr, k));
    }
}