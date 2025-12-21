package Wiley_Edge_Client_Interview_Questions.Morgan_Stanley;

import java.util.Arrays;

public class ArraySortedOrNot_2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 2, 1};
        int[] arr3 = {1, 3, 2, 4, 5};

        System.out.println(Arrays.toString(arr1)+" is sorted: "+isSorted(arr1));
        System.out.println(Arrays.toString(arr2)+" is sorted: "+isSorted(arr2));
        System.out.println(Arrays.toString(arr3)+" is sorted: "+isSorted(arr3));
    }

    private static boolean isSorted(int[] arr) {
        int ascendingMask = 0; // Ascending mask
        int descendingMask = 0; // Descending mask

        for (int i = 1; i < arr.length; i++) {
            ascendingMask |= (arr[i - 1] <= arr[i]) ? 1 : 0; // Set bit if ascending
            descendingMask |= (arr[i - 1] >= arr[i]) ? 1 : 0; // Set bit if descending
        }

        return (ascendingMask == 0 || descendingMask == 0);
    }
}
