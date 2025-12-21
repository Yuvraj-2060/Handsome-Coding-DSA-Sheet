package Wiley_Edge_Client_Interview_Questions.Morgan_Stanley;

// Time Complexity: O(N) & Spcae Complexity: O(1) constant space.


public class SortArrayWithNegatives_2 {
    public static void main(String[] args) {
        int[] arr = {2, -3, 5, -8, 1, -4, 6, -7};
        sortArrayOptimizedForce(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    private static void sortArrayOptimizedForce(int[] arr) {
        int left =0;
        int right = arr.length-1;

        while(left<=right){
            if(arr[left]<0 && arr[right]>0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++; right++;
            }
            else{
                if(arr[left]>0) left++;
                if(arr[right]<0) right--;
            }
        }
    }
}

//while (left <= right) {
//        if (arr[left] > 0) {
//            left++;
//        } else if (arr[right] <= 0) {
//            right--;
//        }
//        else { // Swap negative and positive elements
//
//            int temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//            left++;
//            right--;
//        }
//}
