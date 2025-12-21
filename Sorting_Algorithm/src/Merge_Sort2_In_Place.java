import java.util.Arrays;

public class Merge_Sort2_In_Place {
    public static void main(String[] args) {
        int arr[] = {9, 2, 0, 10, 5, 60, 2, 10, -50, 25, 35};

        System.out.println("Before Sorting : " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("After Sorting : " + Arrays.toString(arr));
    }

    static void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            mergeInPlace(arr, left, mid, right);
        }
    }

    private static void mergeInPlace(int[] arr, int left, int mid, int right) {
        // Sizes of the two subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temporary arrays to hold the subarrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temporary arrays L[] and R[]
        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        // Merge the temporary arrays back into arr[]
        int i = 0, j = 0;

        // Initial index of merged subarray
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

}
