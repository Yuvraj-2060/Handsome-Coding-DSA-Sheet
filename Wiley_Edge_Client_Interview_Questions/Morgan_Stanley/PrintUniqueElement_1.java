package Wiley_Edge_Client_Interview_Questions.Morgan_Stanley;

public class PrintUniqueElement_1 {
    public static void main (String[] args)
    {
        int arr[] = {6, 10, 5, 4,4, 9, 120, 4, 6, 10};
        int n = arr.length;
        printDistinct1(arr, n);
    }

    private static void printDistinct1(int[] arr, int n) {

        for(int i=0;i<n;i++){
            int j;
            for(j=0;j<i;j++)
                if(arr[i]==arr[j])
                    break;
            if(i==j)
                System.out.print(arr[i]+" ");
        }
    }
}
