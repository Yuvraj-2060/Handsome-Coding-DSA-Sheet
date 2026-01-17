package Handsome_Coding_DSA_Sheet.arrays.part1;

public class MaximumSumOfSubArray_2__Kadanes_Algo {

    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < n; i++) {
            currentSum += nums[i];

            if (currentSum > maxSum)
                maxSum = currentSum;

            if (currentSum < 0)
                currentSum = 0;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = maxSubArray(nums);
        System.out.println("Maximum Subarray Sum: " + result);
    }
}
