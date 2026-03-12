import java.util.*;

public class FruitIntoBaskets {

    // Problem Description:
    // You are given an array representing fruits.
    // You can collect fruits from only two types of trees.
    // Find the maximum number of fruits you can collect.

    // Sample Input:
    // n = 3
    // fruits = [1,2,1]

    // Sample Output:
    // 3

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read number of trees
        int n = sc.nextInt();

        // Edge case: empty array
        if (n <= 0) {
            System.out.println(0);
            return;
        }

        int[] fruits = new int[n];

        // Read fruit types
        for (int i = 0; i < n; i++) {
            fruits[i] = sc.nextInt();
        }

        // Sliding window variables
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int maxFruits = 0;

        for (int right = 0; right < n; right++) {

            // Add current fruit to basket
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            // If more than 2 fruit types, shrink window
            while (map.size() > 2) {

                map.put(fruits[left], map.get(fruits[left]) - 1);

                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }

                left++;
            }

            // Update maximum fruits collected
            maxFruits = Math.max(maxFruits, right - left + 1);
        }

        // Output result
        System.out.println(maxFruits);

        sc.close();
    }
}