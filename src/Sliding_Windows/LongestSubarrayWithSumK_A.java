import java.util.*;

public class LongestSubarrayWithSumK_A {

    // Problem Description:
    // Variation of longest subarray with sum K.
    // Used for practicing hashmap or prefix sum approach.

    // Sample Input:
    // arr = [10,5,2,7,1,9]
    // k = 15

    // Sample Output:
    // 4

    public static int longestSubarray(int[] arr, int k) {

        // HashMap stores prefixSum -> first index
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

            // Case 2: check if prefixSum-k exists
            if (map.containsKey(prefixSum - k)) {

                int length = i - map.get(prefixSum - k);
                maxLength = Math.max(maxLength, length);
            }

            // Store prefix sum if first occurrence
            map.putIfAbsent(prefixSum, i);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read array size
        int n = sc.nextInt();

        // Edge case: empty array
        if (n <= 0) {
            System.out.println(0);
            return;
        }

        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Read target sum
        int k = sc.nextInt();

        int result = longestSubarray(arr, k);

        // Print result
        System.out.println(result);

        sc.close();
    }
}