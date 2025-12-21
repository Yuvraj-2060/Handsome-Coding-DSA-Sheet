import java.util.*;

// 1. Time Complexities:
//        1). Worst Case Complexity: O(n2) If we want to sort in ascending order and the array is in descending order then the worst case occurs.

//        2). Best Case Complexity: O(n) If the array is already sorted, then there is no need for sorting.

//        3). Average Case Complexity: O(n2) It occurs when the elements of the array are in jumbled order (neither ascending nor descending).

// 2. Space Complexity: Space complexity is O(1) because an extra variable is used for swapping.
//                      In the optimized bubble sort algorithm, two extra variables are used. Hence, the space complexity will be O(2).

public class Bubble_Sort1 {
    public static void main(String[] args) {
        int arr[] = {9,2,0,10,5,60,2,10,-50,25,35}; //{70, 20, 30, -10, -50, 0};
        System.out.println("BEFORE SORTING ARRAY : "+Arrays.toString(arr));

        int sortedArr[] = bubbleSort(arr);
        System.out.println("SORTED ARRAY : "+Arrays.toString(sortedArr));
    }
    static int[] bubbleSort(int arr[]){

        int n = arr.length;
        boolean swapped;
        for(int i=0;i<n;i++){
            swapped = false;
            for(int j=1;j<n-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
                break;
        }
        return arr;
    }
}
