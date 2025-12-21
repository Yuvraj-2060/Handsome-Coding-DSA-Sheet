package CompanyOA_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Solution4_numValidTriangles {

    public static int numValidTriangles(int[] arr) {
        int count = 0;
        Arrays.sort(arr); // Sort the array in ascending order.

        for (int i = 0; i < arr.length - 2; i++) {
            int a = arr[i];
            int k = i + 2;

            for (int j = i + 1; j < arr.length - 1; j++) {
                while (k < arr.length && arr[i] + arr[j] > arr[k]) {
                    k++;
                }
                count += k - j - 1;
            }
        }

        return count;
    }

    // Helper function to check if three sides form a valid triangle
    private static boolean isValidTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int arrayLength = scan.nextInt();

        int[] arr = new int[arrayLength];

        for (int j = 0; j < arrayLength; j++) {
            arr[j] = scan.nextInt();
        }

        int result = numValidTriangles(arr);

        System.out.println("Number of valid triangles: " + result);
    }
}
