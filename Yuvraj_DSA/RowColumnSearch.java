package Yuvraj_DSA;

import java.util.Arrays;

public class RowColumnSearch {
    public static void main(String[] args) {
        // This below Matrix is row & column wise sorted.
        int[][] mat ={
                {10,20,30,40},
                {11,25,35,45},
                {28,29,37,49},
                {33,38,39,50}
        };
        int target = 50;
        int ans[] = search(mat,target);

        System.out.println(target+" is present at : "+Arrays.toString(ans));
    }
    static int[] search(int arr[][], int target){
        int r = 0;
        int c = arr.length-1;

        while( r < arr.length && c >= 0){
            if(arr[r][c] == target)
                return new int[]{r,c};
            if(target < arr[r][c])
                c--;
            else
                r++;
        }
        return new int[]{-1,-1};
    }
}
