import java.util.Arrays;

public class Selection_Sort1 {
    public static void main(String[] args) {
        int arr[] = {9,2,0,10,5,60,2,10,-50,25,35}; //{70, 20, 30, -10, -50, 0};
        System.out.println("BEFORE SORTING ARRAY : "+ Arrays.toString(arr));

        selectionSort(arr);
        System.out.println("SORTED ARRAY : "+Arrays.toString(arr));
    }
    static void selectionSort(int arr[]){

        for(int i=0;i<arr.length;i++){
           int last = arr.length-i-1;
           int maxIndex = getMaxIndex(arr,0, last);
           swap(arr,maxIndex,last);
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int last) {
        int max = start;
        for(int i=start;i<= last;i++){
            if(arr[max]<arr[i])
                max = i;
        }
        return  max;
    }
}

