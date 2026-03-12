import java.util.*;

public class PermutationInString {

    // PROBLEM DESCRIPTION
    // -------------------
    // Check if string s2 contains a permutation of string s1.

    // SAMPLE INPUT
    // ------------
    // s1 = "ab"
    // s2 = "eidbaooo"

    // SAMPLE OUTPUT
    // -------------
    // true

    // EXPLANATION
    // -----------
    // The substring "ba" in s2 is a permutation of "ab".

    // TIME COMPLEXITY
    // ---------------
    // O(n)

    // SPACE COMPLEXITY
    // ----------------
    // O(1) because character set size is fixed (26)

    public static boolean checkPermutation(String s1, String s2){

        // Edge case
        if(s1.length() > s2.length())
            return false;

        int[] freq = new int[26];

        // Store frequency of characters in s1
        for(char c : s1.toCharArray())
            freq[c - 'a']++;

        int windowSize = s1.length();
        int left = 0;

        for(int right = 0; right < s2.length(); right++){

            // Include current character
            freq[s2.charAt(right) - 'a']--;

            // If window size exceeds required size, move left
            if(right - left + 1 > windowSize){
                freq[s2.charAt(left) - 'a']++;
                left++;
            }

            // Check if all frequencies are zero
            if(allZero(freq))
                return true;
        }

        return false;
    }

    // Helper method to check if all counts are zero
    public static boolean allZero(int[] freq){
        for(int num : freq){
            if(num != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // Read input strings
        String s1 = sc.next();
        String s2 = sc.next();

        boolean result = checkPermutation(s1, s2);

        System.out.println(result);

        sc.close();
    }
}