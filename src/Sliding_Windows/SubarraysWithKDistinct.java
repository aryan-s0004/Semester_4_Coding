import java.util.*;

public class SubarraysWithKDistinct {

    // PROBLEM DESCRIPTION
    // -------------------
    // Count the number of subarrays
    // containing exactly K distinct integers.

    // SAMPLE INPUT
    // ------------
    // arr = [1,2,1,2,3]
    // k = 2

    // SAMPLE OUTPUT
    // -------------
    // 7

    // EXPLANATION
    // -----------
    // Valid subarrays:
    // [1,2]
    // [2,1]
    // [1,2]
    // [2,3]
    // [1,2,1]
    // [2,1,2]
    // [1,2,1,2]

    // TIME COMPLEXITY
    // ---------------
    // O(n)

    // SPACE COMPLEXITY
    // ----------------
    // O(k)

    public static int subarraysWithKDistinct(int[] arr, int k) {

        return atMostK(arr, k) - atMostK(arr, k - 1);
    }

    // Helper function to count subarrays with at most K distinct numbers
    public static int atMostK(int[] arr, int k) {

        if (k < 0)
            return 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int count = 0;

        for (int right = 0; right < arr.length; right++) {

            // Add current element
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);

            // Shrink window if distinct elements exceed k
            while (map.size() > k) {

                map.put(arr[left], map.get(arr[left]) - 1);

                if (map.get(arr[left]) == 0)
                    map.remove(arr[left]);

                left++;
            }

            // Add number of valid subarrays
            count += right - left + 1;
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,1,2,3};
        int k = 2;

        int result = subarraysWithKDistinct(arr, k);

        System.out.println(result);
    }
}