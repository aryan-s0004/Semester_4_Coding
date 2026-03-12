import java.util.*;

public class CountSubarrayWithSumK {

    // Problem Description:
    // Given an array of integers and a number K,
    // count the number of subarrays whose sum equals K.

    // Sample Input:
    // n = 5
    // arr = [1,2,3,2,1]
    // k = 3

    // Sample Output:
    // 2

    // Explanation:
    // Subarrays with sum 3:
    // [1,2]
    // [3]

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read size of array
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

        // Read target sum K
        int k = sc.nextInt();

        // HashMap to store prefix sum frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        // Important edge case:
        // prefix sum 0 occurs once before starting
        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {

            prefixSum += arr[i];

            // Check if (prefixSum - k) exists
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            // Update frequency of current prefix sum
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        // Output result
        System.out.println(count);

        sc.close();
    }
}