import java.util.*;

public class LongestOnesAfterFlip {

    // Problem Description:
    // Given a binary array, find the longest subarray of 1s
    // after flipping at most K zeros.

    // Sample Input:
    // n = 11
    // arr = [1,1,1,0,0,0,1,1,1,1,0]
    // k = 2

    // Sample Output:
    // 6

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read size of array
        int n = sc.nextInt();

        // Edge case: empty array
        if (n <= 0) {
            System.out.println(0);
            return;
        }

        int[] arr = new int[n];

        // Read array elements (should be 0 or 1)
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Read allowed number of flips
        int k = sc.nextInt();

        int left = 0;
        int zeroCount = 0;
        int maxLength = 0;

        for (int right = 0; right < n; right++) {

            // If current element is zero increase count
            if (arr[right] == 0) {
                zeroCount++;
            }

            // If zero count exceeds k shrink window
            while (zeroCount > k) {

                if (arr[left] == 0) {
                    zeroCount--;
                }

                left++;
            }

            // Update longest window
            maxLength = Math.max(maxLength, right - left + 1);
        }

        // Print result
        System.out.println(maxLength);

        sc.close();
    }
}