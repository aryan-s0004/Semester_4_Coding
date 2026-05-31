package hashing;

import java.util.*;

public class CountSubarraysDivisibleByK__A {

    public static int arraysDivByK(int[] nums, int k) {

/*
 Problem: Count Subarrays Divisible by K

Find number of subarrays whose sum is divisible by k.

 Sample Input:
nums = [4,5,0,-2,-3,1], k = 5

 Output:
7
*/
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        int sum = 0, count = 0;

        for (int num : nums) {
            sum += num;

            int mod = sum % k;
            if (mod < 0) mod += k;

            if (map.containsKey(mod)) {
                count += map.get(mod);
            }

            map.put(mod, map.getOrDefault(mod,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,0,-2,-3,1};
        int k = 5;

        System.out.println(arraysDivByK(nums, k));
    }
}