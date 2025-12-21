package Wiley_Edge_Client_Interview_Questions.Morgan_Stanley;

import java.util.Arrays;

public class ArraySortedOrNot_1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 2, 1};
        int[] arr3 = {1, 3, 2, 4, 5};

        System.out.println(Arrays.toString(arr1)+" is sorted: "+isSorted(arr1));
        System.out.println(Arrays.toString(arr2)+" is sorted: "+isSorted(arr2));
        System.out.println(Arrays.toString(arr3)+" is sorted: "+isSorted(arr3));
    }

    private static boolean isSorted(int[] arr) {
        boolean ascending = true;
        boolean descending = true;

        for(int i=1;i<arr.length;i++){
            if (arr[i - 1] > arr[i]) {
                ascending = false;
            }
            if (arr[i - 1] < arr[i]) {
                descending = false;
            }
        }
        return ascending || descending;
    }
}
