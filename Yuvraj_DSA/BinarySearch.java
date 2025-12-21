package Yuvraj_DSA;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {-50,-18,19,40,50,60,70,80,100};
        int target = 100;
        int index = binarysearch(arr,target);

        System.out.println(target+" found at index "+index);
    }
    static int binarysearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        while(start <= end){
            //find the middle element first.
            // int mid = (start + end)/2 -----> In this there is possiblity that (start+end) may exceed the Integer limit
            int mid = start + (end-start)/2;

            if(target < arr[mid])
                end = mid-1;
            else if(target > arr[mid])
                start = mid+1;
            else
                return mid;
        }
        return -1;
    }
}
