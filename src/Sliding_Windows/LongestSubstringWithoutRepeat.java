package Sliding_Windows;

import java.util.*;

public class LongestSubstringWithoutRepeat {

    // PROBLEM DESCRIPTION
    // -------------------
    // Given a string s, find the length of the longest substring
    // without repeating characters.

    // SAMPLE INPUT
    // ------------
    // s = "abcabcbb"

    // SAMPLE OUTPUT
    // -------------
    // 3

    // EXPLANATION
    // -----------
    // Longest substring without repeating characters is "abc"
    // Length = 3

    // TIME COMPLEXITY
    // ---------------
    // O(n)

    // SPACE COMPLEXITY
    // ----------------
    // O(k) where k = character set size

    public static int longestSubstring(String s) {

        // Edge case
        if (s == null || s.length() == 0)
            return 0;

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            // If duplicate found, shrink window
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add current character
            set.add(s.charAt(right));

            // Update max length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read string input
        String s = sc.next();

        int result = longestSubstring(s);

        System.out.println(result);

        sc.close();
    }
}