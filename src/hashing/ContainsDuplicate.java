package hashing;/*
 Problem: Contains Duplicate

Given an integer array nums, return true if any value appears at least twice.

 Sample Input:
n = 5
nums = [1,2,3,1]

 Output:
true
*/

import java.util.*;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
}