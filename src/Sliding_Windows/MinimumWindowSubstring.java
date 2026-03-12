import java.util.*;

public class MinimumWindowSubstring {

    // PROBLEM DESCRIPTION
    // -------------------
    // Find the smallest substring in string s
    // that contains all characters of string t.

    // SAMPLE INPUT
    // ------------
    // s = "ADOBECODEBANC"
    // t = "ABC"

    // SAMPLE OUTPUT
    // -------------
    // BANC

    // EXPLANATION
    // -----------
    // "BANC" is the smallest substring containing A, B, and C.

    // TIME COMPLEXITY
    // ---------------
    // O(n)

    // SPACE COMPLEXITY
    // ----------------
    // O(1) since character set is limited

    public static String minWindow(String s, String t) {

        // Edge cases
        if (s == null || t == null || s.length() < t.length())
            return "";

        int[] freq = new int[128];

        // Store required character frequencies
        for (char c : t.toCharArray())
            freq[c]++;

        int left = 0;
        int count = t.length();

        int minLength = Integer.MAX_VALUE;
        int startIndex = 0;

        for (int right = 0; right < s.length(); right++) {

            // If character needed, decrease count
            if (freq[s.charAt(right)] > 0)
                count--;

            freq[s.charAt(right)]--;

            // When all characters are found
            while (count == 0) {

                // Update smallest window
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    startIndex = left;
                }

                // Move left pointer
                freq[s.charAt(left)]++;

                if (freq[s.charAt(left)] > 0)
                    count++;

                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE)
            return "";

        return s.substring(startIndex, startIndex + minLength);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read string s
        String s = sc.next();

        // Read string t
        String t = sc.next();

        String result = minWindow(s, t);

        System.out.println(result);

        sc.close();
    }
}