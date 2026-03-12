import java.util.*;

public class LongestRepeatingCharReplacement {

    // Problem Description:
    // Given a string and an integer K,
    // you can replace at most K characters.
    // Find the length of the longest substring
    // containing the same letter.

    // Sample Input:
    // s = "AABABBA"
    // k = 1

    // Sample Output:
    // 4

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read string
        String s = sc.next();

        // Edge case: empty string
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }

        // Read allowed replacements
        int k = sc.nextInt();

        int left = 0;
        int maxLength = 0;
        int maxFreq = 0;

        // Frequency array for A-Z characters
        int[] freq = new int[26];

        for (int right = 0; right < s.length(); right++) {

            // Increase frequency of current character
            freq[s.charAt(right) - 'A']++;

            // Track most frequent character in window
            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

            // If replacements needed exceed k, shrink window
            while ((right - left + 1) - maxFreq > k) {

                freq[s.charAt(left) - 'A']--;
                left++;
            }

            // Update maximum valid window length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        // Print result
        System.out.println(maxLength);

        sc.close();
    }
}
