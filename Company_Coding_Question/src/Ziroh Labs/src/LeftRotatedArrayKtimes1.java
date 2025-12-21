import java.util.Arrays;

public class LeftRotatedArrayKtimes1 {
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int N = arr.length;
        int d = 2;// Rotate 2 times
        System.out.println("Array Before Rotation: "+Arrays.toString(arr));
        rotate(arr, d, N);// Function call
    }

    private static void rotate(int[] arr, int d, int n) {
        d= d%n;
        int k=0;
        int temp[] = new int[n];
        for(int i=d;i<n;i++){
            temp[k++]= arr[i];
        }
        for(int i=0;i<d;i++){
            temp[k++]=arr[i];
        }
        System.out.println("After "+d+" times rotation the array is: "+ Arrays.toString(temp));
    }
}
