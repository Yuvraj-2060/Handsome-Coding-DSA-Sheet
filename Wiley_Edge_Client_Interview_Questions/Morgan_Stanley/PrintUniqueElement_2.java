package Wiley_Edge_Client_Interview_Questions.Morgan_Stanley;

import java.util.Arrays;

public class PrintUniqueElement_2 {
    public static void main (String[] args)
    {
        int arr[] = {6, 10, 5, 4,4, 9, 120, 4, 6, 10};
        int n = arr.length;
        printDistinct2(arr, n);
    }

    private static void printDistinct2(int[] arr, int n) {
        Arrays.sort(arr);

        for(int i=0;i<n;i++){
            while(i<n-1 && arr[i]==arr[i+1])
                i++;
            System.out.print(arr[i]+" ");
        }
    }
}



