
public class maxsubarrsum {

    public static int maxSubArrSum(int[] arr, int k) {

        int sum = 0;

        // Step 1: first window sum
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int maxSum = sum;

        // Step 2: slide window
        for (int i = k; i < arr.length; i++) {
            sum += arr[i]; // add next element
            sum -= arr[i - k]; // remove first element
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 1, 3, 2 };
        int k = 3;

        System.out.println(maxSubArrSum(arr, k));
    }
}