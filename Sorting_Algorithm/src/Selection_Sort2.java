import java.util.Arrays;

public class Selection_Sort2 {

    public static int[] sort(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {4,3,5,2,1};

        System.out.println("Before Sorting :"+ Arrays.toString(arr));

        System.out.println("After Sorting :"+ Arrays.toString(sort(arr)));
    }
}

//    1> Time Complexities:
//
//        1). Worst Case Complexity: O(n2):  If we want to sort in ascending order and the array is in descending order then, the worst case occurs.
//        2). Best Case Complexity: O(n2):   It occurs when the array is already sorted
//        3). Average Case Complexity: O(n2): It occurs when the elements of the array are in jumbled order (neither ascending nor descending).

//    2> Space Complexity:  Space complexity is O(1) because an extra variable temp is used.