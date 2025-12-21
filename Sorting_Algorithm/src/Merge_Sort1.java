import java.util.Arrays;

public class  Merge_Sort1 {
    public static void main(String[] args) {
        int arr[] = {9,2,0,10,5,60,2,10,-50,25,35};

        System.out.println("Before Sorting : "+Arrays.toString(arr));
        int newArr[] = mergeSort(arr);
        System.out.println("After Sorting : "+Arrays.toString(newArr));

    }
    static int[] mergeSort(int arr[]){
        if(arr.length==1)
            return arr;
        int mid = arr.length/2;

        int left[] = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int right[] = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] one, int[] two) {
        int[] mix = new int[one.length + two.length];

        int i=0,j=0, k=0;

        while(i<one.length && j<two.length){
            if(one[i] < two[j]){
                mix[k] = one[i];
                i++;
                k++;
            }
            else{
                mix[k] = two[j];
                j++;
                k++;
            }
        }
        while(i<one.length){
            mix[k] = one[i];
            i++;
            k++;
        }
        while(j<two.length){
            mix[k] = two[j];
            j++;
            k++;
        }

        return mix;
    }
}

//    Time Complexity:
//        1). Best Case Complexity: O(n*log n)
//
//        2). Worst Case Complexity: O(n*log n)
//
//        3). Average Case Complexity: O(n*log n)
//
//    Space Complexity:
//        The space complexity of merge sort is O(n).
