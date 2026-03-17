package hashing;/*
 Problem: Find All Anagrams in a String

Find all starting indices of p's anagrams in s.

 Input:
s = "cbaebabacd"
p = "abc"

 Output:
[0, 6]
*/

import java.util.*;

public class FindAllAnagramsInString {

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        int[] count = new int[26];

        for (char c : p.toCharArray()) {
            count[c - 'a']++;
        }

        int left = 0, right = 0;

        while (right < s.length()) {
            count[s.charAt(right) - 'a']--;

            while (count[s.charAt(right) - 'a'] < 0) {
                count[s.charAt(left) - 'a']++;
                left++;
            }

            if (right - left + 1 == p.length()) {
                result.add(left);
            }

            right++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(findAnagrams("cbaebabacd", "abc"));
    }
}