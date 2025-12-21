import java.util.Arrays;

public class Quick_Sort2 {
    public static void main(String[] args) {
        int arr[] = {3, 6, 8, 10, 1, 2, 1};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int l, int h) {
        if (l < h) {
            int j = partition(arr, l, h);
            quickSort(arr, l, j - 1);
            quickSort(arr, j + 1, h);
        }
    }
     private static int partition(int[] arr, int l, int h) {
        int pivot = arr[l];
        int i = l;
        int j = h;

        while (i < j) {
            while (i < h && arr[i] <= pivot) {
                i++;
            }
            while (j > l && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                swapNum(arr, i, j);
            }
        }
        swapNum(arr, l, j);
        return j;
    }

    private static void swapNum(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

//1. Time Complexities
//        1).Worst Case Complexity [Big-O]: O(n2)
//          It occurs when the pivot element picked is either the greatest or the smallest element.
//          This condition leads to the case in which the pivot element lies in an extreme end of the sorted array.
//          One sub-array is always empty and another sub-array contains n - 1 elements.
//          Thus, quicksort is called only on this sub-array.
//          However, the quicksort algorithm has better performance for scattered pivots.

//        2). Best Case Complexity [Big-omega]: O(n*log n)
//          It occurs when the pivot element is always the middle element or near to the middle element.

//        3). Average Case Complexity [Big-theta]: O(n*log n)
//          It occurs when the above conditions do not occur.

//2. Space Complexity
//        The space complexity for quicksort is O(log n).