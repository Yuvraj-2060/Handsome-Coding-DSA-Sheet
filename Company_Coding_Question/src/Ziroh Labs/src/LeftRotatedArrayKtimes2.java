import java.util.Arrays;

public class LeftRotatedArrayKtimes2 {
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int N = arr.length;
        int d = 2;// Rotate 2 times
        System.out.println("Array Before Rotation: "+ Arrays.toString(arr));
        rotateLeft(arr, d, N);// Function call
    }
    public static void rotateLeft(int arr[], int d, int n){
        d = d%n;
        int p=1;

        while(p<=d){
            int last = arr[0];
            for(int i=0;i<n-1;i++){
                arr[i]=arr[i+1];
            }
            arr[n-1]=last;
            p++;
        }
        System.out.println("After "+d+" times left rotation: "+Arrays.toString(arr));
    }
}
