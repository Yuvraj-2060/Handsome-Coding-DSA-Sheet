import java.util.Arrays;

public class Insertion_Sort1 {
    public static void main(String[] args) {
        int arr[] = {4,3,5,2,1};

        System.out.println("Before Sorting :"+ Arrays.toString(arr));
        Insertion_Sort1(arr);
        System.out.println("After Sorting :"+ Arrays.toString(arr));
    }

    static  void Insertion_Sort1(int arr[]){
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = i+1; j>0; j--) {
                if(arr[j] < arr[j-1])
                    swap(arr, j,j-1);
                else
                    break;
            }
        }
    }

    static  void swap(int arr[],int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

//    1. Time Complexities
//
//        1). Worst Case Complexity: O(n2)
//            Suppose, an array is in ascending order, and you want to sort it in descending order.
//            In this case, worst case complexity occurs.
//            Each element has to be compared with each of the other elements so, for every nth element, (n-1) number of comparisons are made.
//            Thus, the total number of comparisons = n*(n-1) ~ n2
//        2). Best Case Complexity: O(n)
//             When the array is already sorted, the outer loop runs for n number of times whereas the inner loop does not run at all.
//             So, there are only n number of comparisons. Thus, complexity is linear.
//        3). Average Case Complexity: O(n2)
//             It occurs when the elements of an array are in jumbled order (neither ascending nor descending).
//
//    2. Space Complexity

//        Space complexity is O(1) because an extra variable key is used.

