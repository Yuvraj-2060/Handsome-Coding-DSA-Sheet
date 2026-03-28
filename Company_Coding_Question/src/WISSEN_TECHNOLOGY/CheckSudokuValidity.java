package WISSEN_TECHNOLOGY;

/******************************************************************************
 Check validity of sudoku problem:
 Determine if a 9 x 9 Sudoku board is valid.
 The rules that need to be checked if the Sudoku grid is valid are :
 1.Each row must contain the digits 1-9 without repetition.
 2.Each column must contain the digits 1-9 without repetition.
 3.Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.

 Example 1 :
 {{'5','3','.','.','7','.','.','.','.'},
 {'6','.','.','1','9','5','.','.','.'},
 {'.','9','8','.','.','.','.','6','.'},
 {'8','.','.','.','6','.','.','.','3'},
 {'4','.','.','8','.','3','.','.','1'},
 {'7','.','.','.','2','.','.','.','6'},
 {'.','6','.','.','.','.','2','8','.'},
 {'.','.','.','4','1','9','.','.','5'},
 {'.','.','.','.','8','.','.','7','9'}}
 Output: true

 Example 2 :
 {{'8','3','.','.','7','.','.','.','.'},
 {'6','.','.','1','9','5','.','.','.'},
 {'.','9','8','.','.','.','.','6','.'},
 {'8','.','.','.','6','.','.','.','3'},
 {'4','.','.','8','.','3','.','.','1'},
 {'7','.','.','.','2','.','.','.','6'},
 {'.','6','.','.','.','.','2','8','.'},
 {'.','.','.','4','1','9','.','.','5'},
 {'.','.','.','.','8','.','.','7','9'}}
 Output: false

 *******************************************************************************/
import java.util.*;

public class CheckSudokuValidity
{
    public static void main(String[] args) {
        char[][] inputSudoku = new char[][]
                {{'5','3','.','.','7','.','.','.','.'},
                        {'6','.','.','1','9','5','.','.','.'},
                        {'.','9','8','.','.','.','.','6','.'},
                        {'8','.','.','.','6','.','.','.','3'},
                        {'4','.','.','8','.','3','.','.','1'},
                        {'7','.','.','.','2','.','.','.','6'},
                        {'.','6','.','.','.','.','2','8','.'},
                        {'.','.','.','4','1','9','.','.','5'},
                        {'.','.','.','.','8','.','.','7','9'}};
        //Expected answer is : true

        boolean isSudokuValid = checkSudokuValidity(inputSudoku);
        System.out.println("Is given sudoku problem vablid ? : " + isSudokuValid);
    }

    static boolean checkSudokuValidity(char[][] inputSudoku){
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        for( int i=0; i<9; i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for(int r=0; r<9; r++){
            for(int c =0; c<9; c++){
                char value = inputSudoku[r][c];

                if(value == '.')
                    continue;
                if(!rows[r].add(value)) return false;
                if(!cols[c].add(value)) return false;

                int boxIndice = (r/3)*3 + (c/3); //
                if(!boxes[boxIndice].add(value)) return false;
            }
        }

        return true;
    }
}











