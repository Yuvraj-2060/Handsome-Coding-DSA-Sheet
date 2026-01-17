package Handsome_Coding_DSA_Sheet.arrays.part1;

import java.util.ArrayList;
import java.util.List;

public class Pascal_Triangle {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> row, prev = null;

        for (int i = 0; i < numRows; i++) {
            row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(prev.get(j - 1) + prev.get(j));
                }
            }

            prev = row;
            res.add(row);
        }
        return res;
    }

    public static void main(String[] args) {
        int numRows = 5;

        List<List<Integer>> result = generate(numRows);

        // Print Pascal's Triangle
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
