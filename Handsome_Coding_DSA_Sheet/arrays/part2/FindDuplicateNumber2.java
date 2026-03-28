package Handsome_Coding_DSA_Sheet.arrays.part2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateNumber2 {
    public static int findDuplicate(int[] arr) {
        int n = arr.length;
        // allocate frequency array initialized to 0
        int[] freq = new int[n + 1];
        // scan elements
        for (int i = 0; i < n; i++) {
            // return current value if already seen
            if (freq[arr[i]] == 0) {
                // mark as seen
                freq[arr[i]] += 1;
            } else {
                // duplicate found
                return arr[i];
            }
        }
        // fallback if none (per original)
        return 0;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,3,5};
        int duplicateNumber = findDuplicate((nums));
        System.out.println("The Duplicate Number Is: "+ duplicateNumber);

    }
}
