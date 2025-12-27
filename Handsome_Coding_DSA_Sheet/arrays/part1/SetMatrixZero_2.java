package Handsome_Coding_DSA_Sheet.arrays.part1;

import java.util.Arrays;

public class SetMatrixZero_2 {

    public static int[][] setZero(int[][] mat){

        int row = mat.length;
        int col = mat[0].length;

        int r[] = new int[row];
        int c[] = new int[col];

        Arrays.fill(r, 1);
        Arrays.fill(c, 1);

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++)
                if(mat[i][j] == 0){
                    r[i]=0; c[j]=0;
                }
        }
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col; j++) {
                if(r[i]==0 || c[j]==0){
                    mat[i][j] =0;
                }
            }
        }
        return mat;
    }

    public static void main(String[] args) {

        int arr[][] ={{0,1,2,0}, {3,4,5,2}, {1,3,1,5}};
        int updatedMatrix[][] = setZero(arr);
        System.out.println("Updated Matrix : "+ Arrays.deepToString(updatedMatrix));
    }

}
