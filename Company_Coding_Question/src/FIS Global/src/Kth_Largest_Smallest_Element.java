/*
This logic is valid only when there is no duplicate elements presents.
*/
import java.util.Arrays;
public class Kth_Largest_Smallest_Element {

    static int Kmin(int arr[], int n, int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
    static int Kmax(int arr[], int n, int k){
        return arr[n-k];
    }
    public static void main(String[] args) {
        int arr[] = {7, 10, 4, 3, 11, 15};
        int n= arr.length;
        int k=2;

        System.out.println("The Kth Smallest Element Is: "+Kmin(arr,n,k));
        System.out.println("The Kth Largest Element Is: "+Kmax(arr,n,k));
    }
}
