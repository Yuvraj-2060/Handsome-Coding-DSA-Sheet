package Wiley_Edge_Client_Interview_Questions.Morgan_Stanley;

// Time Complexity: O(N2) & Spcae Complexity: O(1) constant space.
public class SortArrayWithNegatives_1 {
    public static void main(String[] args) {
        int[] arr = {2, -3, 5, -8, 1, -4, 6, -7};
        sortArrayBruteForce(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    static void sortArrayBruteForce(int []arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<0 && arr[j+1]>0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
