package hashing;

import java.util.HashMap;
import java.util.Scanner;

public class SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int prefixSum = 0;
        int count = 0;

        // Base case
        map.put(0, 1);

        for (int num : nums) {
            prefixSum += num;

            // Check if (prefixSum - k) exists
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            // Store prefixSum
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        // Function call
        int result = subarraySum(nums, k);

        // Output
        System.out.println("Number of subarrays with sum " + k + " = " + result);

        sc.close();
    }
}