package SEMESTER_4.Competetive_Coding_Sem4;

import java.util.Scanner;

public class Diagonal_difference {

    // Method to calculate absolute diagonal difference
    public static int diagonalDifference(int[][] arr) {

        int n = arr.length;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];           // Primary diagonal
            sum2 += arr[i][n - 1 - i];   // Secondary diagonal
        }

        return Math.abs(sum1 - sum2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of square matrix:");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        System.out.println("Enter matrix elements row-wise:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int result = diagonalDifference(arr);

        System.out.println("Absolute diagonal difference = " + result);

        sc.close();
    }
}