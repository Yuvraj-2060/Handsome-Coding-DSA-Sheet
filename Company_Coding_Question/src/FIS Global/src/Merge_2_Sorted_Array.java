public class Merge_2_Sorted_Array {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9,10,15};
        int[] arr2 = {2, 4, 6, 8};

        int[] mergedArray = mergeSortedArrays(arr1, arr2);

        System.out.println("Merged Sorted Array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] mergedArray = new int[len1 + len2];

        int i = 0, j = 0, k = 0;

        while (i < len1 && j < len2) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        // Copy the remaining elements of arr1, if any
        while (i < len1) {
            mergedArray[k++] = arr1[i++];
        }

        // Copy the remaining elements of arr2, if any
        while (j < len2) {
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;
    }
}
