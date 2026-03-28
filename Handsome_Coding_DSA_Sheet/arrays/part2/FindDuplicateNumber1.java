package Handsome_Coding_DSA_Sheet.arrays.part2;
import java.util.*;

public class FindDuplicateNumber1 {
        public static int findDuplicate(List<Integer> nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
                if (map.get(num) > 1) {
                    return num; // Found duplicate
                }
            }
            return 0; // No duplicate found
        }


    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,2,5);
        int duplicateNumber = findDuplicate((nums));
        System.out.println("The Duplicate Number Is: "+ duplicateNumber);

    }
}
