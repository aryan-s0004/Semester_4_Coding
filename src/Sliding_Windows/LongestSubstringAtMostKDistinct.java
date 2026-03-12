import java.util.*;

public class LongestSubstringAtMostKDistinct {

    // Problem Description:
    // Find the length of the longest substring
    // with at most K distinct characters.

    // Sample Input:
    // s = "eceba"
    // k = 2

    // Sample Output:
    // 3

    public static int longestSubstring(String s, int k) {

        // Edge case: empty string or k = 0
        if (s == null || s.length() == 0 || k == 0) {
            return 0;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            // Add current character to map
            char current = s.charAt(right);
            map.put(current, map.getOrDefault(current, 0) + 1);

            // If distinct characters exceed k, shrink window
            while (map.size() > k) {

                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);

                // Remove character if frequency becomes zero
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }

                left++;
            }

            // Update maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read string
        String s = sc.next();

        // Read k
        int k = sc.nextInt();

        int result = longestSubstring(s, k);

        System.out.println(result);

        sc.close();
    }
}