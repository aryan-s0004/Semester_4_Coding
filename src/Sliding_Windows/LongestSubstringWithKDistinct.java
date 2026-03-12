import java.util.*;

public class LongestSubstringWithKDistinct {

    // Problem Description:
    // Find the longest substring
    // containing exactly K distinct characters.

    // Sample Input:
    // s = "aabacbebebe"
    // k = 3

    // Sample Output:
    // 7

    public static int longestSubstring(String s, int k) {

        // Edge cases
        if (s == null || s.length() == 0 || k <= 0) {
            return 0;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            // Expand window
            char current = s.charAt(right);
            map.put(current, map.getOrDefault(current, 0) + 1);

            // Shrink window if distinct characters exceed k
            while (map.size() > k) {

                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }

                left++;
            }

            // Update result only when exactly k distinct characters
            if (map.size() == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
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