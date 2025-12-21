package Yuvraj_DSA;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int A[] = {20,40,-2,10,50,30};
        System.out.println(Arrays.toString(A));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Element You Wanna Search From Above : ");
        int num = sc.nextInt();

        int ans = linearSearch(A,num);
        if(ans!=Integer.MIN_VALUE)
            System.out.println("Element Found At : "+ans);
        else System.out.println("Element Is Not Present");
    }
    static int linearSearch(int A[],int target){
        int n = A.length;

        for(int i=0;i<n;i++){
            if(A[i]==target)
                return i+1;
            else continue;
        }
        return Integer.MIN_VALUE;
    }
}
