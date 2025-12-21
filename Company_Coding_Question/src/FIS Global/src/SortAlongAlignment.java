//public class SortAlongAlignment {
//}
import java.util.Arrays;

public class SortAlongAlignment {
    public static void main(String[] args) {
        int[] arr1 = {10, 5, 2, 15, 1};
        char[] arr2 = {'A', 'B', 'C', 'D', 'E'};

        // Create an array of indices to maintain the original order
        Integer[] indices = new Integer[arr1.length];
        for (int i = 0; i < indices.length; i++) {
            indices[i] = i;
        }

        // Sort the indices based on the values of arr1
        Arrays.sort(indices, (a, b) -> Integer.compare(arr1[a], arr1[b]));

        // Create sorted arrays using the sorted indices
        int[] arr1Sorted = new int[arr1.length];
        char[] arr2Sorted = new char[arr2.length];

        for (int i = 0; i < indices.length; i++) {
            arr1Sorted[i] = arr1[indices[i]];
            arr2Sorted[i] = arr2[indices[i]];
        }

        // Print the sorted arrays
        System.out.println("Sorted arr1: " + Arrays.toString(arr1Sorted));
        System.out.println("Corresponding arr2: " + Arrays.toString(arr2Sorted));
    }
}
